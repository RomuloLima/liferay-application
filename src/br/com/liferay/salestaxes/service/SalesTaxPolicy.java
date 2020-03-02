package br.com.liferay.salestaxes.service;

import br.com.liferay.salestaxes.entity.Item;
import br.com.liferay.salestaxes.entity.TaxTypeEnum;
import br.com.liferay.salestaxes.util.MatchUtils;

import java.math.BigDecimal;
import java.math.RoundingMode;


public class SalesTaxPolicy {
    
    /**
     * Calculates the tax rate according to the following rules:
     * Note: food, medicine and books are exempt from basic taxes.
     *
     *  1 - 10% (basic tax) for non-imported products (except, food, medicines and books)
     *  2 - 10% (basic tax) + 5% (import tax) for imported products (except, food, medicines and books)
     *  3 - 5% for imported products that are food, medicine and books.
     *  
     * @param item The purchased item
     * @return The amount of the tax rate to be paid.
     */
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
    
    /**
     * Sums the item's value with your tax
     * @param item The purchased item
     * @param tax Tax rate
     * @return the sum
     */
    public static BigDecimal calculateValueItemWithTax(Item item, BigDecimal tax){
        return item.getShelfPrice().add(tax);
    }
}
