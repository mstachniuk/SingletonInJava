package com.blogspot.mstachniuk.singletoninjava;

import java.util.Calendar;
import java.util.GregorianCalendar;

public enum Elvis {
    INSTANCE;

    private final int ELVIS_BIRTHDAY_YEAR = 1935;

    public int howOldIsElvisNow() {
        return new GregorianCalendar().get(Calendar.YEAR) - ELVIS_BIRTHDAY_YEAR;
    }
}
