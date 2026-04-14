package com.group13.group13_btl.services;

import com.group13.group13_btl.models.Art;
import com.group13.group13_btl.models.Electronics;
import com.group13.group13_btl.models.Item;
import com.group13.group13_btl.models.Vehicle;

public class ItemFactory {
    public static Item createElectronics(String id, String name, String brand, int warrantyMonths, double startingPrice) {
        return new Electronics(id, name, startingPrice, brand, warrantyMonths);
    }

    public static Item createVehicle(String id, String name, String brand, int yearOfManufacture, double mileage, double startingPrice){
        return new Vehicle(id, name, startingPrice, brand, yearOfManufacture, mileage);
        }

    public static Item createArt(String id, String name, String artistName, int creationYear, double startingPrice){
        return new Art(id, name, startingPrice, artistName, creationYear);
        }

}
