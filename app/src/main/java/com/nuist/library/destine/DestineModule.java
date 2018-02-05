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

package com.nuist.library.destine;


import com.nuist.library.destine.desk.DeskShowFragment;
import com.nuist.library.destine.room.RoomShowFragment;

import dagger.Module;
import dagger.Provides;

@Module
public class DestineModule {
    private IDestineInterface mInterface;
    public DestineModule (IDestineInterface i) {
        mInterface = i;
    }

    @Provides
    IDestineInterface provideIDestineInterface() {
        return mInterface;
    }

    @Provides
    RoomShowFragment provideRoomShowFragment() {
        return RoomShowFragment.newInstance(mInterface);
    }

    @Provides
    DeskShowFragment provideDestShowFragment() {
        return DeskShowFragment.newInstance(mInterface);
    }
}
