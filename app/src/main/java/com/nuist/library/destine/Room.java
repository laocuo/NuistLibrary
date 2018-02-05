package com.nuist.library.destine;

import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.nuist.library.R;


public class Room extends LinearLayout {
    private Context mContext;
    private TextView mRoomName;
    private TextView mSpaceNumber;

    public Room(Context context) {
        this(context, null);
    }

    public Room(Context context, AttributeSet attrs) {
        super(context, attrs);
        mContext = context;
        init();
    }

    private void init() {
        setOrientation(VERTICAL);
        setGravity(Gravity.CENTER_HORIZONTAL);
        setBackgroundColor(getResources().getColor(R.color.colorPrimary));
        setPadding(0, 10, 0, 10);
        mRoomName = new TextView(mContext);
        mRoomName.setTextColor(Color.WHITE);
        addView(mRoomName, new ViewGroup.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT));
        mSpaceNumber = new TextView(mContext);
        mSpaceNumber.setTextColor(Color.WHITE);
        mSpaceNumber.setText("剩余( )");
        addView(mSpaceNumber, new ViewGroup.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT));
    }

    public void setRoomName(String name) {
        mRoomName.setText(name);
    }

    public String getRoomName() {
        return mRoomName.getText().toString();
    }

    public void setSpaceNumber(int number) {
        if (number < 0 || number > 4) {
            return;
        }
        mSpaceNumber.setText("剩余(" + number + ")");
    }

    public void setSelected(boolean isSelected) {
        if (isSelected) {
            setBackgroundColor(getResources().getColor(R.color.colorSelected));
        } else {
            setBackgroundColor(getResources().getColor(R.color.colorPrimary));
        }
    }
}
