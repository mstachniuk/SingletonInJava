package com.blogspot.mstachniuk.singletoninjava;

public class ElvisProfitService {

    private final double ELVIS_SALARY_YEAR = 70_000;
    private Elvis elvis = Elvis.getInstance();

    public double calculateElvisProfit() {
        return elvis.howOldIsElvisNow() * ELVIS_SALARY_YEAR;
    }

    // For tests
    void setElvis(Elvis elvis) {
        this.elvis = elvis;
    }
}
