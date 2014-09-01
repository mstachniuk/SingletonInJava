package com.blogspot.mstachniuk.singletoninjava;

import static com.blogspot.mstachniuk.singletoninjava.Elvis.INSTANCE;

public class ElvisProfitService {

    private final double ELVIS_SALARY_YEAR = 70_000;

    public double calculateElvisProfit() {
        return INSTANCE.howOldIsElvisNow() * ELVIS_SALARY_YEAR;
    }
}
