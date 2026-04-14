package com.group13.group13_btl.models;

public class Vehicle extends Item {
    private String brand;
    private int yearOfManufacture;
    private double mileage;

    public Vehicle(String id, String name, double startingPrice, String brand, int yearOfManufacture, double mileage) {
        super(id, name, startingPrice);
        this.brand = brand;
        this.yearOfManufacture = yearOfManufacture;
        this.mileage = mileage;
    }

    @Override
    public void showDetails() {
        System.out.println("Phương tiện: " + getName() + " " + brand + " - Năm sản xuất: " + yearOfManufacture + " - Số km đã đi: " + mileage + " - Giá: " + getStartingPrice());
    }

    public String getBrand() {
        return brand;
    }

    public int getYearOfManufacture() {
        return yearOfManufacture;
    }

    public double getMileage() {
        return mileage;
    }
}
