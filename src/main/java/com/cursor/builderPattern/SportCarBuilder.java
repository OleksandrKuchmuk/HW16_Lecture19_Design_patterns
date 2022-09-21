package com.cursor.builderPattern;

public class SportCarBuilder extends CarBuilder {
    @Override
    void buildModelName() {
        car.setModelName("Diablo");
    }

    @Override
    void buildMaxSpeed() {
        car.setMaxSpeed(450);
    }

    @Override
    void buildTypeOfBody() {
        car.setTypeOfBody("Coupe");
    }

    @Override
    void buildColor() {
        car.setColor("Red");
    }
}
