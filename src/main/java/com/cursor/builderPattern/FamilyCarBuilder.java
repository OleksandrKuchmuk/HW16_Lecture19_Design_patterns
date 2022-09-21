package com.cursor.builderPattern;

public class FamilyCarBuilder extends CarBuilder {
    @Override
    void buildModelName() {
        car.setModelName("Grand Picasso");
    }

    @Override
    void buildMaxSpeed() {
        car.setMaxSpeed(250);
    }

    @Override
    void buildTypeOfBody() {
        car.setTypeOfBody("Minivan");
    }

    @Override
    void buildColor() {
        car.setColor("Silver");
    }
}
