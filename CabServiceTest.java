package com.api.cab;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CabServiceTest {
    private static CabService cabService;


    @Before
    public void setup(){
        cabService = new CabService();
    }

    @Test
    public void givenDistanceAndTimeShouldReturnTotalFare(){
        double distance = 10;
        int time = 15;
        double totalFare = cabService.invoiceGenerator(distance,time);
        Assert.assertEquals(115.0,totalFare,0.0);

    }
    @Test
    public void givenDistanceAndTimeShouldReturnDefaultFare(){
        double distance = 0.2;
        int time = 6;
        double totalFare = cabService.invoiceGenerator(distance,time);
        Assert.assertEquals(50,totalFare,0.0);

    }

}