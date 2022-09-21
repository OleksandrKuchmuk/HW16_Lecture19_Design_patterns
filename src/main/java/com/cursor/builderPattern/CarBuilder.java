package com.cursor.builderPattern;

public abstract class CarBuilder {
    Car car;

    void createCar(){
        car = new Car();
    }

    abstract void buildModelName();
    abstract void buildMaxSpeed();
    abstract void buildTypeOfBody();
    abstract void buildColor();

    Car getCar(){
        return car;
    }

}
