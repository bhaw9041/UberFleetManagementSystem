/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Date;

/**
 *
 * @author bhawnasingh
 */
public class Car {
    private boolean isAvailable;
    private String manufacturer;
    private int manufacturedYear;
    private int seats;
    private String serialNumber;
    private String modelNumber;
    private String geoLocality;
    private Date maintenaceExpiry;

    public Car(boolean isAvailable, String manufacturer, int manufacturedYear, int seats, String serialNumber, String modelNumber, String geoLocality, Date maintenaceExpiry) {
        this.isAvailable = isAvailable;
        this.manufacturer = manufacturer;
        this.manufacturedYear = manufacturedYear;
        this.seats = seats;
        this.serialNumber = serialNumber;
        this.modelNumber = modelNumber;
        this.geoLocality = geoLocality;
        this.maintenaceExpiry = maintenaceExpiry;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public int getManufacturedYear() {
        return manufacturedYear;
    }

    public void setManufacturedYear(int manufacturedYear) {
        this.manufacturedYear = manufacturedYear;
    }

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getModelNumber() {
        return modelNumber;
    }

    public void setModelNumber(String modelNumber) {
        this.modelNumber = modelNumber;
    }

    public String getGeoLocality() {
        return geoLocality;
    }

    public void setGeoLocality(String geoLocality) {
        this.geoLocality = geoLocality;
    }

    public Date getMaintenaceExpiry() {
        return maintenaceExpiry;
    }

    public void setMaintenaceExpiry(Date maintenaceExpiry) {
        this.maintenaceExpiry = maintenaceExpiry;
    }
}


