package br.com.liferay.salestaxes.service.test;

import br.com.liferay.salestaxes.service.SalesTaxPolicy;

import java.math.BigDecimal;

import org.junit.Assert;
import org.junit.Test;

public class SalesTaxPolicyTest {

    @Test
    public void testItemExempted(){
        BigDecimal tax = SalesTaxPolicy.calculateTax(ItemTestHelper.ITEM_EXEMPTED);
        Assert.assertEquals(new BigDecimal("12.49"), SalesTaxPolicy.calculateValueItemWithTax(ItemTestHelper.ITEM_EXEMPTED, tax));
    }
    
    @Test
    public void testItemImported(){
        BigDecimal tax = SalesTaxPolicy.calculateTax(ItemTestHelper.ITEM_IMPORTED);
        Assert.assertEquals(new BigDecimal("54.65"), SalesTaxPolicy.calculateValueItemWithTax(ItemTestHelper.ITEM_IMPORTED, tax));  
    }
    
    @Test
    public void testItemExemptedImported(){
        BigDecimal tax = SalesTaxPolicy.calculateTax(ItemTestHelper.ITEM_EXEMPTED_IMPORTED);
        Assert.assertEquals(new BigDecimal("10.50"), SalesTaxPolicy.calculateValueItemWithTax(ItemTestHelper.ITEM_EXEMPTED_IMPORTED, tax));  
    }
    
    @Test
    public void testItemBasicTax(){
        BigDecimal tax = SalesTaxPolicy.calculateTax(ItemTestHelper.ITEM_BASIC_TAX);
        Assert.assertEquals(new BigDecimal("16.49"), SalesTaxPolicy.calculateValueItemWithTax(ItemTestHelper.ITEM_BASIC_TAX, tax));  
    }
}
