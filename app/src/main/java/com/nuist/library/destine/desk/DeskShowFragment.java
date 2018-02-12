package com.nuist.library.destine.desk;

import com.nuist.library.R;
import com.nuist.library.base.BaseFragment;
import com.nuist.library.destine.DeskLayout;
import com.nuist.library.destine.IDestineInterface;

import butterknife.BindView;
import butterknife.OnClick;


public class DeskShowFragment extends BaseFragment {
    private IDestineInterface mIDestineInterface;

    public static DeskShowFragment newInstance(IDestineInterface anInterface) {
        DeskShowFragment fragment = new DeskShowFragment();
        fragment.setIDestineInterface(anInterface);
        return fragment;
    }

    @BindView(R.id.desklayout)
    DeskLayout mDeskLayout;

    @Override
    protected int getLayoutId() {
        return R.layout.fragment_desk;
    }

    @Override
    protected void doInject() {

    }

    @Override
    protected void doInit() {
        mDeskLayout.setSelectedRoomName(mIDestineInterface.getSelectedRoomName());
    }

    @Override
    protected void getData(boolean isRefresh) {

    }

    @OnClick(R.id.rooms_layout)
    void roomsLayout() {
        mIDestineInterface.showRoom();
    }

    public void setIDestineInterface(IDestineInterface IGraduationInterface) {
        mIDestineInterface = IGraduationInterface;
    }

    public void updateSelectedRoomName() {
        if (mDeskLayout != null) {
            mDeskLayout.setSelectedRoomName(mIDestineInterface.getSelectedRoomName());
        }
    }
}
