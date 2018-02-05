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

package com.nuist.library.main;

import android.support.v4.app.FragmentManager;

import com.nuist.library.base.IBaseView;
import com.nuist.library.base.ViewPagerAdapter;
import com.nuist.library.main.bulletin.BulletinFragment;
import com.nuist.library.main.homepage.HomePageFragment;
import com.nuist.library.main.my.MyFragment;

import dagger.Module;
import dagger.Provides;


@Module
public class MainModule {
    private MainActivity mMainActivity;
    public MainModule(MainActivity activity) {
        mMainActivity = activity;
    }

    @Provides
    public IBaseView provideIBaseView() {
        return (IBaseView)mMainActivity;
    }

    @Provides
    public FragmentManager provideFragmentManager() {
        return mMainActivity.getSupportFragmentManager();
    }

    @Provides
    public ViewPagerAdapter provideViewPagerAdapter() {
        return new ViewPagerAdapter(mMainActivity.getSupportFragmentManager());
    }

    @Provides
    HomePageFragment provideHomePageFragment() {
        return HomePageFragment.newInstance();
    }

    @Provides
    BulletinFragment provideBulletinFragment() {
        return BulletinFragment.newInstance();
    }

    @Provides
    MyFragment provideMyFragment() {
        return MyFragment.newInstance();
    }
}
