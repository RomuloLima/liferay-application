package br.com.liferay.salestaxes.service.test;

import br.com.liferay.salestaxes.entity.Item;
import br.com.liferay.salestaxes.entity.ItemTypeEnum;

import java.math.BigDecimal;

public class ItemTestHelper {

    public static Item ITEM_EXEMPTED = new Item("book", ItemTypeEnum.BOOK, new BigDecimal("12.49"), 1);
    public static Item ITEM_IMPORTED = new Item("imported bottle of perfume", ItemTypeEnum.IMPORTED_OTHERS, new BigDecimal("47.50"), 1);
    public static Item ITEM_EXEMPTED_IMPORTED = new Item("imported box of chocolates", ItemTypeEnum.IMPORTED_FOOD, new BigDecimal("10.00"), 1);
    public static Item ITEM_BASIC_TAX = new Item("music CD", ItemTypeEnum.OTHERS, new BigDecimal("14.99"), 1);
}
