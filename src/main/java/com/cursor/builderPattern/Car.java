package com.cursor.builderPattern;

public class Car {
    private String modelName;
    private int maxSpeed;
    private String typeOfBody;
    private String color;

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public void setTypeOfBody(String typeOfBody) {
        this.typeOfBody = typeOfBody;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Car{" +
                "modelName='" + modelName + '\'' +
                ", maxSpeed=" + maxSpeed +
                ", typeOfBody='" + typeOfBody + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
