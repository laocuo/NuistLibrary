package com.nuist.library.destine;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.Toolbar;

import com.nuist.library.R;
import com.nuist.library.base.BaseActivity;
import com.nuist.library.destine.desk.DeskShowFragment;
import com.nuist.library.destine.room.RoomShowFragment;

import javax.inject.Inject;

import butterknife.BindView;


public class DestineActivity extends BaseActivity<DestinePresenter>
        implements IDestineInterface{

    @Inject
    RoomShowFragment mRoomShowFragment;
    @Inject
    DeskShowFragment mDestShowFragment;

    public static void launch(Context context) {
        Intent intent = new Intent(context, DestineActivity.class);
        context.startActivity(intent);
        ((Activity)context).overridePendingTransition(R.anim.slide_right_entry, R.anim.hold);
    }

    @BindView(R.id.toolbar)
    Toolbar mToolbar;

    @Override
    protected int getLayoutId() {
        return R.layout.activity_destine;
    }

    private String mSelectedRoomName;

    @Override
    protected void doInject() {
        DaggerDestineComponent.builder()
                .destineModule(new DestineModule(this))
                .build()
                .inject(this);
    }

    @Override
    protected void doInit() {
        initToolBar(mToolbar, true, "预约位置(阅览室)");
        addFragment(R.id.container, mRoomShowFragment);
    }

    @Override
    protected void getData(boolean isRefresh) {

    }

    @Override
    public void exit() {
        finish();
    }

    @Override
    public void showRoom() {
        replaceFragment(R.id.container, mRoomShowFragment);
    }

    @Override
    public void showDesk() {
        mDestShowFragment.updateSelectedRoomName();
        replaceFragment(R.id.container, mDestShowFragment);
    }

    @Override
    public void setSelectedRoomName(String roomName) {
        mSelectedRoomName = roomName;
    }

    @Override
    public String getSelectedRoomName() {
        return mSelectedRoomName;
    }

    @Override
    public void onBackPressed() {
        finish();
    }

    @Override
    public void finish() {
        super.finish();
        overridePendingTransition(R.anim.hold, R.anim.slide_right_exit);
    }
}
