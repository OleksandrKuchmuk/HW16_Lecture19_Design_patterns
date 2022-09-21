package com.cursor.builderPattern;

public class Director {
    CarBuilder builder;

    public void setBuilder(CarBuilder builder) {
        this.builder = builder;
    }

    Car buildCar() {
        builder.createCar();
        builder.buildModelName();
        builder.buildMaxSpeed();
        builder.buildTypeOfBody();
        builder.buildColor();

        Car car = builder.getCar();
        return car;
    }
}
