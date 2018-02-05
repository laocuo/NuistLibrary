package com.nuist.library.destine.room;

import android.view.View;

import com.nuist.library.R;
import com.nuist.library.base.BaseFragment;
import com.nuist.library.destine.IDestineInterface;
import com.nuist.library.destine.Room;

import butterknife.BindView;
import butterknife.OnClick;


public class RoomShowFragment extends BaseFragment implements View.OnClickListener {
    private IDestineInterface mIDestineInterface;

    public static RoomShowFragment newInstance(IDestineInterface anInterface) {
        RoomShowFragment fragment = new RoomShowFragment();
        fragment.setIDestineInterface(anInterface);
        return fragment;
    }

    @BindView(R.id.room201)
    Room mRoom201;

    @BindView(R.id.room206)
    Room mRoom206;

    @BindView(R.id.room208)
    Room mRoom208;

    @BindView(R.id.room302)
    Room mRoom302;

    @BindView(R.id.room306)
    Room mRoom306;

    @BindView(R.id.room309)
    Room mRoom309;

    @BindView(R.id.room311)
    Room mRoom311;

    @BindView(R.id.room401)
    Room mRoom401;

    @BindView(R.id.room403)
    Room mRoom403;

    @BindView(R.id.room406)
    Room mRoom406;

    @BindView(R.id.room408)
    Room mRoom408;

    @BindView(R.id.room501)
    Room mRoom501;

    @BindView(R.id.room503)
    Room mRoom503;

    @BindView(R.id.room510)
    Room mRoom510;

    @BindView(R.id.room601)
    Room mRoom601;

    @BindView(R.id.room603)
    Room mRoom603;

    @BindView(R.id.room606)
    Room mRoom606;

    @BindView(R.id.room608)
    Room mRoom608;

    @BindView(R.id.room610)
    Room mRoom610;

    @BindView(R.id.room719)
    Room mRoom719;

    @BindView(R.id.room727)
    Room mRoom727;

    private Room mSelectedRoom;

    @Override
    protected int getLayoutId() {
        return R.layout.fragment_room;
    }

    @Override
    protected void doInject() {

    }

    @Override
    protected void doInit() {
        mRoom201.setRoomName("201~202");
        mRoom201.setSelected(true);
        mSelectedRoom = mRoom201;
        mIDestineInterface.setSelectedRoomName("201~202");

        mRoom201.setOnClickListener(this);
        mRoom206.setRoomName("206~207");
        mRoom206.setOnClickListener(this);
        mRoom208.setRoomName("208~209");
        mRoom208.setOnClickListener(this);
        mRoom302.setRoomName("302");
        mRoom302.setOnClickListener(this);
        mRoom306.setRoomName("306~307");
        mRoom306.setOnClickListener(this);
        mRoom309.setRoomName("309~310");
        mRoom309.setOnClickListener(this);
        mRoom311.setRoomName("311~312");
        mRoom311.setOnClickListener(this);
        mRoom401.setRoomName("401~402");
        mRoom401.setOnClickListener(this);
        mRoom403.setRoomName("403~404");
        mRoom403.setOnClickListener(this);
        mRoom406.setRoomName("406~407");
        mRoom406.setOnClickListener(this);
        mRoom408.setRoomName("408~409");
        mRoom408.setOnClickListener(this);
        mRoom501.setRoomName("501~502");
        mRoom501.setOnClickListener(this);
        mRoom503.setRoomName("503~504");
        mRoom503.setOnClickListener(this);
        mRoom510.setRoomName("510~511");
        mRoom510.setOnClickListener(this);
        mRoom601.setRoomName("601~602");
        mRoom601.setOnClickListener(this);
        mRoom603.setRoomName("603~604");
        mRoom603.setOnClickListener(this);
        mRoom606.setRoomName("606~607");
        mRoom606.setOnClickListener(this);
        mRoom608.setRoomName("608~609");
        mRoom608.setOnClickListener(this);
        mRoom610.setRoomName("610~611");
        mRoom610.setOnClickListener(this);
        mRoom719.setRoomName("719~720");
        mRoom719.setOnClickListener(this);
        mRoom727.setRoomName("727");
        mRoom727.setOnClickListener(this);
    }

    @Override
    protected void getData(boolean isRefresh) {

    }

    @Override
    public void onClick(View v) {
//        int id = v.getId();
        if (v != mSelectedRoom) {
            mSelectedRoom.setSelected(false);
            mSelectedRoom = (Room) v;
            mSelectedRoom.setSelected(true);
            mIDestineInterface.setSelectedRoomName(mSelectedRoom.getRoomName());
        }
    }

    @OnClick(R.id.desktops_layout)
    void desktopsLayout() {
        mIDestineInterface.showDesk();
    }

    public void setIDestineInterface(IDestineInterface IGraduationInterface) {
        mIDestineInterface = IGraduationInterface;
    }
}
