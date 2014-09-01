package com.blogspot.mstachniuk.singletoninjava;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Elvis {

    private static final Elvis INSTANCE = new Elvis();

    private final int ELVIS_BIRTHDAY_YEAR = 1935;

    private Elvis() {
    }

    public static Elvis getInstance() {
        return INSTANCE;
    }

    public int howOldIsElvisNow() {
        return new GregorianCalendar().get(Calendar.YEAR) - ELVIS_BIRTHDAY_YEAR;
    }
}
