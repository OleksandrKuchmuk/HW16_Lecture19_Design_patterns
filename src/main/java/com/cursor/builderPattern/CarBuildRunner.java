package com.cursor.builderPattern;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class CarBuildRunner {
    private static final Logger LOGGER = LogManager.getLogger(CarBuildRunner.class);

    public static void main(String[] args) {
        LOGGER.info("This is the Builder pattern, and show how it works");
        Director director = new Director();

        LOGGER.info("Create sport car with SportCarBuilder()");
        director.setBuilder(new SportCarBuilder());
        Car car1 = director.buildCar();
        LOGGER.info("And we have sport car: \n" + car1);

        LOGGER.info("Create sport car with FamilyCarBuilder()");
        director.setBuilder(new FamilyCarBuilder());
        Car car2 = director.buildCar();
        LOGGER.info("And we have family car: \n" + car2);

        LOGGER.info("Create sport car with OffRoadCarBuilder()");
        director.setBuilder(new OffRoadCarBuilder());
        Car car3 = director.buildCar();
        LOGGER.info("And we have off-road car: \n" + car3);
    }


}
