package com.nuist.library.destine.utils;

import android.graphics.Point;

import java.util.ArrayList;


public class DestineUtils {
    private static ArrayList<ObjectType> m201202 = new ArrayList<>();
    private static ArrayList<ObjectType> m206207 = new ArrayList<>();
    private static ArrayList<ObjectType> m208209 = new ArrayList<>();
    private static ArrayList<ObjectType> m302    = new ArrayList<>();
    private static ArrayList<ObjectType> m306307 = new ArrayList<>();
    private static ArrayList<ObjectType> m309310 = new ArrayList<>();
    private static ArrayList<ObjectType> m311312 = new ArrayList<>();
    private static ArrayList<ObjectType> m401402 = new ArrayList<>();
    private static ArrayList<ObjectType> m403404 = new ArrayList<>();
    private static ArrayList<ObjectType> m406407 = new ArrayList<>();
    private static ArrayList<ObjectType> m408409 = new ArrayList<>();
    private static ArrayList<ObjectType> m501502 = new ArrayList<>();
    private static ArrayList<ObjectType> m503504 = new ArrayList<>();
    private static ArrayList<ObjectType> m510511 = new ArrayList<>();
    private static ArrayList<ObjectType> m601602 = new ArrayList<>();
    private static ArrayList<ObjectType> m603604 = new ArrayList<>();
    private static ArrayList<ObjectType> m606607 = new ArrayList<>();
    private static ArrayList<ObjectType> m608609 = new ArrayList<>();
    private static ArrayList<ObjectType> m610611 = new ArrayList<>();
    private static ArrayList<ObjectType> m719720 = new ArrayList<>();
    private static ArrayList<ObjectType> m727    = new ArrayList<>();

    /*
    * 返回每个房间布局
    * */
    public static ArrayList<ObjectType> getLayout(String roomName) {
        if (roomName.equalsIgnoreCase("201~202")) {
            return m201202;
        } else if (roomName.equalsIgnoreCase("206~207")) {
            return m206207;
        } else if (roomName.equalsIgnoreCase("208~209")) {
            return m208209;
        } else if (roomName.equalsIgnoreCase("302")) {
            return m302;
        } else if (roomName.equalsIgnoreCase("306~307")) {
            return m306307;
        } else if (roomName.equalsIgnoreCase("309~310")) {
            return m309310;
        } else if (roomName.equalsIgnoreCase("311~312")) {
            return m311312;
        } else if (roomName.equalsIgnoreCase("401~402")) {
            return m401402;
        } else if (roomName.equalsIgnoreCase("403~404")) {
            return m403404;
        } else if (roomName.equalsIgnoreCase("406~407")) {
            return m406407;
        } else if (roomName.equalsIgnoreCase("408~409")) {
            return m408409;
        } else if (roomName.equalsIgnoreCase("501~502")) {
            return m501502;
        } else if (roomName.equalsIgnoreCase("503~504")) {
            return m503504;
        } else if (roomName.equalsIgnoreCase("510~511")) {
            return m510511;
        } else if (roomName.equalsIgnoreCase("601~602")) {
            return m601602;
        } else if (roomName.equalsIgnoreCase("603~604")) {
            return m603604;
        } else if (roomName.equalsIgnoreCase("606~607")) {
            return m606607;
        } else if (roomName.equalsIgnoreCase("608~609")) {
            return m608609;
        } else if (roomName.equalsIgnoreCase("610~611")) {
            return m610611;
        } else if (roomName.equalsIgnoreCase("719~720")) {
            return m719720;
        } else if (roomName.equalsIgnoreCase("727")) {
            return m727;
        } else {
            return null;
        }
    }

    /*
    * 返回每个房间垂直方向占用最大格数
    * */
    public static int getHeightMaxGrids(String roomName) {
        if (roomName.equalsIgnoreCase("201~202")) {
            return 12;
        } else if (roomName.equalsIgnoreCase("206~207")) {
            return 10;
        } else if (roomName.equalsIgnoreCase("208~209")) {
            return 25;
        } else if (roomName.equalsIgnoreCase("302")) {
            return 6;
        } else if (roomName.equalsIgnoreCase("306~307")) {
            return 25;
        } else if (roomName.equalsIgnoreCase("309~310")) {
            return 11;
        } else if (roomName.equalsIgnoreCase("311~312")) {
            return 25;
        } else if (roomName.equalsIgnoreCase("401~402")) {
            return 12;
        } else if (roomName.equalsIgnoreCase("403~404")) {
            return 31;
        } else if (roomName.equalsIgnoreCase("406~407")) {
            return 11;
        } else if (roomName.equalsIgnoreCase("408~409")) {
            return 17;
        } else if (roomName.equalsIgnoreCase("501~502")) {
            return 13;
        } else if (roomName.equalsIgnoreCase("503~504")) {
            return 29;
        } else if (roomName.equalsIgnoreCase("510~511")) {
            return 26;
        } else if (roomName.equalsIgnoreCase("601~602")) {
            return 10;
        } else if (roomName.equalsIgnoreCase("603~604")) {
            return 24;
        } else if (roomName.equalsIgnoreCase("606~607")) {
            return 7;
        } else if (roomName.equalsIgnoreCase("608~609")) {
            return 6;
        } else if (roomName.equalsIgnoreCase("610~611")) {
            return 26;
        } else if (roomName.equalsIgnoreCase("719~720")) {
            return 10;
        } else if (roomName.equalsIgnoreCase("727")) {
            return 9;
        } else {
            return 0;
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

        m206207.add(new ObjectType(ObjectType.DESKTOP, new Point(0, 1), new Point(0, 1), "1"));
        m206207.add(new ObjectType(ObjectType.DESKTOP, new Point(0, 2), new Point(0, 2), "2"));
        m206207.add(new ObjectType(ObjectType.DESKTOP, new Point(0, 3), new Point(0, 3), "3"));
        m206207.add(new ObjectType(ObjectType.DESKTOP, new Point(0, 4), new Point(0, 4), "4"));
        m206207.add(new ObjectType(ObjectType.DESKTOP, new Point(0, 5), new Point(0, 5), "5"));
        m206207.add(new ObjectType(ObjectType.DESKTOP, new Point(0, 6), new Point(0, 6), "6"));
        m206207.add(new ObjectType(ObjectType.DESKTOP, new Point(0, 7), new Point(0, 7), "7"));
        m206207.add(new ObjectType(ObjectType.DESKTOP, new Point(0, 8), new Point(0, 8), "8"));
        m206207.add(new ObjectType(ObjectType.DESKTOP, new Point(0, 9), new Point(0, 9), "9"));
        m206207.add(new ObjectType(ObjectType.DESKTOP, new Point(4, 8), new Point(4, 8), "10"));
        m206207.add(new ObjectType(ObjectType.DESKTOP, new Point(4, 7), new Point(4, 7), "11"));
        m206207.add(new ObjectType(ObjectType.DESKTOP, new Point(4, 6), new Point(4, 6), "12"));
        m206207.add(new ObjectType(ObjectType.DESKTOP, new Point(4, 5), new Point(4, 5), "13"));
        m206207.add(new ObjectType(ObjectType.DESKTOP, new Point(4, 4), new Point(4, 4), "14"));
        m206207.add(new ObjectType(ObjectType.DESKTOP, new Point(4, 3), new Point(4, 3), "15"));
        m206207.add(new ObjectType(ObjectType.DESKTOP, new Point(4, 2), new Point(4, 2), "16"));
        m206207.add(new ObjectType(ObjectType.DESKTOP, new Point(4, 1), new Point(4, 1), "17"));

        m206207.add(new ObjectType(ObjectType.BOOKCASE, new Point(1, 1), new Point(3, 8), null));

        m206207.add(new ObjectType(ObjectType.CORRIDOR, new Point(1, 9), new Point(4, 9), null));

        m206207.add(new ObjectType(ObjectType.DOOR, new Point(5, 1), new Point(8, 1), "206工科借阅处1"));
        m206207.add(new ObjectType(ObjectType.DOOR, new Point(5, 9), new Point(8, 9), "207工科借阅处1"));

        m208209.add(new ObjectType(ObjectType.DESKTOP, new Point(0, 1), new Point(0, 1), "1"));
        m208209.add(new ObjectType(ObjectType.DESKTOP, new Point(1, 1), new Point(1, 1), "2"));
        m208209.add(new ObjectType(ObjectType.DESKTOP, new Point(2, 1), new Point(2, 1), "3"));
        m208209.add(new ObjectType(ObjectType.DESKTOP, new Point(0, 2), new Point(0, 2), "4"));
        m208209.add(new ObjectType(ObjectType.DESKTOP, new Point(1, 2), new Point(1, 2), "5"));
        m208209.add(new ObjectType(ObjectType.DESKTOP, new Point(2, 2), new Point(2, 2), "6"));
        m208209.add(new ObjectType(ObjectType.DESKTOP, new Point(0, 3), new Point(0, 3), "7"));
        m208209.add(new ObjectType(ObjectType.DESKTOP, new Point(1, 3), new Point(1, 3), "8"));
        m208209.add(new ObjectType(ObjectType.DESKTOP, new Point(2, 3), new Point(2, 3), "9"));
        m208209.add(new ObjectType(ObjectType.DESKTOP, new Point(0, 4), new Point(0, 4), "10"));
        m208209.add(new ObjectType(ObjectType.DESKTOP, new Point(1, 4), new Point(1, 4), "11"));
        m208209.add(new ObjectType(ObjectType.DESKTOP, new Point(2, 4), new Point(2, 4), "12"));
        m208209.add(new ObjectType(ObjectType.DESKTOP, new Point(0, 5), new Point(0, 5), "13"));
        m208209.add(new ObjectType(ObjectType.DESKTOP, new Point(1, 5), new Point(1, 5), "14"));
        m208209.add(new ObjectType(ObjectType.DESKTOP, new Point(2, 5), new Point(2, 5), "15"));
        m208209.add(new ObjectType(ObjectType.DESKTOP, new Point(0, 6), new Point(0, 6), "16"));
        m208209.add(new ObjectType(ObjectType.DESKTOP, new Point(1, 6), new Point(1, 6), "17"));
        m208209.add(new ObjectType(ObjectType.DESKTOP, new Point(2, 6), new Point(2, 6), "18"));
        m208209.add(new ObjectType(ObjectType.DESKTOP, new Point(2, 7), new Point(2, 7), "19"));
        m208209.add(new ObjectType(ObjectType.DESKTOP, new Point(2, 8), new Point(2, 8), "20"));
        m208209.add(new ObjectType(ObjectType.DESKTOP, new Point(2, 9), new Point(2, 9), "21"));
        m208209.add(new ObjectType(ObjectType.DESKTOP, new Point(2, 10), new Point(2, 10), "22"));
        m208209.add(new ObjectType(ObjectType.DESKTOP, new Point(2, 11), new Point(2, 11), "23"));
        m208209.add(new ObjectType(ObjectType.DESKTOP, new Point(2, 12), new Point(2, 12), "24"));
        m208209.add(new ObjectType(ObjectType.DESKTOP, new Point(2, 13), new Point(2, 13), "25"));
        m208209.add(new ObjectType(ObjectType.DESKTOP, new Point(2, 14), new Point(2, 14), "26"));
        m208209.add(new ObjectType(ObjectType.DESKTOP, new Point(2, 15), new Point(2, 15), "27"));
        m208209.add(new ObjectType(ObjectType.DESKTOP, new Point(2, 16), new Point(2, 16), "28"));
        m208209.add(new ObjectType(ObjectType.DESKTOP, new Point(2, 17), new Point(2, 17), "29"));
        m208209.add(new ObjectType(ObjectType.DESKTOP, new Point(2, 18), new Point(2, 18), "30"));
        m208209.add(new ObjectType(ObjectType.DESKTOP, new Point(0, 19), new Point(0, 19), "31"));
        m208209.add(new ObjectType(ObjectType.DESKTOP, new Point(1, 19), new Point(1, 19), "32"));
        m208209.add(new ObjectType(ObjectType.DESKTOP, new Point(2, 19), new Point(2, 19), "33"));
        m208209.add(new ObjectType(ObjectType.DESKTOP, new Point(0, 20), new Point(0, 20), "34"));
        m208209.add(new ObjectType(ObjectType.DESKTOP, new Point(1, 20), new Point(1, 20), "35"));
        m208209.add(new ObjectType(ObjectType.DESKTOP, new Point(2, 20), new Point(2, 20), "36"));
        m208209.add(new ObjectType(ObjectType.DESKTOP, new Point(0, 21), new Point(0, 21), "37"));
        m208209.add(new ObjectType(ObjectType.DESKTOP, new Point(1, 21), new Point(1, 21), "38"));
        m208209.add(new ObjectType(ObjectType.DESKTOP, new Point(2, 21), new Point(2, 21), "39"));
        m208209.add(new ObjectType(ObjectType.DESKTOP, new Point(0, 22), new Point(0, 22), "40"));
        m208209.add(new ObjectType(ObjectType.DESKTOP, new Point(1, 22), new Point(1, 22), "41"));
        m208209.add(new ObjectType(ObjectType.DESKTOP, new Point(2, 22), new Point(2, 22), "42"));
        m208209.add(new ObjectType(ObjectType.DESKTOP, new Point(0, 23), new Point(0, 23), "43"));
        m208209.add(new ObjectType(ObjectType.DESKTOP, new Point(1, 23), new Point(1, 23), "44"));
        m208209.add(new ObjectType(ObjectType.DESKTOP, new Point(2, 23), new Point(2, 23), "45"));
        m208209.add(new ObjectType(ObjectType.DESKTOP, new Point(0, 24), new Point(0, 24), "46"));
        m208209.add(new ObjectType(ObjectType.DESKTOP, new Point(1, 24), new Point(1, 24), "47"));
        m208209.add(new ObjectType(ObjectType.DESKTOP, new Point(2, 24), new Point(2, 24), "48"));
        m208209.add(new ObjectType(ObjectType.DESKTOP, new Point(9, 10), new Point(9, 10), "49"));
        m208209.add(new ObjectType(ObjectType.DESKTOP, new Point(9, 11), new Point(9, 11), "50"));
        m208209.add(new ObjectType(ObjectType.DESKTOP, new Point(8, 11), new Point(8, 11), "51"));
        m208209.add(new ObjectType(ObjectType.DESKTOP, new Point(9, 12), new Point(9, 12), "52"));
        m208209.add(new ObjectType(ObjectType.DESKTOP, new Point(8, 12), new Point(8, 12), "53"));
        m208209.add(new ObjectType(ObjectType.DESKTOP, new Point(9, 13), new Point(9, 13), "54"));
        m208209.add(new ObjectType(ObjectType.DESKTOP, new Point(8, 13), new Point(8, 13), "55"));
        m208209.add(new ObjectType(ObjectType.DESKTOP, new Point(9, 14), new Point(9, 14), "56"));
        m208209.add(new ObjectType(ObjectType.DESKTOP, new Point(8, 14), new Point(8, 14), "57"));
        m208209.add(new ObjectType(ObjectType.DESKTOP, new Point(9, 15), new Point(9, 15), "58"));
        m208209.add(new ObjectType(ObjectType.DESKTOP, new Point(8, 15), new Point(8, 15), "59"));


        m208209.add(new ObjectType(ObjectType.BOOKCASE, new Point(3, 1), new Point(4, 7), null));
        m208209.add(new ObjectType(ObjectType.BOOKCASE, new Point(3, 10), new Point(4, 15), null));
        m208209.add(new ObjectType(ObjectType.BOOKCASE, new Point(3, 18), new Point(4, 24), null));

        m208209.add(new ObjectType(ObjectType.CORRIDOR, new Point(3, 8), new Point(4, 9), null));
        m208209.add(new ObjectType(ObjectType.CORRIDOR, new Point(3, 16), new Point(4, 17), null));

        m208209.add(new ObjectType(ObjectType.DOOR, new Point(5, 8), new Point(8, 9), "208工科借阅处2"));
        m208209.add(new ObjectType(ObjectType.DOOR, new Point(5, 16), new Point(8, 17), "209工科借阅处2"));

        m302.add(new ObjectType(ObjectType.DESKTOP, new Point(2, 1), new Point(2, 1), "1"));
        m302.add(new ObjectType(ObjectType.DESKTOP, new Point(2, 2), new Point(2, 2), "2"));
        m302.add(new ObjectType(ObjectType.DESKTOP, new Point(2, 3), new Point(2, 3), "3"));
        m302.add(new ObjectType(ObjectType.DESKTOP, new Point(2, 4), new Point(2, 4), "4"));
        m302.add(new ObjectType(ObjectType.DESKTOP, new Point(1, 5), new Point(1, 5), "5"));
        m302.add(new ObjectType(ObjectType.DESKTOP, new Point(0, 5), new Point(0, 5), "6"));


        m302.add(new ObjectType(ObjectType.BOOKCASE, new Point(0, 1), new Point(1, 4), null));

        m302.add(new ObjectType(ObjectType.CORRIDOR, new Point(2, 5), new Point(2, 5), null));

        m302.add(new ObjectType(ObjectType.DOOR, new Point(3, 1), new Point(8, 1), "302本校硕博士论文阅览室"));

        m306307.add(new ObjectType(ObjectType.DESKTOP, new Point(0, 1), new Point(0, 1), "1"));
        m306307.add(new ObjectType(ObjectType.DESKTOP, new Point(1, 1), new Point(1, 1), "2"));
        m306307.add(new ObjectType(ObjectType.DESKTOP, new Point(2, 1), new Point(2, 1), "3"));
        m306307.add(new ObjectType(ObjectType.DESKTOP, new Point(0, 2), new Point(0, 2), "4"));
        m306307.add(new ObjectType(ObjectType.DESKTOP, new Point(1, 2), new Point(1, 2), "5"));
        m306307.add(new ObjectType(ObjectType.DESKTOP, new Point(2, 2), new Point(2, 2), "6"));
        m306307.add(new ObjectType(ObjectType.DESKTOP, new Point(0, 3), new Point(0, 3), "7"));
        m306307.add(new ObjectType(ObjectType.DESKTOP, new Point(1, 3), new Point(1, 3), "8"));
        m306307.add(new ObjectType(ObjectType.DESKTOP, new Point(2, 3), new Point(2, 3), "9"));
        m306307.add(new ObjectType(ObjectType.DESKTOP, new Point(0, 4), new Point(0, 4), "10"));
        m306307.add(new ObjectType(ObjectType.DESKTOP, new Point(1, 4), new Point(1, 4), "11"));
        m306307.add(new ObjectType(ObjectType.DESKTOP, new Point(2, 4), new Point(2, 4), "12"));
        m306307.add(new ObjectType(ObjectType.DESKTOP, new Point(0, 5), new Point(0, 5), "13"));
        m306307.add(new ObjectType(ObjectType.DESKTOP, new Point(1, 5), new Point(1, 5), "14"));
        m306307.add(new ObjectType(ObjectType.DESKTOP, new Point(2, 5), new Point(2, 5), "15"));
        m306307.add(new ObjectType(ObjectType.DESKTOP, new Point(0, 6), new Point(0, 6), "16"));
        m306307.add(new ObjectType(ObjectType.DESKTOP, new Point(1, 6), new Point(1, 6), "17"));
        m306307.add(new ObjectType(ObjectType.DESKTOP, new Point(2, 6), new Point(2, 6), "18"));
        m306307.add(new ObjectType(ObjectType.DESKTOP, new Point(2, 7), new Point(2, 7), "19"));
        m306307.add(new ObjectType(ObjectType.DESKTOP, new Point(2, 8), new Point(2, 8), "20"));
        m306307.add(new ObjectType(ObjectType.DESKTOP, new Point(2, 9), new Point(2, 9), "21"));
        m306307.add(new ObjectType(ObjectType.DESKTOP, new Point(2, 10), new Point(2, 10), "22"));
        m306307.add(new ObjectType(ObjectType.DESKTOP, new Point(2, 11), new Point(2, 11), "23"));
        m306307.add(new ObjectType(ObjectType.DESKTOP, new Point(2, 12), new Point(2, 12), "24"));
        m306307.add(new ObjectType(ObjectType.DESKTOP, new Point(2, 13), new Point(2, 13), "25"));
        m306307.add(new ObjectType(ObjectType.DESKTOP, new Point(2, 14), new Point(2, 14), "26"));
        m306307.add(new ObjectType(ObjectType.DESKTOP, new Point(2, 15), new Point(2, 15), "27"));
        m306307.add(new ObjectType(ObjectType.DESKTOP, new Point(2, 16), new Point(2, 16), "28"));
        m306307.add(new ObjectType(ObjectType.DESKTOP, new Point(2, 17), new Point(2, 17), "29"));
        m306307.add(new ObjectType(ObjectType.DESKTOP, new Point(2, 18), new Point(2, 18), "30"));
        m306307.add(new ObjectType(ObjectType.DESKTOP, new Point(0, 19), new Point(0, 19), "31"));
        m306307.add(new ObjectType(ObjectType.DESKTOP, new Point(1, 19), new Point(1, 19), "32"));
        m306307.add(new ObjectType(ObjectType.DESKTOP, new Point(2, 19), new Point(2, 19), "33"));
        m306307.add(new ObjectType(ObjectType.DESKTOP, new Point(0, 20), new Point(0, 20), "34"));
        m306307.add(new ObjectType(ObjectType.DESKTOP, new Point(1, 20), new Point(1, 20), "35"));
        m306307.add(new ObjectType(ObjectType.DESKTOP, new Point(2, 20), new Point(2, 20), "36"));
        m306307.add(new ObjectType(ObjectType.DESKTOP, new Point(0, 21), new Point(0, 21), "37"));
        m306307.add(new ObjectType(ObjectType.DESKTOP, new Point(1, 21), new Point(1, 21), "38"));
        m306307.add(new ObjectType(ObjectType.DESKTOP, new Point(2, 21), new Point(2, 21), "39"));
        m306307.add(new ObjectType(ObjectType.DESKTOP, new Point(0, 22), new Point(0, 22), "40"));
        m306307.add(new ObjectType(ObjectType.DESKTOP, new Point(1, 22), new Point(1, 22), "41"));
        m306307.add(new ObjectType(ObjectType.DESKTOP, new Point(2, 22), new Point(2, 22), "42"));
        m306307.add(new ObjectType(ObjectType.DESKTOP, new Point(0, 23), new Point(0, 23), "43"));
        m306307.add(new ObjectType(ObjectType.DESKTOP, new Point(1, 23), new Point(1, 23), "44"));
        m306307.add(new ObjectType(ObjectType.DESKTOP, new Point(2, 23), new Point(2, 23), "45"));
        m306307.add(new ObjectType(ObjectType.DESKTOP, new Point(0, 24), new Point(0, 24), "46"));
        m306307.add(new ObjectType(ObjectType.DESKTOP, new Point(1, 24), new Point(1, 24), "47"));
        m306307.add(new ObjectType(ObjectType.DESKTOP, new Point(2, 24), new Point(2, 24), "48"));
        m306307.add(new ObjectType(ObjectType.DESKTOP, new Point(9, 10), new Point(9, 10), "49"));
        m306307.add(new ObjectType(ObjectType.DESKTOP, new Point(9, 11), new Point(9, 11), "50"));
        m306307.add(new ObjectType(ObjectType.DESKTOP, new Point(9, 12), new Point(9, 12), "51"));
        m306307.add(new ObjectType(ObjectType.DESKTOP, new Point(9, 13), new Point(9, 13), "52"));
        m306307.add(new ObjectType(ObjectType.DESKTOP, new Point(9, 14), new Point(9, 14), "53"));

        m306307.add(new ObjectType(ObjectType.BOOKCASE, new Point(3, 1), new Point(5, 7), null));
        m306307.add(new ObjectType(ObjectType.BOOKCASE, new Point(3, 10), new Point(5, 15), null));
        m306307.add(new ObjectType(ObjectType.BOOKCASE, new Point(3, 18), new Point(5, 24), null));

        m306307.add(new ObjectType(ObjectType.CORRIDOR, new Point(3, 8), new Point(5, 9), null));
        m306307.add(new ObjectType(ObjectType.CORRIDOR, new Point(3, 16), new Point(5, 17), null));

        m306307.add(new ObjectType(ObjectType.DOOR, new Point(6, 8), new Point(8, 9), "306理科借阅处"));
        m306307.add(new ObjectType(ObjectType.DOOR, new Point(6, 16), new Point(8, 17), "307理科借阅处"));

        m309310.add(new ObjectType(ObjectType.DESKTOP, new Point(0, 1), new Point(0, 1), "1"));
        m309310.add(new ObjectType(ObjectType.DESKTOP, new Point(0, 2), new Point(0, 2), "2"));
        m309310.add(new ObjectType(ObjectType.DESKTOP, new Point(0, 3), new Point(0, 3), "3"));
        m309310.add(new ObjectType(ObjectType.DESKTOP, new Point(0, 4), new Point(0, 4), "4"));
        m309310.add(new ObjectType(ObjectType.DESKTOP, new Point(0, 5), new Point(0, 5), "5"));
        m309310.add(new ObjectType(ObjectType.DESKTOP, new Point(0, 6), new Point(0, 6), "6"));
        m309310.add(new ObjectType(ObjectType.DESKTOP, new Point(0, 7), new Point(0, 7), "7"));
        m309310.add(new ObjectType(ObjectType.DESKTOP, new Point(0, 8), new Point(0, 8), "8"));
        m309310.add(new ObjectType(ObjectType.DESKTOP, new Point(0, 9), new Point(0, 9), "9"));
        m309310.add(new ObjectType(ObjectType.DESKTOP, new Point(0, 10), new Point(0, 10), "10"));
        m309310.add(new ObjectType(ObjectType.DESKTOP, new Point(4, 9), new Point(4, 9), "11"));
        m309310.add(new ObjectType(ObjectType.DESKTOP, new Point(4, 8), new Point(4, 8), "12"));
        m309310.add(new ObjectType(ObjectType.DESKTOP, new Point(4, 7), new Point(4, 7), "13"));
        m309310.add(new ObjectType(ObjectType.DESKTOP, new Point(4, 6), new Point(4, 6), "14"));
        m309310.add(new ObjectType(ObjectType.DESKTOP, new Point(4, 5), new Point(4, 5), "15"));
        m309310.add(new ObjectType(ObjectType.DESKTOP, new Point(4, 4), new Point(4, 4), "16"));
        m309310.add(new ObjectType(ObjectType.DESKTOP, new Point(4, 3), new Point(4, 3), "17"));
        m309310.add(new ObjectType(ObjectType.DESKTOP, new Point(4, 2), new Point(4, 2), "18"));
        m309310.add(new ObjectType(ObjectType.DESKTOP, new Point(4, 1), new Point(4, 1), "19"));

        m309310.add(new ObjectType(ObjectType.BOOKCASE, new Point(1, 2), new Point(3, 9), null));


        m309310.add(new ObjectType(ObjectType.CORRIDOR, new Point(1, 1), new Point(3, 1), null));
        m309310.add(new ObjectType(ObjectType.CORRIDOR, new Point(1, 10), new Point(3, 10), null));

        m309310.add(new ObjectType(ObjectType.DOOR, new Point(5, 1), new Point(8, 1), "309气象环境借阅处"));
        m309310.add(new ObjectType(ObjectType.DOOR, new Point(5, 10), new Point(8, 10), "310气象环境借阅处"));
        m311312.add(new ObjectType(ObjectType.DESKTOP, new Point(0, 1), new Point(0, 1), "1"));
        m311312.add(new ObjectType(ObjectType.DESKTOP, new Point(1, 1), new Point(1, 1), "2"));
        m311312.add(new ObjectType(ObjectType.DESKTOP, new Point(2, 1), new Point(2, 1), "3"));
        m311312.add(new ObjectType(ObjectType.DESKTOP, new Point(0, 2), new Point(0, 2), "4"));
        m311312.add(new ObjectType(ObjectType.DESKTOP, new Point(1, 2), new Point(1, 2), "5"));
        m311312.add(new ObjectType(ObjectType.DESKTOP, new Point(2, 2), new Point(2, 2), "6"));
        m311312.add(new ObjectType(ObjectType.DESKTOP, new Point(0, 3), new Point(0, 3), "7"));
        m311312.add(new ObjectType(ObjectType.DESKTOP, new Point(1, 3), new Point(1, 3), "8"));
        m311312.add(new ObjectType(ObjectType.DESKTOP, new Point(2, 3), new Point(2, 3), "9"));
        m311312.add(new ObjectType(ObjectType.DESKTOP, new Point(0, 4), new Point(0, 4), "10"));
        m311312.add(new ObjectType(ObjectType.DESKTOP, new Point(1, 4), new Point(1, 4), "11"));
        m311312.add(new ObjectType(ObjectType.DESKTOP, new Point(2, 4), new Point(2, 4), "12"));
        m311312.add(new ObjectType(ObjectType.DESKTOP, new Point(0, 5), new Point(0, 5), "13"));
        m311312.add(new ObjectType(ObjectType.DESKTOP, new Point(1, 5), new Point(1, 5), "14"));
        m311312.add(new ObjectType(ObjectType.DESKTOP, new Point(2, 5), new Point(2, 5), "15"));
        m311312.add(new ObjectType(ObjectType.DESKTOP, new Point(0, 6), new Point(0, 6), "16"));
        m311312.add(new ObjectType(ObjectType.DESKTOP, new Point(1, 6), new Point(1, 6), "17"));
        m311312.add(new ObjectType(ObjectType.DESKTOP, new Point(2, 6), new Point(2, 6), "18"));
        m311312.add(new ObjectType(ObjectType.DESKTOP, new Point(2, 7), new Point(2, 7), "19"));
        m311312.add(new ObjectType(ObjectType.DESKTOP, new Point(2, 8), new Point(2, 8), "20"));
        m311312.add(new ObjectType(ObjectType.DESKTOP, new Point(2, 9), new Point(2, 9), "21"));
        m311312.add(new ObjectType(ObjectType.DESKTOP, new Point(2, 10), new Point(2, 10), "22"));
        m311312.add(new ObjectType(ObjectType.DESKTOP, new Point(2, 11), new Point(2, 11), "23"));
        m311312.add(new ObjectType(ObjectType.DESKTOP, new Point(2, 12), new Point(2, 12), "24"));
        m311312.add(new ObjectType(ObjectType.DESKTOP, new Point(2, 13), new Point(2, 13), "25"));
        m311312.add(new ObjectType(ObjectType.DESKTOP, new Point(2, 14), new Point(2, 14), "26"));
        m311312.add(new ObjectType(ObjectType.DESKTOP, new Point(2, 15), new Point(2, 15), "27"));
        m311312.add(new ObjectType(ObjectType.DESKTOP, new Point(2, 16), new Point(2, 16), "28"));
        m311312.add(new ObjectType(ObjectType.DESKTOP, new Point(2, 17), new Point(2, 17), "29"));
        m311312.add(new ObjectType(ObjectType.DESKTOP, new Point(2, 18), new Point(2, 18), "30"));
        m311312.add(new ObjectType(ObjectType.DESKTOP, new Point(0, 19), new Point(0, 19), "31"));
        m311312.add(new ObjectType(ObjectType.DESKTOP, new Point(1, 19), new Point(1, 19), "32"));
        m311312.add(new ObjectType(ObjectType.DESKTOP, new Point(2, 19), new Point(2, 19), "33"));
        m311312.add(new ObjectType(ObjectType.DESKTOP, new Point(0, 20), new Point(0, 20), "34"));
        m311312.add(new ObjectType(ObjectType.DESKTOP, new Point(1, 20), new Point(1, 20), "35"));
        m311312.add(new ObjectType(ObjectType.DESKTOP, new Point(2, 20), new Point(2, 20), "36"));
        m311312.add(new ObjectType(ObjectType.DESKTOP, new Point(0, 21), new Point(0, 21), "37"));
        m311312.add(new ObjectType(ObjectType.DESKTOP, new Point(1, 21), new Point(1, 21), "38"));
        m311312.add(new ObjectType(ObjectType.DESKTOP, new Point(2, 21), new Point(2, 21), "39"));
        m311312.add(new ObjectType(ObjectType.DESKTOP, new Point(0, 22), new Point(0, 22), "40"));
        m311312.add(new ObjectType(ObjectType.DESKTOP, new Point(1, 22), new Point(1, 22), "41"));
        m311312.add(new ObjectType(ObjectType.DESKTOP, new Point(2, 22), new Point(2, 22), "42"));
        m311312.add(new ObjectType(ObjectType.DESKTOP, new Point(0, 23), new Point(0, 23), "43"));
        m311312.add(new ObjectType(ObjectType.DESKTOP, new Point(1, 23), new Point(1, 23), "44"));
        m311312.add(new ObjectType(ObjectType.DESKTOP, new Point(2, 23), new Point(2, 23), "45"));
        m311312.add(new ObjectType(ObjectType.DESKTOP, new Point(0, 24), new Point(0, 24), "46"));
        m311312.add(new ObjectType(ObjectType.DESKTOP, new Point(1, 24), new Point(1, 24), "47"));
        m311312.add(new ObjectType(ObjectType.DESKTOP, new Point(2, 24), new Point(2, 24), "48"));
        m311312.add(new ObjectType(ObjectType.DESKTOP, new Point(9, 10), new Point(9, 10), "49"));
        m311312.add(new ObjectType(ObjectType.DESKTOP, new Point(9, 11), new Point(9, 11), "50"));
        m311312.add(new ObjectType(ObjectType.DESKTOP, new Point(9, 12), new Point(9, 12), "51"));
        m311312.add(new ObjectType(ObjectType.DESKTOP, new Point(9, 13), new Point(9, 13), "52"));
        m311312.add(new ObjectType(ObjectType.DESKTOP, new Point(9, 14), new Point(9, 14), "53"));

        m311312.add(new ObjectType(ObjectType.BOOKCASE, new Point(3, 1), new Point(5, 7), null));
        m311312.add(new ObjectType(ObjectType.BOOKCASE, new Point(3, 10), new Point(5, 15), null));
        m311312.add(new ObjectType(ObjectType.BOOKCASE, new Point(3, 18), new Point(5, 24), null));

        m311312.add(new ObjectType(ObjectType.CORRIDOR, new Point(3, 8), new Point(5, 9), null));
        m311312.add(new ObjectType(ObjectType.CORRIDOR, new Point(3, 16), new Point(5, 17), null));

        m311312.add(new ObjectType(ObjectType.DOOR, new Point(6, 8), new Point(8, 9), "311文科借阅处"));
        m311312.add(new ObjectType(ObjectType.DOOR, new Point(6, 16), new Point(8, 17), "312文科借阅处"));

        m401402.add(new ObjectType(ObjectType.DESKTOP, new Point(3, 2), new Point(3, 2), "1"));
        m401402.add(new ObjectType(ObjectType.DESKTOP, new Point(3, 3), new Point(3, 3), "2"));


        m401402.add(new ObjectType(ObjectType.BOOKCASE, new Point(0, 1), new Point(2, 11), null));


        m401402.add(new ObjectType(ObjectType.DOOR, new Point(4, 1), new Point(6, 1), "401报刊借阅室"));
        m401402.add(new ObjectType(ObjectType.DOOR, new Point(4, 11), new Point(6, 11), "402报刊借阅室"));

        m403404.add(new ObjectType(ObjectType.DESKTOP, new Point(0, 1), new Point(0, 1), "1"));
        m403404.add(new ObjectType(ObjectType.DESKTOP, new Point(1, 1), new Point(1, 1), "2"));
        m403404.add(new ObjectType(ObjectType.DESKTOP, new Point(2, 1), new Point(2, 1), "3"));
        m403404.add(new ObjectType(ObjectType.DESKTOP, new Point(0, 2), new Point(0, 2), "4"));
        m403404.add(new ObjectType(ObjectType.DESKTOP, new Point(1, 2), new Point(1, 2), "5"));
        m403404.add(new ObjectType(ObjectType.DESKTOP, new Point(2, 2), new Point(2, 2), "6"));
        m403404.add(new ObjectType(ObjectType.DESKTOP, new Point(0, 3), new Point(0, 3), "7"));
        m403404.add(new ObjectType(ObjectType.DESKTOP, new Point(1, 3), new Point(1, 3), "8"));
        m403404.add(new ObjectType(ObjectType.DESKTOP, new Point(2, 3), new Point(2, 3), "9"));
        m403404.add(new ObjectType(ObjectType.DESKTOP, new Point(0, 4), new Point(0, 4), "10"));
        m403404.add(new ObjectType(ObjectType.DESKTOP, new Point(1, 4), new Point(1, 4), "11"));
        m403404.add(new ObjectType(ObjectType.DESKTOP, new Point(2, 4), new Point(2, 4), "12"));
        m403404.add(new ObjectType(ObjectType.DESKTOP, new Point(0, 5), new Point(0, 5), "13"));
        m403404.add(new ObjectType(ObjectType.DESKTOP, new Point(1, 5), new Point(1, 5), "14"));
        m403404.add(new ObjectType(ObjectType.DESKTOP, new Point(2, 5), new Point(2, 5), "15"));
        m403404.add(new ObjectType(ObjectType.DESKTOP, new Point(0, 6), new Point(0, 6), "16"));
        m403404.add(new ObjectType(ObjectType.DESKTOP, new Point(1, 6), new Point(1, 6), "17"));
        m403404.add(new ObjectType(ObjectType.DESKTOP, new Point(2, 6), new Point(2, 6), "18"));
        m403404.add(new ObjectType(ObjectType.DESKTOP, new Point(0, 7), new Point(0, 7), "19"));
        m403404.add(new ObjectType(ObjectType.DESKTOP, new Point(1, 7), new Point(1, 7), "20"));
        m403404.add(new ObjectType(ObjectType.DESKTOP, new Point(2, 7), new Point(2, 7), "21"));
        m403404.add(new ObjectType(ObjectType.DESKTOP, new Point(0, 8), new Point(0, 8), "22"));
        m403404.add(new ObjectType(ObjectType.DESKTOP, new Point(1, 8), new Point(1, 8), "23"));
        m403404.add(new ObjectType(ObjectType.DESKTOP, new Point(2, 8), new Point(2, 8), "24"));
        m403404.add(new ObjectType(ObjectType.DESKTOP, new Point(2, 9), new Point(2, 9), "25"));
        m403404.add(new ObjectType(ObjectType.DESKTOP, new Point(2, 10), new Point(2, 10), "26"));
        m403404.add(new ObjectType(ObjectType.DESKTOP, new Point(2, 11), new Point(2, 11), "27"));
        m403404.add(new ObjectType(ObjectType.DESKTOP, new Point(2, 12), new Point(2, 12), "28"));
        m403404.add(new ObjectType(ObjectType.DESKTOP, new Point(2, 13), new Point(2, 13), "29"));
        m403404.add(new ObjectType(ObjectType.DESKTOP, new Point(2, 14), new Point(2, 14), "30"));
        m403404.add(new ObjectType(ObjectType.DESKTOP, new Point(2, 15), new Point(2, 15), "31"));
        m403404.add(new ObjectType(ObjectType.DESKTOP, new Point(2, 16), new Point(2, 16), "32"));
        m403404.add(new ObjectType(ObjectType.DESKTOP, new Point(2, 17), new Point(2, 17), "33"));
        m403404.add(new ObjectType(ObjectType.DESKTOP, new Point(2, 18), new Point(2, 18), "34"));
        m403404.add(new ObjectType(ObjectType.DESKTOP, new Point(2, 19), new Point(2, 19), "35"));
        m403404.add(new ObjectType(ObjectType.DESKTOP, new Point(2, 20), new Point(2, 20), "36"));
        m403404.add(new ObjectType(ObjectType.DESKTOP, new Point(2, 21), new Point(2, 21), "37"));
        m403404.add(new ObjectType(ObjectType.DESKTOP, new Point(1, 22), new Point(1, 22), "38"));
        m403404.add(new ObjectType(ObjectType.DESKTOP, new Point(0, 22), new Point(0, 22), "39"));
        m403404.add(new ObjectType(ObjectType.DESKTOP, new Point(1, 23), new Point(1, 23), "40"));
        m403404.add(new ObjectType(ObjectType.DESKTOP, new Point(0, 23), new Point(0, 23), "41"));
        m403404.add(new ObjectType(ObjectType.DESKTOP, new Point(1, 24), new Point(1, 24), "42"));
        m403404.add(new ObjectType(ObjectType.DESKTOP, new Point(0, 24), new Point(0, 24), "43"));
        m403404.add(new ObjectType(ObjectType.DESKTOP, new Point(1, 25), new Point(1, 25), "44"));
        m403404.add(new ObjectType(ObjectType.DESKTOP, new Point(0, 25), new Point(0, 25), "45"));
        m403404.add(new ObjectType(ObjectType.DESKTOP, new Point(1, 26), new Point(1, 26), "46"));
        m403404.add(new ObjectType(ObjectType.DESKTOP, new Point(0, 26), new Point(0, 26), "47"));
        m403404.add(new ObjectType(ObjectType.DESKTOP, new Point(1, 27), new Point(1, 27), "48"));
        m403404.add(new ObjectType(ObjectType.DESKTOP, new Point(0, 27), new Point(0, 27), "49"));
        m403404.add(new ObjectType(ObjectType.DESKTOP, new Point(1, 28), new Point(1, 28), "50"));
        m403404.add(new ObjectType(ObjectType.DESKTOP, new Point(0, 28), new Point(0, 28), "51"));
        m403404.add(new ObjectType(ObjectType.DESKTOP, new Point(1, 29), new Point(1, 29), "52"));
        m403404.add(new ObjectType(ObjectType.DESKTOP, new Point(0, 29), new Point(0, 29), "53"));
        m403404.add(new ObjectType(ObjectType.DESKTOP, new Point(1, 30), new Point(1, 30), "54"));
        m403404.add(new ObjectType(ObjectType.DESKTOP, new Point(0, 30), new Point(0, 30), "55"));
        m403404.add(new ObjectType(ObjectType.DESKTOP, new Point(9, 12), new Point(9, 12), "56"));
        m403404.add(new ObjectType(ObjectType.DESKTOP, new Point(9, 13), new Point(9, 13), "57"));
        m403404.add(new ObjectType(ObjectType.DESKTOP, new Point(9, 14), new Point(9, 14), "58"));
        m403404.add(new ObjectType(ObjectType.DESKTOP, new Point(9, 15), new Point(9, 15), "59"));
        m403404.add(new ObjectType(ObjectType.DESKTOP, new Point(9, 16), new Point(9, 16), "60"));


        m403404.add(new ObjectType(ObjectType.BOOKCASE, new Point(3, 1), new Point(4, 9), null));
        m403404.add(new ObjectType(ObjectType.BOOKCASE, new Point(3, 12), new Point(4, 18), null));
        m403404.add(new ObjectType(ObjectType.BOOKCASE, new Point(3, 21), new Point(4, 30), null));

        m403404.add(new ObjectType(ObjectType.CORRIDOR, new Point(3, 10), new Point(4, 11), null));
        m403404.add(new ObjectType(ObjectType.CORRIDOR, new Point(3, 19), new Point(4, 20), null));

        m403404.add(new ObjectType(ObjectType.DOOR, new Point(5, 10), new Point(8, 10), "403语言文化借阅处"));
        m403404.add(new ObjectType(ObjectType.DOOR, new Point(5, 19), new Point(8, 19), "404语言文化借阅处"));

        m406407.add(new ObjectType(ObjectType.DESKTOP, new Point(3, 2), new Point(3, 2), "1"));
        m406407.add(new ObjectType(ObjectType.DESKTOP, new Point(3, 3), new Point(3, 3), "2"));
        m406407.add(new ObjectType(ObjectType.DESKTOP, new Point(3, 4), new Point(3, 4), "3"));
        m406407.add(new ObjectType(ObjectType.DESKTOP, new Point(3, 5), new Point(3, 5), "4"));
        m406407.add(new ObjectType(ObjectType.DESKTOP, new Point(3, 6), new Point(3, 6), "5"));
        m406407.add(new ObjectType(ObjectType.DESKTOP, new Point(3, 7), new Point(3, 7), "6"));
        m406407.add(new ObjectType(ObjectType.DESKTOP, new Point(3, 8), new Point(3, 8), "7"));

        m406407.add(new ObjectType(ObjectType.BOOKCASE, new Point(0, 1), new Point(2, 10), null));


        m406407.add(new ObjectType(ObjectType.DOOR, new Point(4, 1), new Point(8, 1), "406外文过刊借阅室"));
        m406407.add(new ObjectType(ObjectType.DOOR, new Point(4, 9), new Point(8, 9), "407外文过刊借阅室"));

        m408409.add(new ObjectType(ObjectType.DESKTOP, new Point(0, 5), new Point(0, 5), "1"));
        m408409.add(new ObjectType(ObjectType.DESKTOP, new Point(0, 6), new Point(0, 6), "2"));
        m408409.add(new ObjectType(ObjectType.DESKTOP, new Point(0, 7), new Point(0, 7), "3"));
        m408409.add(new ObjectType(ObjectType.DESKTOP, new Point(0, 8), new Point(0, 8), "4"));
        m408409.add(new ObjectType(ObjectType.DESKTOP, new Point(0, 9), new Point(0, 9), "5"));
        m408409.add(new ObjectType(ObjectType.DESKTOP, new Point(0, 10), new Point(0, 10), "6"));
        m408409.add(new ObjectType(ObjectType.DESKTOP, new Point(0, 11), new Point(0, 11), "7"));
        m408409.add(new ObjectType(ObjectType.DESKTOP, new Point(0, 12), new Point(0, 12), "8"));
        m408409.add(new ObjectType(ObjectType.DESKTOP, new Point(0, 13), new Point(0, 13), "9"));
        m408409.add(new ObjectType(ObjectType.DESKTOP, new Point(0, 14), new Point(0, 14), "10"));
        m408409.add(new ObjectType(ObjectType.DESKTOP, new Point(2, 6), new Point(2, 6), "11"));
        m408409.add(new ObjectType(ObjectType.DESKTOP, new Point(2, 7), new Point(2, 7), "12"));
        m408409.add(new ObjectType(ObjectType.DESKTOP, new Point(2, 8), new Point(2, 8), "13"));
        m408409.add(new ObjectType(ObjectType.DESKTOP, new Point(2, 9), new Point(2, 9), "14"));
        m408409.add(new ObjectType(ObjectType.DESKTOP, new Point(2, 12), new Point(2, 12), "15"));
        m408409.add(new ObjectType(ObjectType.DESKTOP, new Point(5, 7), new Point(5, 7), "16"));
        m408409.add(new ObjectType(ObjectType.DESKTOP, new Point(5, 8), new Point(5, 8), "17"));
        m408409.add(new ObjectType(ObjectType.DESKTOP, new Point(5, 9), new Point(5, 9), "18"));
        m408409.add(new ObjectType(ObjectType.DESKTOP, new Point(5, 10), new Point(5, 10), "19"));
        m408409.add(new ObjectType(ObjectType.DESKTOP, new Point(9, 7), new Point(9, 7), "20"));
        m408409.add(new ObjectType(ObjectType.DESKTOP, new Point(9, 8), new Point(9, 8), "21"));
        m408409.add(new ObjectType(ObjectType.DESKTOP, new Point(9, 9), new Point(9, 9), "22"));
        m408409.add(new ObjectType(ObjectType.DESKTOP, new Point(9, 10), new Point(9, 10), "23"));
        m408409.add(new ObjectType(ObjectType.DESKTOP, new Point(9, 11), new Point(9, 11), "24"));

        m408409.add(new ObjectType(ObjectType.BOOKCASE, new Point(0, 1), new Point(5, 4), null));
        m408409.add(new ObjectType(ObjectType.BOOKCASE, new Point(3, 6), new Point(4, 13), null));
        m408409.add(new ObjectType(ObjectType.BOOKCASE, new Point(0, 15), new Point(5, 16), null));
        
        m408409.add(new ObjectType(ObjectType.CORRIDOR, new Point(1, 5), new Point(5, 5), null));
        m408409.add(new ObjectType(ObjectType.CORRIDOR, new Point(1, 6), new Point(1, 12), null));
        m408409.add(new ObjectType(ObjectType.CORRIDOR, new Point(1, 14), new Point(5, 14), null));
        m408409.add(new ObjectType(ObjectType.CORRIDOR, new Point(2, 10), new Point(2, 11), null));
        m408409.add(new ObjectType(ObjectType.CORRIDOR, new Point(2, 13), new Point(2, 13), null));


        m408409.add(new ObjectType(ObjectType.DOOR, new Point(6, 6), new Point(9, 6), "408自然期刊阅览处"));
        m408409.add(new ObjectType(ObjectType.DOOR, new Point(6, 13), new Point(9, 13), "409自然期刊借阅处"));

        m501502.add(new ObjectType(ObjectType.DESKTOP, new Point(0, 2), new Point(0, 2), "1"));
        m501502.add(new ObjectType(ObjectType.DESKTOP, new Point(0, 3), new Point(0, 3), "2"));
        m501502.add(new ObjectType(ObjectType.DESKTOP, new Point(0, 4), new Point(0, 4), "3"));
        m501502.add(new ObjectType(ObjectType.DESKTOP, new Point(0, 5), new Point(0, 5), "4"));
        m501502.add(new ObjectType(ObjectType.DESKTOP, new Point(0, 6), new Point(0, 6), "5"));
        m501502.add(new ObjectType(ObjectType.DESKTOP, new Point(0, 7), new Point(0, 7), "6"));
        m501502.add(new ObjectType(ObjectType.DESKTOP, new Point(0, 8), new Point(0, 8), "7"));
        m501502.add(new ObjectType(ObjectType.DESKTOP, new Point(0, 9), new Point(0, 9), "8"));
        m501502.add(new ObjectType(ObjectType.DESKTOP, new Point(0, 10), new Point(0, 10), "9"));
        m501502.add(new ObjectType(ObjectType.DESKTOP, new Point(1, 10), new Point(1, 10), "10"));
        m501502.add(new ObjectType(ObjectType.DESKTOP, new Point(2, 10), new Point(2, 10), "11"));
        m501502.add(new ObjectType(ObjectType.DESKTOP, new Point(3, 10), new Point(3, 10), "12"));
        m501502.add(new ObjectType(ObjectType.DESKTOP, new Point(3, 9), new Point(3, 9), "13"));
        m501502.add(new ObjectType(ObjectType.DESKTOP, new Point(3, 8), new Point(3, 8), "14"));
        m501502.add(new ObjectType(ObjectType.DESKTOP, new Point(3, 7), new Point(3, 7), "15"));
        m501502.add(new ObjectType(ObjectType.DESKTOP, new Point(3, 6), new Point(3, 6), "16"));
        m501502.add(new ObjectType(ObjectType.DESKTOP, new Point(3, 5), new Point(3, 5), "17"));
        m501502.add(new ObjectType(ObjectType.DESKTOP, new Point(3, 4), new Point(3, 4), "18"));
        m501502.add(new ObjectType(ObjectType.DESKTOP, new Point(3, 3), new Point(3, 3), "19"));
        m501502.add(new ObjectType(ObjectType.DESKTOP, new Point(3, 2), new Point(3, 2), "20"));
        m501502.add(new ObjectType(ObjectType.DESKTOP, new Point(2, 2), new Point(2, 2), "21"));
        m501502.add(new ObjectType(ObjectType.DESKTOP, new Point(1, 2), new Point(1, 2), "22"));


        m501502.add(new ObjectType(ObjectType.BOOKCASE, new Point(0, 1), new Point(3, 1), null));
        m501502.add(new ObjectType(ObjectType.BOOKCASE, new Point(1, 3), new Point(2, 9), null));
        m501502.add(new ObjectType(ObjectType.BOOKCASE, new Point(0, 11), new Point(3, 12), null));


        m501502.add(new ObjectType(ObjectType.DOOR, new Point(4, 1), new Point(8, 1), "501艺术图书借阅处"));
        m501502.add(new ObjectType(ObjectType.DOOR, new Point(4, 11), new Point(8, 11), "502艺术图书借阅处"));

        m503504.add(new ObjectType(ObjectType.DESKTOP, new Point(0, 1), new Point(0, 1), "1"));
        m503504.add(new ObjectType(ObjectType.DESKTOP, new Point(1, 1), new Point(1, 1), "2"));
        m503504.add(new ObjectType(ObjectType.DESKTOP, new Point(0, 2), new Point(0, 2), "3"));
        m503504.add(new ObjectType(ObjectType.DESKTOP, new Point(1, 2), new Point(1, 2), "4"));
        m503504.add(new ObjectType(ObjectType.DESKTOP, new Point(0, 3), new Point(0, 3), "5"));
        m503504.add(new ObjectType(ObjectType.DESKTOP, new Point(1, 3), new Point(1, 3), "6"));
        m503504.add(new ObjectType(ObjectType.DESKTOP, new Point(0, 4), new Point(0, 4), "7"));
        m503504.add(new ObjectType(ObjectType.DESKTOP, new Point(1, 4), new Point(1, 4), "8"));
        m503504.add(new ObjectType(ObjectType.DESKTOP, new Point(0, 5), new Point(0, 5), "9"));
        m503504.add(new ObjectType(ObjectType.DESKTOP, new Point(1, 5), new Point(1, 5), "10"));
        m503504.add(new ObjectType(ObjectType.DESKTOP, new Point(0, 6), new Point(0, 6), "11"));
        m503504.add(new ObjectType(ObjectType.DESKTOP, new Point(1, 6), new Point(1, 6), "12"));
        m503504.add(new ObjectType(ObjectType.DESKTOP, new Point(0, 7), new Point(0, 7), "13"));
        m503504.add(new ObjectType(ObjectType.DESKTOP, new Point(1, 7), new Point(1, 7), "14"));
        m503504.add(new ObjectType(ObjectType.DESKTOP, new Point(0, 8), new Point(0, 8), "15"));
        m503504.add(new ObjectType(ObjectType.DESKTOP, new Point(1, 8), new Point(1, 8), "16"));
        m503504.add(new ObjectType(ObjectType.DESKTOP, new Point(0, 9), new Point(0, 9), "17"));
        m503504.add(new ObjectType(ObjectType.DESKTOP, new Point(1, 9), new Point(1, 9), "18"));
        m503504.add(new ObjectType(ObjectType.DESKTOP, new Point(0, 10), new Point(0, 10), "19"));
        m503504.add(new ObjectType(ObjectType.DESKTOP, new Point(1, 10), new Point(1, 10), "20"));
        m503504.add(new ObjectType(ObjectType.DESKTOP, new Point(0, 11), new Point(0, 11), "21"));
        m503504.add(new ObjectType(ObjectType.DESKTOP, new Point(1, 11), new Point(1, 11), "22"));
        m503504.add(new ObjectType(ObjectType.DESKTOP, new Point(0, 12), new Point(0, 12), "23"));
        m503504.add(new ObjectType(ObjectType.DESKTOP, new Point(1, 12), new Point(1, 12), "24"));
        m503504.add(new ObjectType(ObjectType.DESKTOP, new Point(0, 13), new Point(0, 13), "25"));
        m503504.add(new ObjectType(ObjectType.DESKTOP, new Point(1, 13), new Point(1, 13), "26"));
        m503504.add(new ObjectType(ObjectType.DESKTOP, new Point(0, 14), new Point(0, 14), "27"));
        m503504.add(new ObjectType(ObjectType.DESKTOP, new Point(1, 14), new Point(1, 14), "28"));
        m503504.add(new ObjectType(ObjectType.DESKTOP, new Point(0, 15), new Point(0, 15), "29"));
        m503504.add(new ObjectType(ObjectType.DESKTOP, new Point(1, 15), new Point(1, 15), "30"));
        m503504.add(new ObjectType(ObjectType.DESKTOP, new Point(0, 16), new Point(0, 16), "31"));
        m503504.add(new ObjectType(ObjectType.DESKTOP, new Point(1, 16), new Point(1, 16), "32"));
        m503504.add(new ObjectType(ObjectType.DESKTOP, new Point(0, 17), new Point(0, 17), "33"));
        m503504.add(new ObjectType(ObjectType.DESKTOP, new Point(1, 17), new Point(1, 17), "34"));
        m503504.add(new ObjectType(ObjectType.DESKTOP, new Point(0, 18), new Point(0, 18), "35"));
        m503504.add(new ObjectType(ObjectType.DESKTOP, new Point(1, 18), new Point(1, 18), "36"));
        m503504.add(new ObjectType(ObjectType.DESKTOP, new Point(0, 19), new Point(0, 19), "37"));
        m503504.add(new ObjectType(ObjectType.DESKTOP, new Point(1, 19), new Point(1, 19), "38"));
        m503504.add(new ObjectType(ObjectType.DESKTOP, new Point(0, 20), new Point(0, 20), "39"));
        m503504.add(new ObjectType(ObjectType.DESKTOP, new Point(1, 20), new Point(1, 20), "40"));
        m503504.add(new ObjectType(ObjectType.DESKTOP, new Point(0, 21), new Point(0, 21), "41"));
        m503504.add(new ObjectType(ObjectType.DESKTOP, new Point(1, 21), new Point(1, 21), "42"));
        m503504.add(new ObjectType(ObjectType.DESKTOP, new Point(0, 22), new Point(0, 22), "43"));
        m503504.add(new ObjectType(ObjectType.DESKTOP, new Point(1, 22), new Point(1, 22), "44"));
        m503504.add(new ObjectType(ObjectType.DESKTOP, new Point(0, 23), new Point(0, 23), "45"));
        m503504.add(new ObjectType(ObjectType.DESKTOP, new Point(1, 23), new Point(1, 23), "46"));
        m503504.add(new ObjectType(ObjectType.DESKTOP, new Point(0, 24), new Point(0, 24), "47"));
        m503504.add(new ObjectType(ObjectType.DESKTOP, new Point(1, 24), new Point(1, 24), "48"));
        m503504.add(new ObjectType(ObjectType.DESKTOP, new Point(0, 25), new Point(0, 25), "49"));
        m503504.add(new ObjectType(ObjectType.DESKTOP, new Point(1, 25), new Point(1, 25), "50"));
        m503504.add(new ObjectType(ObjectType.DESKTOP, new Point(0, 26), new Point(0, 26), "51"));
        m503504.add(new ObjectType(ObjectType.DESKTOP, new Point(1, 26), new Point(1, 26), "52"));
        m503504.add(new ObjectType(ObjectType.DESKTOP, new Point(0, 27), new Point(0, 27), "53"));
        m503504.add(new ObjectType(ObjectType.DESKTOP, new Point(1, 27), new Point(1, 27), "54"));
        m503504.add(new ObjectType(ObjectType.DESKTOP, new Point(0, 28), new Point(0, 28), "55"));
        m503504.add(new ObjectType(ObjectType.DESKTOP, new Point(1, 28), new Point(1, 28), "56"));
        m503504.add(new ObjectType(ObjectType.DESKTOP, new Point(4, 11), new Point(4, 11), "57"));
        m503504.add(new ObjectType(ObjectType.DESKTOP, new Point(4, 12), new Point(4, 12), "58"));
        m503504.add(new ObjectType(ObjectType.DESKTOP, new Point(4, 13), new Point(4, 13), "59"));
        m503504.add(new ObjectType(ObjectType.DESKTOP, new Point(4, 14), new Point(4, 14), "60"));
        m503504.add(new ObjectType(ObjectType.DESKTOP, new Point(4, 15), new Point(4, 15), "61"));
        m503504.add(new ObjectType(ObjectType.DESKTOP, new Point(4, 16), new Point(4, 16), "62"));
        m503504.add(new ObjectType(ObjectType.DESKTOP, new Point(4, 17), new Point(4, 17), "63"));
        m503504.add(new ObjectType(ObjectType.DESKTOP, new Point(8, 12), new Point(8, 12), "64"));
        m503504.add(new ObjectType(ObjectType.DESKTOP, new Point(8, 13), new Point(8, 13), "65"));
        m503504.add(new ObjectType(ObjectType.DESKTOP, new Point(8, 14), new Point(8, 14), "66"));
        m503504.add(new ObjectType(ObjectType.DESKTOP, new Point(8, 15), new Point(8, 15), "67"));
        m503504.add(new ObjectType(ObjectType.DESKTOP, new Point(8, 16), new Point(8, 16), "68"));


        m503504.add(new ObjectType(ObjectType.BOOKCASE, new Point(2, 1), new Point(4, 9), null));
        m503504.add(new ObjectType(ObjectType.BOOKCASE, new Point(2, 12), new Point(3, 16), null));
        m503504.add(new ObjectType(ObjectType.BOOKCASE, new Point(2, 19), new Point(4, 28), null));

        m503504.add(new ObjectType(ObjectType.CORRIDOR, new Point(2, 10), new Point(4, 10), null));
        m503504.add(new ObjectType(ObjectType.CORRIDOR, new Point(2, 11), new Point(3, 11), null));
        m503504.add(new ObjectType(ObjectType.CORRIDOR, new Point(2, 17), new Point(3, 17), null));
        m503504.add(new ObjectType(ObjectType.CORRIDOR, new Point(2, 18), new Point(4, 18), null));


        m503504.add(new ObjectType(ObjectType.DOOR, new Point(5, 10), new Point(8, 11), "503文科借阅室1"));
        m503504.add(new ObjectType(ObjectType.DOOR, new Point(5, 17), new Point(8, 18), "504文科借阅室1"));

        m510511.add(new ObjectType(ObjectType.DESKTOP, new Point(0, 1), new Point(0, 1), "1"));
        m510511.add(new ObjectType(ObjectType.DESKTOP, new Point(1, 1), new Point(1, 1), "2"));
        m510511.add(new ObjectType(ObjectType.DESKTOP, new Point(0, 2), new Point(0, 2), "3"));
        m510511.add(new ObjectType(ObjectType.DESKTOP, new Point(1, 2), new Point(1, 2), "4"));
        m510511.add(new ObjectType(ObjectType.DESKTOP, new Point(0, 3), new Point(0, 3), "5"));
        m510511.add(new ObjectType(ObjectType.DESKTOP, new Point(1, 3), new Point(1, 3), "6"));
        m510511.add(new ObjectType(ObjectType.DESKTOP, new Point(0, 4), new Point(0, 4), "7"));
        m510511.add(new ObjectType(ObjectType.DESKTOP, new Point(1, 4), new Point(1, 4), "8"));
        m510511.add(new ObjectType(ObjectType.DESKTOP, new Point(0, 5), new Point(0, 5), "9"));
        m510511.add(new ObjectType(ObjectType.DESKTOP, new Point(1, 5), new Point(1, 5), "10"));
        m510511.add(new ObjectType(ObjectType.DESKTOP, new Point(0, 6), new Point(0, 6), "11"));
        m510511.add(new ObjectType(ObjectType.DESKTOP, new Point(1, 6), new Point(1, 6), "12"));
        m510511.add(new ObjectType(ObjectType.DESKTOP, new Point(0, 7), new Point(0, 7), "13"));
        m510511.add(new ObjectType(ObjectType.DESKTOP, new Point(1, 7), new Point(1, 7), "14"));
        m510511.add(new ObjectType(ObjectType.DESKTOP, new Point(0, 8), new Point(0, 8), "15"));
        m510511.add(new ObjectType(ObjectType.DESKTOP, new Point(1, 8), new Point(1, 8), "16"));
        m510511.add(new ObjectType(ObjectType.DESKTOP, new Point(0, 9), new Point(0, 9), "17"));
        m510511.add(new ObjectType(ObjectType.DESKTOP, new Point(1, 9), new Point(1, 9), "18"));
        m510511.add(new ObjectType(ObjectType.DESKTOP, new Point(0, 10), new Point(0, 10), "19"));
        m510511.add(new ObjectType(ObjectType.DESKTOP, new Point(1, 10), new Point(1, 10), "20"));
        m510511.add(new ObjectType(ObjectType.DESKTOP, new Point(0, 11), new Point(0, 11), "21"));
        m510511.add(new ObjectType(ObjectType.DESKTOP, new Point(1, 11), new Point(1, 11), "22"));
        m510511.add(new ObjectType(ObjectType.DESKTOP, new Point(0, 12), new Point(0, 12), "23"));
        m510511.add(new ObjectType(ObjectType.DESKTOP, new Point(1, 12), new Point(1, 12), "24"));
        m510511.add(new ObjectType(ObjectType.DESKTOP, new Point(0, 13), new Point(0, 13), "25"));
        m510511.add(new ObjectType(ObjectType.DESKTOP, new Point(1, 13), new Point(1, 13), "26"));
        m510511.add(new ObjectType(ObjectType.DESKTOP, new Point(0, 14), new Point(0, 14), "27"));
        m510511.add(new ObjectType(ObjectType.DESKTOP, new Point(1, 14), new Point(1, 14), "28"));
        m510511.add(new ObjectType(ObjectType.DESKTOP, new Point(0, 15), new Point(0, 15), "29"));
        m510511.add(new ObjectType(ObjectType.DESKTOP, new Point(1, 15), new Point(1, 15), "30"));
        m510511.add(new ObjectType(ObjectType.DESKTOP, new Point(0, 16), new Point(0, 16), "31"));
        m510511.add(new ObjectType(ObjectType.DESKTOP, new Point(1, 16), new Point(1, 16), "32"));
        m510511.add(new ObjectType(ObjectType.DESKTOP, new Point(0, 17), new Point(0, 17), "33"));
        m510511.add(new ObjectType(ObjectType.DESKTOP, new Point(1, 17), new Point(1, 17), "34"));
        m510511.add(new ObjectType(ObjectType.DESKTOP, new Point(0, 18), new Point(0, 18), "35"));
        m510511.add(new ObjectType(ObjectType.DESKTOP, new Point(1, 18), new Point(1, 18), "36"));
        m510511.add(new ObjectType(ObjectType.DESKTOP, new Point(0, 19), new Point(0, 19), "37"));
        m510511.add(new ObjectType(ObjectType.DESKTOP, new Point(1, 19), new Point(1, 19), "38"));
        m510511.add(new ObjectType(ObjectType.DESKTOP, new Point(0, 20), new Point(0, 20), "39"));
        m510511.add(new ObjectType(ObjectType.DESKTOP, new Point(1, 20), new Point(1, 20), "40"));
        m510511.add(new ObjectType(ObjectType.DESKTOP, new Point(0, 21), new Point(0, 21), "41"));
        m510511.add(new ObjectType(ObjectType.DESKTOP, new Point(1, 21), new Point(1, 21), "42"));
        m510511.add(new ObjectType(ObjectType.DESKTOP, new Point(0, 22), new Point(0, 22), "43"));
        m510511.add(new ObjectType(ObjectType.DESKTOP, new Point(1, 22), new Point(1, 22), "44"));
        m510511.add(new ObjectType(ObjectType.DESKTOP, new Point(0, 23), new Point(0, 23), "45"));
        m510511.add(new ObjectType(ObjectType.DESKTOP, new Point(1, 23), new Point(1, 23), "46"));
        m510511.add(new ObjectType(ObjectType.DESKTOP, new Point(0, 24), new Point(0, 24), "47"));
        m510511.add(new ObjectType(ObjectType.DESKTOP, new Point(1, 24), new Point(1, 24), "48"));
        m510511.add(new ObjectType(ObjectType.DESKTOP, new Point(0, 25), new Point(0, 25), "49"));
        m510511.add(new ObjectType(ObjectType.DESKTOP, new Point(1, 25), new Point(1, 25), "50"));
        m510511.add(new ObjectType(ObjectType.DESKTOP, new Point(4, 11), new Point(4, 11), "51"));
        m510511.add(new ObjectType(ObjectType.DESKTOP, new Point(4, 12), new Point(4, 12), "52"));
        m510511.add(new ObjectType(ObjectType.DESKTOP, new Point(4, 13), new Point(4, 13), "53"));
        m510511.add(new ObjectType(ObjectType.DESKTOP, new Point(4, 14), new Point(4, 14), "54"));
        m510511.add(new ObjectType(ObjectType.DESKTOP, new Point(4, 15), new Point(4, 15), "55"));
        m510511.add(new ObjectType(ObjectType.DESKTOP, new Point(8, 11), new Point(8, 11), "56"));
        m510511.add(new ObjectType(ObjectType.DESKTOP, new Point(8, 12), new Point(8, 12), "57"));
        m510511.add(new ObjectType(ObjectType.DESKTOP, new Point(8, 13), new Point(8, 13), "58"));
        m510511.add(new ObjectType(ObjectType.DESKTOP, new Point(8, 14), new Point(8, 14), "59"));
        m510511.add(new ObjectType(ObjectType.DESKTOP, new Point(8, 15), new Point(8, 15), "60"));



        m510511.add(new ObjectType(ObjectType.BOOKCASE, new Point(2, 1), new Point(4, 9), null));
        m510511.add(new ObjectType(ObjectType.BOOKCASE, new Point(2, 11), new Point(3, 16), null));
        m510511.add(new ObjectType(ObjectType.BOOKCASE, new Point(2, 18), new Point(4, 25), null));

        m510511.add(new ObjectType(ObjectType.CORRIDOR, new Point(2, 10), new Point(4, 10), null));
        m510511.add(new ObjectType(ObjectType.CORRIDOR, new Point(2, 17), new Point(4, 17), null));


        m510511.add(new ObjectType(ObjectType.DOOR, new Point(5, 10), new Point(7, 10), "510文科借阅处"));
        m510511.add(new ObjectType(ObjectType.DOOR, new Point(5, 17), new Point(7, 17), "511文科借阅处"));

        m601602.add(new ObjectType(ObjectType.DESKTOP, new Point(0, 1), new Point(0, 1), "1"));
        m601602.add(new ObjectType(ObjectType.DESKTOP, new Point(0, 2), new Point(0, 2), "2"));
        m601602.add(new ObjectType(ObjectType.DESKTOP, new Point(0, 3), new Point(0, 3), "3"));
        m601602.add(new ObjectType(ObjectType.DESKTOP, new Point(0, 4), new Point(0, 4), "4"));
        m601602.add(new ObjectType(ObjectType.DESKTOP, new Point(0, 5), new Point(0, 5), "5"));
        m601602.add(new ObjectType(ObjectType.DESKTOP, new Point(0, 6), new Point(0, 6), "6"));
        m601602.add(new ObjectType(ObjectType.DESKTOP, new Point(0, 7), new Point(0, 7), "7"));
        m601602.add(new ObjectType(ObjectType.DESKTOP, new Point(0, 8), new Point(0, 8), "8"));
        m601602.add(new ObjectType(ObjectType.DESKTOP, new Point(0, 9), new Point(0, 9), "9"));
        m601602.add(new ObjectType(ObjectType.DESKTOP, new Point(2, 9), new Point(2, 9), "10"));
        m601602.add(new ObjectType(ObjectType.DESKTOP, new Point(2, 8), new Point(2, 8), "11"));
        m601602.add(new ObjectType(ObjectType.DESKTOP, new Point(2, 7), new Point(2, 7), "12"));
        m601602.add(new ObjectType(ObjectType.DESKTOP, new Point(2, 6), new Point(2, 6), "13"));
        m601602.add(new ObjectType(ObjectType.DESKTOP, new Point(2, 5), new Point(2, 5), "14"));
        m601602.add(new ObjectType(ObjectType.DESKTOP, new Point(2, 4), new Point(2, 4), "15"));
        m601602.add(new ObjectType(ObjectType.DESKTOP, new Point(2, 3), new Point(2, 3), "16"));
        m601602.add(new ObjectType(ObjectType.DESKTOP, new Point(2, 2), new Point(2, 2), "17"));
        m601602.add(new ObjectType(ObjectType.DESKTOP, new Point(2, 1), new Point(2, 1), "18"));

        m601602.add(new ObjectType(ObjectType.BOOKCASE, new Point(1, 1), new Point(1, 9), null));

        m601602.add(new ObjectType(ObjectType.DOOR, new Point(3, 1), new Point(6, 1), "601外文借阅室"));
        m601602.add(new ObjectType(ObjectType.DOOR, new Point(3, 9), new Point(6, 9), "602外文借阅室"));

        m603604.add(new ObjectType(ObjectType.DESKTOP, new Point(0, 1), new Point(0, 1), "1"));
        m603604.add(new ObjectType(ObjectType.DESKTOP, new Point(1, 1), new Point(1, 1), "2"));
        m603604.add(new ObjectType(ObjectType.DESKTOP, new Point(0, 2), new Point(0, 2), "3"));
        m603604.add(new ObjectType(ObjectType.DESKTOP, new Point(1, 2), new Point(1, 2), "4"));
        m603604.add(new ObjectType(ObjectType.DESKTOP, new Point(0, 3), new Point(0, 3), "5"));
        m603604.add(new ObjectType(ObjectType.DESKTOP, new Point(1, 3), new Point(1, 3), "6"));
        m603604.add(new ObjectType(ObjectType.DESKTOP, new Point(0, 4), new Point(0, 4), "7"));
        m603604.add(new ObjectType(ObjectType.DESKTOP, new Point(1, 4), new Point(1, 4), "8"));
        m603604.add(new ObjectType(ObjectType.DESKTOP, new Point(0, 5), new Point(0, 5), "9"));
        m603604.add(new ObjectType(ObjectType.DESKTOP, new Point(1, 5), new Point(1, 5), "10"));
        m603604.add(new ObjectType(ObjectType.DESKTOP, new Point(0, 6), new Point(0, 6), "11"));
        m603604.add(new ObjectType(ObjectType.DESKTOP, new Point(1, 6), new Point(1, 6), "12"));
        m603604.add(new ObjectType(ObjectType.DESKTOP, new Point(0, 7), new Point(0, 7), "13"));
        m603604.add(new ObjectType(ObjectType.DESKTOP, new Point(1, 7), new Point(1, 7), "14"));
        m603604.add(new ObjectType(ObjectType.DESKTOP, new Point(0, 8), new Point(0, 8), "15"));
        m603604.add(new ObjectType(ObjectType.DESKTOP, new Point(1, 8), new Point(1, 8), "16"));
        m603604.add(new ObjectType(ObjectType.DESKTOP, new Point(0, 9), new Point(0, 9), "17"));
        m603604.add(new ObjectType(ObjectType.DESKTOP, new Point(1, 9), new Point(1, 9), "18"));
        m603604.add(new ObjectType(ObjectType.DESKTOP, new Point(0, 10), new Point(0, 10), "19"));
        m603604.add(new ObjectType(ObjectType.DESKTOP, new Point(1, 10), new Point(1, 10), "20"));
        m603604.add(new ObjectType(ObjectType.DESKTOP, new Point(0, 11), new Point(0, 11), "21"));
        m603604.add(new ObjectType(ObjectType.DESKTOP, new Point(1, 11), new Point(1, 11), "22"));
        m603604.add(new ObjectType(ObjectType.DESKTOP, new Point(0, 12), new Point(0, 12), "23"));
        m603604.add(new ObjectType(ObjectType.DESKTOP, new Point(1, 12), new Point(1, 12), "24"));
        m603604.add(new ObjectType(ObjectType.DESKTOP, new Point(0, 13), new Point(0, 13), "25"));
        m603604.add(new ObjectType(ObjectType.DESKTOP, new Point(1, 13), new Point(1, 13), "26"));
        m603604.add(new ObjectType(ObjectType.DESKTOP, new Point(0, 14), new Point(0, 14), "27"));
        m603604.add(new ObjectType(ObjectType.DESKTOP, new Point(1, 14), new Point(1, 14), "28"));
        m603604.add(new ObjectType(ObjectType.DESKTOP, new Point(0, 15), new Point(0, 15), "29"));
        m603604.add(new ObjectType(ObjectType.DESKTOP, new Point(1, 15), new Point(1, 15), "30"));
        m603604.add(new ObjectType(ObjectType.DESKTOP, new Point(0, 16), new Point(0, 16), "31"));
        m603604.add(new ObjectType(ObjectType.DESKTOP, new Point(1, 16), new Point(1, 16), "32"));
        m603604.add(new ObjectType(ObjectType.DESKTOP, new Point(0, 17), new Point(0, 17), "33"));
        m603604.add(new ObjectType(ObjectType.DESKTOP, new Point(1, 17), new Point(1, 17), "34"));
        m603604.add(new ObjectType(ObjectType.DESKTOP, new Point(0, 18), new Point(0, 18), "35"));
        m603604.add(new ObjectType(ObjectType.DESKTOP, new Point(1, 18), new Point(1, 18), "36"));
        m603604.add(new ObjectType(ObjectType.DESKTOP, new Point(0, 19), new Point(0, 19), "37"));
        m603604.add(new ObjectType(ObjectType.DESKTOP, new Point(1, 19), new Point(1, 19), "38"));
        m603604.add(new ObjectType(ObjectType.DESKTOP, new Point(0, 20), new Point(0, 20), "39"));
        m603604.add(new ObjectType(ObjectType.DESKTOP, new Point(1, 20), new Point(1, 20), "40"));
        m603604.add(new ObjectType(ObjectType.DESKTOP, new Point(0, 21), new Point(0, 21), "41"));
        m603604.add(new ObjectType(ObjectType.DESKTOP, new Point(1, 21), new Point(1, 21), "42"));
        m603604.add(new ObjectType(ObjectType.DESKTOP, new Point(0, 22), new Point(0, 22), "43"));
        m603604.add(new ObjectType(ObjectType.DESKTOP, new Point(1, 22), new Point(1, 22), "44"));
        m603604.add(new ObjectType(ObjectType.DESKTOP, new Point(0, 23), new Point(0, 23), "45"));
        m603604.add(new ObjectType(ObjectType.DESKTOP, new Point(1, 23), new Point(1, 23), "46"));
        m603604.add(new ObjectType(ObjectType.DESKTOP, new Point(3, 10), new Point(3, 10), "47"));
        m603604.add(new ObjectType(ObjectType.DESKTOP, new Point(4, 10), new Point(4, 10), "48"));
        m603604.add(new ObjectType(ObjectType.DESKTOP, new Point(3, 11), new Point(3, 11), "49"));
        m603604.add(new ObjectType(ObjectType.DESKTOP, new Point(4, 11), new Point(4, 11), "50"));
        m603604.add(new ObjectType(ObjectType.DESKTOP, new Point(3, 12), new Point(3, 12), "51"));
        m603604.add(new ObjectType(ObjectType.DESKTOP, new Point(4, 12), new Point(4, 12), "52"));
        m603604.add(new ObjectType(ObjectType.DESKTOP, new Point(3, 13), new Point(3, 13), "53"));
        m603604.add(new ObjectType(ObjectType.DESKTOP, new Point(9, 10), new Point(9, 10), "54"));
        m603604.add(new ObjectType(ObjectType.DESKTOP, new Point(9, 11), new Point(9, 11), "55"));
        m603604.add(new ObjectType(ObjectType.DESKTOP, new Point(9, 12), new Point(9, 12), "56"));
        m603604.add(new ObjectType(ObjectType.DESKTOP, new Point(9, 13), new Point(9, 13), "57"));
        m603604.add(new ObjectType(ObjectType.DESKTOP, new Point(9, 14), new Point(9, 14), "58"));


        m603604.add(new ObjectType(ObjectType.BOOKCASE, new Point(2, 1), new Point(4, 8), null));
        m603604.add(new ObjectType(ObjectType.BOOKCASE, new Point(2, 10), new Point(2, 13), null));
        m603604.add(new ObjectType(ObjectType.BOOKCASE, new Point(2, 15), new Point(4, 23), null));

        m603604.add(new ObjectType(ObjectType.CORRIDOR, new Point(2, 9), new Point(4, 9), null));
        m603604.add(new ObjectType(ObjectType.CORRIDOR, new Point(2, 14), new Point(4, 14), null));



        m603604.add(new ObjectType(ObjectType.DOOR, new Point(5, 9), new Point(8, 9), "603科图法图书借阅"));
        m603604.add(new ObjectType(ObjectType.DOOR, new Point(5, 14), new Point(8, 14), "604科图法图书借阅"));

        m606607.add(new ObjectType(ObjectType.DESKTOP, new Point(0, 1), new Point(0, 1), "1"));
        m606607.add(new ObjectType(ObjectType.DESKTOP, new Point(1, 1), new Point(1, 1), "2"));
        m606607.add(new ObjectType(ObjectType.DESKTOP, new Point(2, 1), new Point(2, 1), "3"));
        m606607.add(new ObjectType(ObjectType.DESKTOP, new Point(0, 2), new Point(0, 2), "4"));
        m606607.add(new ObjectType(ObjectType.DESKTOP, new Point(1, 2), new Point(1, 2), "5"));
        m606607.add(new ObjectType(ObjectType.DESKTOP, new Point(2, 2), new Point(2, 2), "6"));
        m606607.add(new ObjectType(ObjectType.DESKTOP, new Point(0, 3), new Point(0, 3), "7"));
        m606607.add(new ObjectType(ObjectType.DESKTOP, new Point(1, 3), new Point(1, 3), "8"));
        m606607.add(new ObjectType(ObjectType.DESKTOP, new Point(2, 3), new Point(2, 3), "9"));
        m606607.add(new ObjectType(ObjectType.DESKTOP, new Point(3, 3), new Point(3, 3), "10"));
        m606607.add(new ObjectType(ObjectType.DESKTOP, new Point(0, 4), new Point(0, 4), "11"));
        m606607.add(new ObjectType(ObjectType.DESKTOP, new Point(1, 4), new Point(1, 4), "12"));
        m606607.add(new ObjectType(ObjectType.DESKTOP, new Point(2, 4), new Point(2, 4), "13"));
        m606607.add(new ObjectType(ObjectType.DESKTOP, new Point(3, 4), new Point(3, 4), "14"));
        m606607.add(new ObjectType(ObjectType.DESKTOP, new Point(0, 5), new Point(0, 5), "15"));
        m606607.add(new ObjectType(ObjectType.DESKTOP, new Point(1, 5), new Point(1, 5), "16"));
        m606607.add(new ObjectType(ObjectType.DESKTOP, new Point(2, 5), new Point(2, 5), "17"));
        m606607.add(new ObjectType(ObjectType.DESKTOP, new Point(0, 6), new Point(0, 6), "18"));
        m606607.add(new ObjectType(ObjectType.DESKTOP, new Point(1, 6), new Point(1, 6), "19"));
        m606607.add(new ObjectType(ObjectType.DESKTOP, new Point(2, 6), new Point(2, 6), "20"));


        m606607.add(new ObjectType(ObjectType.DOOR, new Point(5, 1), new Point(7, 1), "606信息服务室"));
        m606607.add(new ObjectType(ObjectType.DOOR, new Point(5, 6), new Point(7, 6), "607信息服务室"));

        m608609.add(new ObjectType(ObjectType.DESKTOP, new Point(0, 1), new Point(0, 1), "1"));
        m608609.add(new ObjectType(ObjectType.DESKTOP, new Point(1, 1), new Point(1, 1), "2"));
        m608609.add(new ObjectType(ObjectType.DESKTOP, new Point(2, 1), new Point(2, 1), "3"));
        m608609.add(new ObjectType(ObjectType.DESKTOP, new Point(3, 1), new Point(3, 1), "4"));
        m608609.add(new ObjectType(ObjectType.DESKTOP, new Point(0, 2), new Point(0, 2), "5"));
        m608609.add(new ObjectType(ObjectType.DESKTOP, new Point(1, 2), new Point(1, 2), "6"));
        m608609.add(new ObjectType(ObjectType.DESKTOP, new Point(2, 2), new Point(2, 2), "7"));
        m608609.add(new ObjectType(ObjectType.DESKTOP, new Point(3, 2), new Point(3, 2), "8"));
        m608609.add(new ObjectType(ObjectType.DESKTOP, new Point(4, 2), new Point(4, 2), "9"));
        m608609.add(new ObjectType(ObjectType.DESKTOP, new Point(0, 3), new Point(0, 3), "10"));
        m608609.add(new ObjectType(ObjectType.DESKTOP, new Point(1, 3), new Point(1, 3), "11"));
        m608609.add(new ObjectType(ObjectType.DESKTOP, new Point(2, 3), new Point(2, 3), "12"));
        m608609.add(new ObjectType(ObjectType.DESKTOP, new Point(3, 3), new Point(3, 3), "13"));
        m608609.add(new ObjectType(ObjectType.DESKTOP, new Point(4, 3), new Point(4, 3), "14"));
        m608609.add(new ObjectType(ObjectType.DESKTOP, new Point(0, 4), new Point(0, 4), "15"));
        m608609.add(new ObjectType(ObjectType.DESKTOP, new Point(1, 4), new Point(1, 4), "16"));
        m608609.add(new ObjectType(ObjectType.DESKTOP, new Point(2, 4), new Point(2, 4), "17"));
        m608609.add(new ObjectType(ObjectType.DESKTOP, new Point(3, 4), new Point(3, 4), "18"));
        m608609.add(new ObjectType(ObjectType.DESKTOP, new Point(1, 5), new Point(1, 5), "19"));
        m608609.add(new ObjectType(ObjectType.DESKTOP, new Point(2, 5), new Point(2, 5), "20"));


        m608609.add(new ObjectType(ObjectType.DOOR, new Point(5, 1), new Point(7, 1), "608信息服务室"));
        m608609.add(new ObjectType(ObjectType.DOOR, new Point(5, 5), new Point(7, 5), "609信息服务室"));

        m610611.add(new ObjectType(ObjectType.DESKTOP, new Point(0, 1), new Point(0, 1), "1"));
        m610611.add(new ObjectType(ObjectType.DESKTOP, new Point(1, 1), new Point(1, 1), "2"));
        m610611.add(new ObjectType(ObjectType.DESKTOP, new Point(0, 2), new Point(0, 2), "3"));
        m610611.add(new ObjectType(ObjectType.DESKTOP, new Point(1, 2), new Point(1, 2), "4"));
        m610611.add(new ObjectType(ObjectType.DESKTOP, new Point(0, 3), new Point(0, 3), "5"));
        m610611.add(new ObjectType(ObjectType.DESKTOP, new Point(1, 3), new Point(1, 3), "6"));
        m610611.add(new ObjectType(ObjectType.DESKTOP, new Point(0, 4), new Point(0, 4), "7"));
        m610611.add(new ObjectType(ObjectType.DESKTOP, new Point(1, 4), new Point(1, 4), "8"));
        m610611.add(new ObjectType(ObjectType.DESKTOP, new Point(0, 5), new Point(0, 5), "9"));
        m610611.add(new ObjectType(ObjectType.DESKTOP, new Point(1, 5), new Point(1, 5), "10"));
        m610611.add(new ObjectType(ObjectType.DESKTOP, new Point(0, 6), new Point(0, 6), "11"));
        m610611.add(new ObjectType(ObjectType.DESKTOP, new Point(1, 6), new Point(1, 6), "12"));
        m610611.add(new ObjectType(ObjectType.DESKTOP, new Point(0, 7), new Point(0, 7), "13"));
        m610611.add(new ObjectType(ObjectType.DESKTOP, new Point(1, 7), new Point(1, 7), "14"));
        m610611.add(new ObjectType(ObjectType.DESKTOP, new Point(0, 8), new Point(0, 8), "15"));
        m610611.add(new ObjectType(ObjectType.DESKTOP, new Point(1, 8), new Point(1, 8), "16"));
        m610611.add(new ObjectType(ObjectType.DESKTOP, new Point(0, 9), new Point(0, 9), "17"));
        m610611.add(new ObjectType(ObjectType.DESKTOP, new Point(1, 9), new Point(1, 9), "18"));
        m610611.add(new ObjectType(ObjectType.DESKTOP, new Point(0, 10), new Point(0, 10), "19"));
        m610611.add(new ObjectType(ObjectType.DESKTOP, new Point(1, 10), new Point(1, 10), "20"));
        m610611.add(new ObjectType(ObjectType.DESKTOP, new Point(0, 11), new Point(0, 11), "21"));
        m610611.add(new ObjectType(ObjectType.DESKTOP, new Point(1, 11), new Point(1, 11), "22"));
        m610611.add(new ObjectType(ObjectType.DESKTOP, new Point(0, 12), new Point(0, 12), "23"));
        m610611.add(new ObjectType(ObjectType.DESKTOP, new Point(1, 12), new Point(1, 12), "24"));
        m610611.add(new ObjectType(ObjectType.DESKTOP, new Point(0, 13), new Point(0, 13), "25"));
        m610611.add(new ObjectType(ObjectType.DESKTOP, new Point(1, 13), new Point(1, 13), "26"));
        m610611.add(new ObjectType(ObjectType.DESKTOP, new Point(0, 14), new Point(0, 14), "27"));
        m610611.add(new ObjectType(ObjectType.DESKTOP, new Point(1, 14), new Point(1, 14), "28"));
        m610611.add(new ObjectType(ObjectType.DESKTOP, new Point(0, 15), new Point(0, 15), "29"));
        m610611.add(new ObjectType(ObjectType.DESKTOP, new Point(1, 15), new Point(1, 15), "30"));
        m610611.add(new ObjectType(ObjectType.DESKTOP, new Point(0, 16), new Point(0, 16), "31"));
        m610611.add(new ObjectType(ObjectType.DESKTOP, new Point(1, 16), new Point(1, 16), "32"));
        m610611.add(new ObjectType(ObjectType.DESKTOP, new Point(0, 17), new Point(0, 17), "33"));
        m610611.add(new ObjectType(ObjectType.DESKTOP, new Point(1, 17), new Point(1, 17), "34"));
        m610611.add(new ObjectType(ObjectType.DESKTOP, new Point(0, 18), new Point(0, 18), "35"));
        m610611.add(new ObjectType(ObjectType.DESKTOP, new Point(1, 18), new Point(1, 18), "36"));
        m610611.add(new ObjectType(ObjectType.DESKTOP, new Point(0, 19), new Point(0, 19), "37"));
        m610611.add(new ObjectType(ObjectType.DESKTOP, new Point(1, 19), new Point(1, 19), "38"));
        m610611.add(new ObjectType(ObjectType.DESKTOP, new Point(0, 20), new Point(0, 20), "39"));
        m610611.add(new ObjectType(ObjectType.DESKTOP, new Point(1, 20), new Point(1, 20), "40"));
        m610611.add(new ObjectType(ObjectType.DESKTOP, new Point(0, 21), new Point(0, 21), "41"));
        m610611.add(new ObjectType(ObjectType.DESKTOP, new Point(1, 21), new Point(1, 21), "42"));
        m610611.add(new ObjectType(ObjectType.DESKTOP, new Point(0, 22), new Point(0, 22), "43"));
        m610611.add(new ObjectType(ObjectType.DESKTOP, new Point(1, 22), new Point(1, 22), "44"));
        m610611.add(new ObjectType(ObjectType.DESKTOP, new Point(0, 23), new Point(0, 23), "45"));
        m610611.add(new ObjectType(ObjectType.DESKTOP, new Point(1, 23), new Point(1, 23), "46"));
        m610611.add(new ObjectType(ObjectType.DESKTOP, new Point(0, 24), new Point(0, 24), "47"));
        m610611.add(new ObjectType(ObjectType.DESKTOP, new Point(1, 24), new Point(1, 24), "48"));
        m610611.add(new ObjectType(ObjectType.DESKTOP, new Point(0, 25), new Point(0, 25), "49"));
        m610611.add(new ObjectType(ObjectType.DESKTOP, new Point(1, 25), new Point(1, 25), "50"));
        m610611.add(new ObjectType(ObjectType.DESKTOP, new Point(4, 11), new Point(4, 11), "51"));
        m610611.add(new ObjectType(ObjectType.DESKTOP, new Point(4, 12), new Point(4, 12), "52"));
        m610611.add(new ObjectType(ObjectType.DESKTOP, new Point(4, 13), new Point(4, 13), "53"));
        m610611.add(new ObjectType(ObjectType.DESKTOP, new Point(4, 14), new Point(4, 14), "54"));
        m610611.add(new ObjectType(ObjectType.DESKTOP, new Point(4, 15), new Point(4, 15), "55"));
        m610611.add(new ObjectType(ObjectType.DESKTOP, new Point(8, 11), new Point(8, 11), "56"));
        m610611.add(new ObjectType(ObjectType.DESKTOP, new Point(8, 12), new Point(8, 12), "57"));
        m610611.add(new ObjectType(ObjectType.DESKTOP, new Point(8, 13), new Point(8, 13), "58"));
        m610611.add(new ObjectType(ObjectType.DESKTOP, new Point(8, 14), new Point(8, 14), "59"));
        m610611.add(new ObjectType(ObjectType.DESKTOP, new Point(8, 15), new Point(8, 15), "60"));



        m610611.add(new ObjectType(ObjectType.BOOKCASE, new Point(2, 1), new Point(4, 9), null));
        m610611.add(new ObjectType(ObjectType.BOOKCASE, new Point(2, 11), new Point(3, 15), null));
        m610611.add(new ObjectType(ObjectType.BOOKCASE, new Point(2, 17), new Point(4, 25), null));

        m610611.add(new ObjectType(ObjectType.CORRIDOR, new Point(2, 10), new Point(4, 10), null));
        m610611.add(new ObjectType(ObjectType.CORRIDOR, new Point(2, 16), new Point(4, 16), null));


        m610611.add(new ObjectType(ObjectType.DOOR, new Point(5, 10), new Point(7, 10), "610文科借阅处"));
        m610611.add(new ObjectType(ObjectType.DOOR, new Point(5, 16), new Point(7, 16), "611文科借阅处"));

        m719720.add(new ObjectType(ObjectType.DESKTOP, new Point(0, 1), new Point(0, 1), "1"));
        m719720.add(new ObjectType(ObjectType.DESKTOP, new Point(0, 2), new Point(0, 2), "2"));
        m719720.add(new ObjectType(ObjectType.DESKTOP, new Point(0, 3), new Point(0, 3), "3"));
        m719720.add(new ObjectType(ObjectType.DESKTOP, new Point(0, 4), new Point(0, 4), "4"));
        m719720.add(new ObjectType(ObjectType.DESKTOP, new Point(0, 5), new Point(0, 5), "5"));
        m719720.add(new ObjectType(ObjectType.DESKTOP, new Point(0, 6), new Point(0, 6), "6"));
        m719720.add(new ObjectType(ObjectType.DESKTOP, new Point(0, 7), new Point(0, 7), "7"));
        m719720.add(new ObjectType(ObjectType.DESKTOP, new Point(0, 8), new Point(0, 8), "8"));
        m719720.add(new ObjectType(ObjectType.DESKTOP, new Point(0, 9), new Point(0, 9), "9"));
        m719720.add(new ObjectType(ObjectType.DESKTOP, new Point(3, 9), new Point(3, 9), "10"));
        m719720.add(new ObjectType(ObjectType.DESKTOP, new Point(3, 8), new Point(3, 8), "11"));
        m719720.add(new ObjectType(ObjectType.DESKTOP, new Point(3, 7), new Point(3, 7), "12"));
        m719720.add(new ObjectType(ObjectType.DESKTOP, new Point(3, 6), new Point(3, 6), "13"));
        m719720.add(new ObjectType(ObjectType.DESKTOP, new Point(3, 5), new Point(3, 5), "14"));
        m719720.add(new ObjectType(ObjectType.DESKTOP, new Point(3, 4), new Point(3, 4), "15"));


        m719720.add(new ObjectType(ObjectType.BOOKCASE, new Point(1, 1), new Point(2, 9), null));

        m719720.add(new ObjectType(ObjectType.CORRIDOR, new Point(3, 1), new Point(3, 3), null));

        m719720.add(new ObjectType(ObjectType.DOOR, new Point(4, 1), new Point(8, 1), "719社科图书阅览室2"));
        m719720.add(new ObjectType(ObjectType.DOOR, new Point(4, 9), new Point(8, 9), "720社科图书阅览室2"));

        m727.add(new ObjectType(ObjectType.DESKTOP, new Point(0, 1), new Point(0, 1), "1"));
        m727.add(new ObjectType(ObjectType.DESKTOP, new Point(1, 1), new Point(1, 1), "2"));
        m727.add(new ObjectType(ObjectType.DESKTOP, new Point(0, 2), new Point(0, 2), "3"));
        m727.add(new ObjectType(ObjectType.DESKTOP, new Point(1, 2), new Point(1, 2), "4"));
        m727.add(new ObjectType(ObjectType.DESKTOP, new Point(0, 3), new Point(0, 3), "5"));
        m727.add(new ObjectType(ObjectType.DESKTOP, new Point(1, 3), new Point(1, 3), "6"));
        m727.add(new ObjectType(ObjectType.DESKTOP, new Point(0, 4), new Point(0, 4), "7"));
        m727.add(new ObjectType(ObjectType.DESKTOP, new Point(1, 4), new Point(1, 4), "8"));
        m727.add(new ObjectType(ObjectType.DESKTOP, new Point(0, 5), new Point(0, 5), "9"));
        m727.add(new ObjectType(ObjectType.DESKTOP, new Point(1, 5), new Point(1, 5), "10"));
        m727.add(new ObjectType(ObjectType.DESKTOP, new Point(0, 6), new Point(0, 6), "11"));
        m727.add(new ObjectType(ObjectType.DESKTOP, new Point(1, 6), new Point(1, 6), "12"));
        m727.add(new ObjectType(ObjectType.DESKTOP, new Point(0, 7), new Point(0, 7), "13"));
        m727.add(new ObjectType(ObjectType.DESKTOP, new Point(1, 7), new Point(1, 7), "14"));
        m727.add(new ObjectType(ObjectType.DESKTOP, new Point(0, 8), new Point(0, 8), "15"));
        m727.add(new ObjectType(ObjectType.DESKTOP, new Point(1, 8), new Point(1, 8), "16"));

        m727.add(new ObjectType(ObjectType.DOOR, new Point(2, 1), new Point(5, 1), "727特色样本阅览室"));
    }
}
