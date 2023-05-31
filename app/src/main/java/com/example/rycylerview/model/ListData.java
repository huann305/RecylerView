package com.example.rycylerview.model;

import java.util.List;

public class ListData {
    private int type;
    private List<Item> items;
    private List<Item> itemsShorts;

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }

    public List<Item> getItemsShorts() {
        return itemsShorts;
    }

    public void setItemsShorts(List<Item> itemsShorts) {
        this.itemsShorts = itemsShorts;
    }

    public ListData(int type, List<Item> items, List<Item> itemsShorts) {
        this.type = type;
        this.items = items;
        this.itemsShorts = itemsShorts;
    }
}
