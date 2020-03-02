package br.com.liferay.salestaxes.view;

import br.com.liferay.salestaxes.entity.Item;
import br.com.liferay.salestaxes.entity.ItemTypeEnum;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        
        //Input 1
        List<Item> itensInput1 = new ArrayList<Item>();
        Item item1Input1 = new Item("book", ItemTypeEnum.BOOK, new BigDecimal("12.49"), 1);
        Item item2Input1 = new Item("music CD", ItemTypeEnum.OTHERS, new BigDecimal("14.99"), 1);
        Item item3Input1 = new Item("chocolate bar", ItemTypeEnum.FOOD, new BigDecimal("0.85"), 1);
        itensInput1.add(item1Input1);
        itensInput1.add(item2Input1);
        itensInput1.add(item3Input1);
        //Output 1
        System.out.println("Output 1:");
        Receipt.printDetail(itensInput1);
        
        //Input 2
        List<Item> itensInput2 = new ArrayList<Item>();
        Item item1Input2 = new Item("imported box of chocolates", ItemTypeEnum.IMPORTED_FOOD, new BigDecimal("10.00"), 1);
        Item item2Input2 = new Item("imported bottle of perfume", ItemTypeEnum.IMPORTED_OTHERS, new BigDecimal("47.50"), 1);
        itensInput2.add(item1Input2);
        itensInput2.add(item2Input2);
        //Output 2
        System.out.println("Output 2:");
        Receipt.printDetail(itensInput2);
        
        //Input 3
        List<Item> itensInput3 = new ArrayList<Item>();
        Item item1Input3 = new Item("imported bottle of perfume", ItemTypeEnum.IMPORTED_OTHERS, new BigDecimal("27.99"), 1);
        Item item2Input3 = new Item("bottle of perfume", ItemTypeEnum.OTHERS, new BigDecimal("18.99"), 1);
        Item item3Input3 = new Item("packet of headache pills", ItemTypeEnum.MEDICAL, new BigDecimal("9.75"), 1);
        Item item4Input3 = new Item("imported box of chocolates", ItemTypeEnum.IMPORTED_FOOD, new BigDecimal("11.25"), 1);
        itensInput3.add(item1Input3);
        itensInput3.add(item2Input3);
        itensInput3.add(item3Input3);
        itensInput3.add(item4Input3);
        //Output 3
        System.out.println("Output 3:");
        Receipt.printDetail(itensInput3);

    }

}
