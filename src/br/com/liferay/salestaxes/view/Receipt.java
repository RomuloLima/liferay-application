package br.com.liferay.salestaxes.view;

import br.com.liferay.salestaxes.entity.Item;
import br.com.liferay.salestaxes.service.SalesTaxPolicy;

import java.math.BigDecimal;
import java.util.List;

public class Receipt {

    public static void printDetail(List<Item> itens) {
        BigDecimal tax = BigDecimal.ZERO, valueItemWithTax = BigDecimal.ZERO, salesTaxes = BigDecimal.ZERO, total = BigDecimal.ZERO;
        for (Item item : itens) {
            tax = SalesTaxPolicy.calculateTax(item);
            salesTaxes = salesTaxes.add(tax);
            total = total.add(valueItemWithTax);
            System.out.println(item.getName() +": "+  SalesTaxPolicy.calculateValueItemWithTax(item, tax));
        }
        System.out.println("Sales Taxes: " + salesTaxes);
        System.out.println("Total: " + total + "\n");
        
    }

    
    
}
