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

package com.nuist.library;

import android.app.Application;

public class NuistLibrary extends Application {
    private static NuistLibrary instance;
    private String ApplicationID = "ed80713e365b9c15b32a5f1ea3dec41c";

    @Override
    public void onCreate() {
        super.onCreate();
        instance = this;
    }

    public String getApplicationID() {
        return ApplicationID;
    }

    public static NuistLibrary getInstance() {
        return instance;
    }
}