package com.nuist.library.scancode;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;

import com.nuist.library.R;
import com.nuist.library.base.BaseActivity;


public class ScancodeActivity extends BaseActivity {

    public static void launch(Context context) {
        Intent intent = new Intent(context, ScancodeActivity.class);
        context.startActivity(intent);
        ((Activity)context).overridePendingTransition(R.anim.slide_right_entry, R.anim.hold);
    }

    @Override
    protected int getLayoutId() {
        return R.layout.activity_scancode;
    }

    @Override
    protected void doInject() {

    }

    @Override
    protected void doInit() {

    }

    @Override
    protected void getData(boolean isRefresh) {

    }
}
