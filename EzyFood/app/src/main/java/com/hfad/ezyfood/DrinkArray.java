package com.hfad.ezyfood;

public class DrinkArray {
    protected String name;
    protected int size;
    protected int qty;

    public DrinkArray(String name, int size, int qty){
        super();
        this.name = name;
        this.size = size;
        this.qty = qty;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }



}
