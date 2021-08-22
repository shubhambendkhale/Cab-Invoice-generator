package com.api.cab;

import java.util.List;

public class CabService {

	private static final double COST_PER_KM = 10 ;
    private static final int COST_PER_MIN =1 ;

    public double invoiceGenerator(double distance, int time) {
        double totalFare = 0.0;
        if (distance < 0.5 && time<10){
            totalFare = 50.0;
        } else
        {
            totalFare = distance * COST_PER_KM + time * COST_PER_MIN;
        }
        return totalFare ;
    }
}
