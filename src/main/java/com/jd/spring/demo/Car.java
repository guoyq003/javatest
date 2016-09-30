package com.jd.spring.demo;

/**
 * Created by guoyiqing1 on 2016/6/3.
 */
public class Car {
    private String brand;
    private String corlor;
    private int maxSpeed;
    private double price;

    public Car(){}
    public Car(String brand, String corlor, double price) {
        this.brand = brand;
        this.corlor = corlor;
        this.price = price;
    }

    public Car(String brand, String corlor, int maxSpeed) {

        this.brand = brand;
        this.corlor = corlor;
        this.maxSpeed = maxSpeed;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getCorlor() {
        return corlor;
    }

    public void setCorlor(String corlor) {
        this.corlor = corlor;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", corlor='" + corlor + '\'' +
                ", maxSpeed=" + maxSpeed +
                ", price=" + price +
                '}';
    }
}
