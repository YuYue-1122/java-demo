package com.demoapp.utils;

import java.util.UUID;

public class UuidUtils {
    public static final String[] lower_letter_charts =
            new String[]{
                    "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r",
                    "s", "t", "u", "v", "w", "x", "y", "z",
            };
    public static final String[] upper_letter_charts =
            new String[]{
                    "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R",
                    "S", "T", "U", "V", "W", "X", "Y", "Z",
            };
    public static final String[] letter_charts =
            new String[]{
                    "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r",
                    "s", "t", "u", "v", "w", "x", "y", "z", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J",
                    "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"
            };
    public static final String[] number_charts =
            new String[]{
                    "0", "1", "2", "3", "4", "5", "6", "7", "8", "9",
            };
    public static final String[] charts =
            new String[]{
                    "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r",
                    "s", "t", "u", "v", "w", "x", "y", "z", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J",
                    "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z",
                    "0", "1", "2", "3", "4", "5", "6", "7", "8", "9",
            };

    public static String lower() {
        String ticket = uuid();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 8; i++) {
            String str = ticket.substring(i * 4, i * 4 + 4);
            int x = Integer.parseInt(str, 16);
            sb.append(lower_letter_charts[x % 0x1A]);
        }
        return sb.toString();
    }

    public static String upper() {
        String ticket = uuid();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 8; i++) {
            String str = ticket.substring(i * 4, i * 4 + 4);
            int x = Integer.parseInt(str, 16);
            sb.append(upper_letter_charts[x % 0x1A]);
        }
        return sb.toString();
    }

    public static String letter() {
        String ticket = uuid();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 8; i++) {
            String str = ticket.substring(i * 4, i * 4 + 4);
            int x = Integer.parseInt(str, 16);
            sb.append(letter_charts[x % 0x34]);
        }
        return sb.toString();
    }

    public static String lowerNumber() {
        StringBuilder sb = new StringBuilder();
        String ticket = uuid();
        for (int i = 0; i < 4; i++) {
            String str = ticket.substring(i * 4, i * 4 + 4);
            int x = Integer.parseInt(str, 16);
            sb.append(lower_letter_charts[x % 0x1A]);
        }
        for (int i = 4; i < 8; i++) {
            String str = ticket.substring(i * 4, i * 4 + 4);
            int x = Integer.parseInt(str, 16);
            sb.append(number_charts[x % 0x0A]);
        }
        return sb.toString();
    }


    public static String letterNumber() {
        StringBuilder sb = new StringBuilder();
        String ticket = uuid();
        for (int i = 0; i < 4; i++) {
            String str = ticket.substring(i * 4, i * 4 + 4);
            int x = Integer.parseInt(str, 16);
            sb.append(letter_charts[x % 0x34]);
        }
        for (int i = 4; i < 8; i++) {
            String str = ticket.substring(i * 4, i * 4 + 4);
            int x = Integer.parseInt(str, 16);
            sb.append(number_charts[x % 0x0A]);
        }
        return sb.toString();
    }

    public static String uuid() {
        return UUID.randomUUID().toString().replace("-", "");
    }
}
