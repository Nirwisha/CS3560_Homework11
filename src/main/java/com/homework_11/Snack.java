package com.homework_11;

// represents all types of snacks, each one has name, price, and quantity
public class Snack {
    private String snackName;
    private float snackPrice;
    private int snackQty;

    public Snack(String name, float price, int qty) {
        this.snackName = name;
        this.snackPrice = price;
        this.snackQty = qty;
    }

    public String getSnackName() {
        return snackName;
    }
    
    public float getSnackPrice() {
        return snackPrice;
    }

    public int getSnackQty() {
        return snackQty;
    }

    public void decreaseQty() {
    if (snackQty > 0) {
        snackQty--;
    }
}
}