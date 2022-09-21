package com.cursor.factoryPattern;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class MainFactory {
    private static final Logger LOGGER = LogManager.getLogger(MainFactory.class);
    public static void main(String[] args) {
        LOGGER.info("This is the Factory pattern, and show how it works");
        AnimalsFactory animalsFactory = new AnimalsFactory();

        LOGGER.info("get an object of Cat and call its say method.");
        Animal animal1 = animalsFactory.getAnimal("cat");
        animal1.say();
        LOGGER.info("get an object of Dog and call its say method.");
        Animal animal2 = animalsFactory.getAnimal("dog");
        animal2.say();
        LOGGER.info("get an object of Cow and call its say method.");
        Animal animal3 = animalsFactory.getAnimal("cow");
        animal3.say();
        LOGGER.info("get an object of Duck and call its say method.");
        Animal animal4 = animalsFactory.getAnimal("duck");
        animal4.say();
    }
}
