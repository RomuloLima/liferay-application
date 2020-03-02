package br.com.liferay.salestaxes.service;

import br.com.liferay.salestaxes.entity.Item;
import br.com.liferay.salestaxes.entity.TaxTypeEnum;
import br.com.liferay.salestaxes.util.MatchUtils;

import java.math.BigDecimal;
import java.math.RoundingMode;


public class SalesTaxPolicy {
    
    public static BigDecimal calculateTax(Item item) {
        BigDecimal result = MatchUtils.roundOffTax(getItemTaxType(item).getApplicableTax().multiply(item.getShelfPrice()));
        return result.setScale(2, RoundingMode.HALF_UP);
    }
    
    private static TaxTypeEnum getItemTaxType(Item item) {
        if(item.isItemImported() && !item.isItemExempted()){
            return TaxTypeEnum.BOTH;
        }else if( item.isItemImported() && item.isItemExempted()){
            return TaxTypeEnum.IMPORTED;
        }else if( !item.isItemImported() && !item.isItemExempted()){
            return TaxTypeEnum.BASIC;
        }
        return TaxTypeEnum.NA;
    }
    
    public static BigDecimal calculateValueItemWithTax(Item item, BigDecimal tax){
        return item.getShelfPrice().add(tax);
    }
}
