/*
 *
 *  * Copyright (C) 2017 laocuo <laocuo@163.com>
 *  *
 *  * Licensed under the Apache License, Version 2.0 (the "License");
 *  * you may not use this file except in compliance with the License.
 *  * You may obtain a copy of the License at
 *  *
 *  *      http://www.apache.org/licenses/LICENSE-2.0
 *  *
 *  * Unless required by applicable law or agreed to in writing, software
 *  * distributed under the License is distributed on an "AS IS" BASIS,
 *  * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  * See the License for the specific language governing permissions and
 *  * limitations under the License.
 *
 */

package com.nuist.library.main.bulletin;

import android.os.Bundle;
import android.support.annotation.Nullable;

import com.nuist.library.R;
import com.nuist.library.base.BaseFragment;


public class BulletinFragment extends BaseFragment {
    private static final String TYPE_KEY = "TypeKey";
    private String mTitle;

    public static BulletinFragment newInstance() {
        BulletinFragment fragment = new BulletinFragment();
        return fragment;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mTitle = getArguments().getString(TYPE_KEY);
        }
    }

    @Override
    protected int getLayoutId() {
        return R.layout.fragment_bulletin;
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
