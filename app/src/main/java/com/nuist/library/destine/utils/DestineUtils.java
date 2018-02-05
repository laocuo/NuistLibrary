package com.nuist.library.destine.utils;

import android.graphics.Point;

import java.util.ArrayList;


public class DestineUtils {
    private static ArrayList<ObjectType> m201202 = new ArrayList<>();

    public static ArrayList<ObjectType> getLayout(String roomName) {
        if (roomName.equalsIgnoreCase("201~202")) {
            return m201202;
        } else {
            return m201202;
        }
    }

    static {
        m201202.add(new ObjectType(ObjectType.DESKTOP, new Point(0, 1), new Point(0, 1), "1"));
        m201202.add(new ObjectType(ObjectType.DESKTOP, new Point(0, 4), new Point(0, 4), "2"));
        m201202.add(new ObjectType(ObjectType.DESKTOP, new Point(0, 5), new Point(0, 5), "3"));
        m201202.add(new ObjectType(ObjectType.DESKTOP, new Point(0, 6), new Point(0, 6), "4"));
        m201202.add(new ObjectType(ObjectType.DESKTOP, new Point(0, 7), new Point(0, 7), "5"));
        m201202.add(new ObjectType(ObjectType.DESKTOP, new Point(0, 8), new Point(0, 8), "6"));
        m201202.add(new ObjectType(ObjectType.DESKTOP, new Point(0, 9), new Point(0, 9), "7"));
        m201202.add(new ObjectType(ObjectType.DESKTOP, new Point(0, 10), new Point(0, 10), "8"));
        m201202.add(new ObjectType(ObjectType.DESKTOP, new Point(0, 11), new Point(0, 11), "9"));
        m201202.add(new ObjectType(ObjectType.DESKTOP, new Point(2, 2), new Point(2, 2), "10"));
        m201202.add(new ObjectType(ObjectType.DESKTOP, new Point(2, 4), new Point(2, 4), "11"));
        m201202.add(new ObjectType(ObjectType.DESKTOP, new Point(2, 5), new Point(2, 5), "12"));
        m201202.add(new ObjectType(ObjectType.DESKTOP, new Point(2, 7), new Point(2, 7), "13"));
        m201202.add(new ObjectType(ObjectType.DESKTOP, new Point(2, 8), new Point(2, 8), "14"));
        m201202.add(new ObjectType(ObjectType.DESKTOP, new Point(2, 10), new Point(2, 10), "15"));

        m201202.add(new ObjectType(ObjectType.BOOKCASE, new Point(0, 2), new Point(1, 2), null));
        m201202.add(new ObjectType(ObjectType.BOOKCASE, new Point(0, 3), new Point(2, 3), null));
        m201202.add(new ObjectType(ObjectType.BOOKCASE, new Point(1, 4), new Point(1, 10), null));
        m201202.add(new ObjectType(ObjectType.BOOKCASE, new Point(2, 6), new Point(2, 6), null));
        m201202.add(new ObjectType(ObjectType.BOOKCASE, new Point(2, 9), new Point(2, 9), null));

        m201202.add(new ObjectType(ObjectType.CORRIDOR, new Point(1, 1), new Point(2, 1), null));
        m201202.add(new ObjectType(ObjectType.CORRIDOR, new Point(1, 11), new Point(2, 11), null));

        m201202.add(new ObjectType(ObjectType.DOOR, new Point(3, 1), new Point(6, 1), "201工科借阅处3"));
        m201202.add(new ObjectType(ObjectType.DOOR, new Point(3, 11), new Point(6, 11), "202工科借阅处3"));
    }
}
