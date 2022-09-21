package com.cursor.builderPattern;

public class OffRoadCarBuilder extends CarBuilder {
    @Override
    void buildModelName() {
        car.setModelName("Jimny");
    }

    @Override
    void buildMaxSpeed() {
        car.setMaxSpeed(200);
    }

    @Override
    void buildTypeOfBody() {
        car.setTypeOfBody("Off-Road");
    }

    @Override
    void buildColor() {
        car.setColor("Black");
    }
}
