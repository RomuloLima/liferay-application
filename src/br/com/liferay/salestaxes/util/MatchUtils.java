package br.com.liferay.salestaxes.util;

import java.math.BigDecimal;

public class MatchUtils {

    private static final double ROUNDOFF = 0.05;
    
    public static BigDecimal roundOffTax(BigDecimal tax){
        return new BigDecimal(Math.ceil(tax.doubleValue()/ROUNDOFF)*ROUNDOFF);
    }
}
