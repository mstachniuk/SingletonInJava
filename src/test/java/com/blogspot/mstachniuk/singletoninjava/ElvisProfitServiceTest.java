package com.blogspot.mstachniuk.singletoninjava;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class ElvisProfitServiceTest {

    @Test
    public void shouldCalculateElvisProfit() {
        // given
        ElvisProfitService service = new ElvisProfitService();
        Elvis elvis = mock(Elvis.class);
        when(elvis.howOldIsElvisNow()).thenReturn(1);
        service.setElvis(elvis);

        // when
        double elvisProfit = service.calculateElvisProfit();

        // then
        assertEquals(70_000, elvisProfit, 0.1);
    }
}