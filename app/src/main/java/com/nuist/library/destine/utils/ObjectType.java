package com.nuist.library.destine.utils;

import android.graphics.Point;


public class ObjectType {
    public static final int DESKTOP  = 1;
    public static final int BOOKCASE = 2;
    public static final int CORRIDOR = 3;
    public static final int DOOR     = 4;

    public int category;
    public Point start;
    public Point end;
    public String descripe;

    public ObjectType(int c, Point s, Point e, String t) {
        category = c;
        start = s;
        end = e;
        descripe = t;
    }
}
