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

package com.nuist.library.utils;


import android.annotation.TargetApi;
import android.content.ContentUris;
import android.content.Context;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Environment;
import android.provider.DocumentsContract;
import android.provider.MediaStore;
import android.text.TextUtils;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.nuist.library.R;
import com.nuist.library.base.BaseActivity;
import com.nuist.library.main.MainActivity;
import com.nuist.library.welcome.SplashActivity;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

import cn.bmob.v3.BmobUser;
import cn.bmob.v3.datatype.BmobFile;

public class Utils {
    public static final String CHATROOM = "chatroom_";
    public static final String FRESHNEWS = "freshnews_";
    private static final String AVATAR = "avatar.jpg";
    private static final String BIYEBAN = "biyeban";

    public static boolean isShowImageAlways(Context context) {
        return true;
    }


    public static String getCurrentTime() {
        SimpleDateFormat format = new SimpleDateFormat("HH:mm");
        String time = format.format(new Date(System.currentTimeMillis()));
        return time;
    }

    public static String getCurrentDate() {
        Calendar rightNow = Calendar.getInstance(Locale.CHINA);
        int  year = rightNow.get(Calendar.YEAR);
        int month = rightNow.get(Calendar.MONTH) + 1;
        int day = rightNow.get(Calendar.DATE);
        return year + "年" + month + "月" + day + "日";
    }

    public static Bitmap getBitmap(Context context, int id) {
        Bitmap bitmap = BitmapFactory.decodeResource(context.getResources(), id);
        return bitmap;
    }

    public static Bitmap getBitmap(Context context, Uri uri) {
        Bitmap bitmap = null;
        try {
            bitmap = BitmapFactory.decodeStream(context.getContentResolver().openInputStream(uri));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return bitmap;
    }

    public static boolean saveAvatar(Context context, byte[] b) {
        boolean ret = false;
        try {
            context.deleteFile(AVATAR);
            FileOutputStream outputStream =  context.openFileOutput(AVATAR, Context.MODE_PRIVATE);
            outputStream.write(b);
            outputStream.close();
            ret = true;
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return ret;
    }

    public static String getAvatarPath(Context context) {
        String path = context.getFilesDir()+"/"+AVATAR;
        L.d("getAvatarPath:"+path);
        return path;
    }

    public static String getPicsPath(Context context) {
        ///storage/emulated/0/Pictures/biyeban
        String path = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_PICTURES).getPath();
        path = path + "/" +BIYEBAN;
        L.d("getPicsPath path:"+path);
        ///storage/emulated/0/biyeban
        //String path1 = Environment.getExternalStorageDirectory().getPath() + "/" +BIYEBAN;
        ///storage/emulated/0/Android/data/com.nuist.library/files/Pictures
        //String path2 = context.getExternalFilesDir(Environment.DIRECTORY_PICTURES).getPath();
        return path;
    }

    /**
     * 根据Uri获取图片绝对路径，解决Android4.4以上版本Uri转换
     * @param context
     * @param imageUri
     * @author yaoxing
     * @date 2014-10-12
     */
    @TargetApi(19)
    public static String getImageAbsolutePath(Context context, Uri imageUri) {
        if (context == null || imageUri == null)
            return null;
        if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.KITKAT && DocumentsContract.isDocumentUri(context, imageUri)) {
            if (isExternalStorageDocument(imageUri)) {
                String docId = DocumentsContract.getDocumentId(imageUri);
                String[] split = docId.split(":");
                String type = split[0];
                if ("primary".equalsIgnoreCase(type)) {
                    return Environment.getExternalStorageDirectory() + "/" + split[1];
                }
            } else if (isDownloadsDocument(imageUri)) {
                String id = DocumentsContract.getDocumentId(imageUri);
                Uri contentUri = ContentUris.withAppendedId(Uri.parse("content://downloads/public_downloads"), Long.valueOf(id));
                return getDataColumn(context, contentUri, null, null);
            } else if (isMediaDocument(imageUri)) {
                String docId = DocumentsContract.getDocumentId(imageUri);
                String[] split = docId.split(":");
                String type = split[0];
                Uri contentUri = null;
                if ("image".equals(type)) {
                    contentUri = MediaStore.Images.Media.EXTERNAL_CONTENT_URI;
                } else if ("video".equals(type)) {
                    contentUri = MediaStore.Video.Media.EXTERNAL_CONTENT_URI;
                } else if ("audio".equals(type)) {
                    contentUri = MediaStore.Audio.Media.EXTERNAL_CONTENT_URI;
                }
                String selection = MediaStore.Images.Media._ID + "=?";
                String[] selectionArgs = new String[] { split[1] };
                return getDataColumn(context, contentUri, selection, selectionArgs);
            }
        } // MediaStore (and general)
        else if ("content".equalsIgnoreCase(imageUri.getScheme())) {
            // Return the remote address
            if (isGooglePhotosUri(imageUri))
                return imageUri.getLastPathSegment();
            return getDataColumn(context, imageUri, null, null);
        }
        // File
        else if ("file".equalsIgnoreCase(imageUri.getScheme())) {
            return imageUri.getPath();
        }
        return null;
    }

    public static String getDataColumn(Context context, Uri uri, String selection, String[] selectionArgs) {
        Cursor cursor = null;
        String column = MediaStore.Images.Media.DATA;
        String[] projection = { column };
        try {
            cursor = context.getContentResolver().query(uri, projection, selection, selectionArgs, null);
            if (cursor != null && cursor.moveToFirst()) {
                int index = cursor.getColumnIndexOrThrow(column);
                return cursor.getString(index);
            }
        } finally {
            if (cursor != null)
                cursor.close();
        }
        return null;
    }

    /**
     * @param uri The Uri to check.
     * @return Whether the Uri authority is ExternalStorageProvider.
     */
    public static boolean isExternalStorageDocument(Uri uri) {
        return "com.android.externalstorage.documents".equals(uri.getAuthority());
    }

    /**
     * @param uri The Uri to check.
     * @return Whether the Uri authority is DownloadsProvider.
     */
    public static boolean isDownloadsDocument(Uri uri) {
        return "com.android.providers.downloads.documents".equals(uri.getAuthority());
    }

    /**
     * @param uri The Uri to check.
     * @return Whether the Uri authority is MediaProvider.
     */
    public static boolean isMediaDocument(Uri uri) {
        return "com.android.providers.media.documents".equals(uri.getAuthority());
    }

    /**
     * @param uri The Uri to check.
     * @return Whether the Uri authority is Google Photos.
     */
    public static boolean isGooglePhotosUri(Uri uri) {
        return "com.google.android.apps.photos.content".equals(uri.getAuthority());
    }

    public static void enterMain(SplashActivity activity) {
        MainActivity.launch(activity);
    }

    //    private void loadData() {
//        //do something
//        Observable.from(new Integer[]{1, 2, 3, 4})
//                .subscribeOn(Schedulers.io())
//                .doOnSubscribe(new Action0() {
//                    @Override
//                    public void call() {
//                        mView.showLoading();
//                    }
//                })
//                .subscribeOn(AndroidSchedulers.mainThread())
//                .compose(mTransformer)
//                .observeOn(AndroidSchedulers.mainThread())
//                .subscribe(new Subscriber<String>() {
//                    @Override
//                    public void onCompleted() {
//                        mView.hideLoading();
//                    }
//
//                    @Override
//                    public void onError(Throwable throwable) {
//
//                    }
//
//                    @Override
//                    public void onNext(String s) {
//                        L.d(s+"\n");
//                    }
//                });
//    }
//
//    private Observable.Transformer<Integer, String> mTransformer =
//            new Observable.Transformer<Integer, String>() {
//                @Override
//                public Observable<String> call(Observable<Integer> observable) {
//                    return observable
//                            .map(new Func1<Integer, String>() {
//                                @Override
//                                public String call(Integer integer) {
//                                    return integer.toString();
//                                }
//                            });
//                }
//            };
}
