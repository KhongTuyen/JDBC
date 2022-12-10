/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.io.Serializable;

public class Vehicle implements Serializable {
    private static final long serialVersionUID= 1L;
    private String vehicleId;
    private String vehicleName;
    private String maker;
    private String vehType;
    private double unitPrice;
    private int year;
    private String color;
    private int seatNum;
    private String engineType;
    private int wattage;
    private int tonnage;

    
    
    public String getVehicleId() {
        return vehicleId;
    }
    public void setVehicleId(String vehicleId) {
        this.vehicleId = vehicleId;
    }

    public String getVehicleName() {
        return vehicleName;
    }
    public void setVehicleName(String vehicleName) {
        this.vehicleName = vehicleName;
    }

    public String getMaker() {
        return maker;
    }
    public void setMaker(String maker) {
        this.maker = maker;
    }
    
    public String getVehType() {
        return vehType;
    }
    public void setVehType(String vehType) {
        this.vehType = vehType;
    }

    public double getUnitPrice() {
        return unitPrice;
    }
    public void setUnitPrice(double unitPrice) {
    this.unitPrice = unitPrice;
    }

    public int getYear() {
        return year;
    }
    public void setYear(int year) {
        this.year = year;
    }

    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }

    public int getSeatNum() {
        return seatNum;
    }
    public void setSeatNum(int seatNum) {
        this.seatNum = seatNum;
    }

    public String getEngineType() {
        return engineType;
    }
    public void setEngineType(String engineType) {
        this.engineType = engineType;
    }

    public int getWattage() {
        return wattage;
    }
    public void setWattage(int wattage) {
        this.wattage = wattage;
    }

    public int getTonnage() {
        return tonnage;
    }
    public void setTonnage(int tonnage) {
        this.tonnage = tonnage;
    }

    public Vehicle(String vehicleId, String vehicleName,
    String maker, String vehType, double unitPrice, int year, String color, int seatNum, 
    String engineType, int wattage, int tonnage) {
        super();
        this.vehicleId = vehicleId;
        this.vehicleName = vehicleName;
        this.maker = maker;
        this.vehType = vehType;
        this.unitPrice = unitPrice;
        this.year = year;
        this.color = color;
        this.seatNum = seatNum;
        this.engineType = engineType;
        this.wattage = wattage;
        this.tonnage = tonnage;
    }

    public Vehicle() {
        super();
    }
}

