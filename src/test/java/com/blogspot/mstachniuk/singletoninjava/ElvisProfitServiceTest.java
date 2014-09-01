package com.blogspot.mstachniuk.singletoninjava;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.powermock.core.classloader.annotations.MockPolicy;
import org.powermock.modules.junit4.PowerMockRunner;

import static org.junit.Assert.assertEquals;

@RunWith(PowerMockRunner.class)
@MockPolicy(ElvisMockPolicy.class)
public class ElvisProfitServiceTest {

    @Test
    public void shouldCalculateElvisProfit() {
        // given
        ElvisProfitService service = new ElvisProfitService();

        // when
        double elvisProfit = service.calculateElvisProfit();

        // then
        assertEquals(70_000, elvisProfit, 0.1);
    }
}