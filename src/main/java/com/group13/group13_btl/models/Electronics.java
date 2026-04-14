package com.group13.group13_btl.models;

public class Electronics extends Item{
    private String brand;
    private int warrantyMonths;

    public Electronics(String id, String name, double startingPrice, String brand, int warrantyMonths) {
        super(id, name, startingPrice);
        this.brand = brand;
        this.warrantyMonths = warrantyMonths;
    }

    @Override
    public void showDetails() {
        System.out.println("Đồ điện tử: " + getName() + " - Bảo hành: " + warrantyMonths + " tháng" + " - Giá: " + getStartingPrice());
    }

    public String getBrand() {
        return brand;
    }


    public int getWarrantyMonths() {
        return warrantyMonths;
    }
}
