package com;

public abstract class Chicken {
    private String type;
    private double price;

    public Chicken() {
    }

    public Chicken(String type, double price) {
        this.type = type;
        this.price = price;
    }

    public abstract void setTypes() ;
    public abstract void setPrices() ;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }


}
