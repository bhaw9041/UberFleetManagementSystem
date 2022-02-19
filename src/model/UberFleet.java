/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Date;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author bhawnasingh
 */
public class UberFleet {
    private List<Car> fleet;
    private Date lastUpdateTime;

    public UberFleet() {
        this.fleet = new LinkedList<Car>();
        this.updateTime();
    }

    public List<Car> getFleet() {
        return fleet;
    }

    public void setFleet(List<Car> fleet) {
        this.fleet = fleet;
    }

    public Date getLastUpdateTime() {
        return lastUpdateTime;
    }

    public void setLastUpdateTime(Date lastUpdateTime) {
        this.lastUpdateTime = lastUpdateTime;
    }

    public void addCarToFleet(Car c){
        this.fleet.add(c);
        this.updateTime();
    }
    
    public void updateCar(Car c, String serialNumber){
        for(int i=0;i<this.fleet.size();i++){
            if(this.fleet.get(i).getSerialNumber().equals(serialNumber)){
                this.fleet.set(i, c);
            }
        }
    return;
    }

    private void updateTime(){
        this.lastUpdateTime = new Date();
    }

    public Car getFirstAvailableCar(){
        for(int i=0;i<this.fleet.size();i++){
            if(this.fleet.get(i).isAvailable()){
                return this.fleet.get(i);
            }
        }
        return null;
    }

    public List<Car> getAvailableCars(){
        List<Car> carList = new LinkedList<Car>();
        for(int i=0;i<this.fleet.size();i++){
            if(this.fleet.get(i).isAvailable()){
                carList.add(this.fleet.get(i));
            }
        }
        return carList;
    }

    public List<Car> getAllCarsByManufacturer(String manufacturer){
        List<Car> carList = new LinkedList<Car>();
        for(int i=0;i<this.fleet.size();i++){
            if(this.fleet.get(i).getManufacturer().equals(manufacturer)){
                carList.add(this.fleet.get(i));
            }
        }
        return  carList;
    }
    
    public Car getCarBySerialNumber(String serialNumber){
        for(int i=0;i<this.fleet.size();i++){
            if(this.fleet.get(i).getSerialNumber().equals(serialNumber)){
                return this.fleet.get(i);
            }
        }
        return  null;
    }

    public List<Car> getAllCarsByManufacturedYear(int manufacturedYear){
        List<Car> carList = new LinkedList<Car>();
        for(int i=0;i<this.fleet.size();i++){
            if(this.fleet.get(i).getManufacturedYear() == manufacturedYear){
                carList.add(this.fleet.get(i));
            }
        }
        return  carList;
    }

    public List<Car> getAllCarsBySeat(int min, int max){
        List<Car> carList = new LinkedList<Car>();
        for(int i=0;i<this.fleet.size();i++){
            if(this.fleet.get(i).getSeats() >= min && this.fleet.get(i).getSeats() <= max){
                carList.add(this.fleet.get(i));
            }
        }
        return  carList;
    }

    public Car getCarsBySerialNumber(String serialNumber){
        for(int i=0;i<this.fleet.size();i++){
            if(this.fleet.get(i).getSerialNumber().equals(serialNumber)){
                return this.fleet.get(i);
            }
        }
        return  null;
    }

    public List<Car> getAllCarsByModelNumber(String modelNumber){
        List<Car> carList = new LinkedList<Car>();
        for(int i=0;i<this.fleet.size();i++){
            if(this.fleet.get(i).getModelNumber().equals(modelNumber)){
                carList.add(this.fleet.get(i));
            }
        }
        return  carList;
    }

    public List<String> getAllManufacturers(){
        List<String> manufacturers = new LinkedList<String>();
        for(int i=0;i<this.fleet.size();i++){
            if(!manufacturers.contains(this.fleet.get(i).getManufacturer())){
                manufacturers.add(this.fleet.get(i).getManufacturer());
            }
        }
        return manufacturers;
    }

    public List<Car> getAllCarsInCity(String city){
        List<Car> carList = new LinkedList<Car>();
        for(int i=0;i<this.fleet.size();i++){
            if(this.fleet.get(i).getGeoLocality().equals(city)){
                carList.add(this.fleet.get(i));
            }
        }
        return  carList;
    }

    public List<Car> getAllCarsWithExpiredMaintenance(){
        List<Car> carList = new LinkedList<Car>();
        for(int i=0;i<this.fleet.size();i++){
            if(new Date().after(this.fleet.get(i).getMaintenaceExpiry())){
                carList.add(this.fleet.get(i));
            }
        }
        return  carList;
    }
}
