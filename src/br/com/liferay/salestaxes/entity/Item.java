package br.com.liferay.salestaxes.entity;

import java.math.BigDecimal;


public class Item {

    private String name;
    private ItemTypeEnum itemType;
    private BigDecimal shelfPrice;
    private int quantity;
    
    public Item(String name, ItemTypeEnum itemType, BigDecimal shelfPrice, int quantity) {
        super();
        this.name = name;
        this.itemType = itemType;
        this.shelfPrice = shelfPrice;
        this.quantity = quantity;
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    public ItemTypeEnum getItemType() {
        return itemType;
    }
    
    public void setItemType(ItemTypeEnum itemType) {
        this.itemType = itemType;
    }
    
    public BigDecimal getShelfPrice() {
        return shelfPrice;
    }
    
    public void setShelfPrice(BigDecimal shelfPrice) {
        this.shelfPrice = shelfPrice;
    }
    
    public int getQuantity() {
        return quantity;
    }
    
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    
    public boolean isItemImported() {
        return itemType.isImported();
    }
    
    public boolean isItemExempted() {
        return itemType.isExempted();
    }
    
    
}
