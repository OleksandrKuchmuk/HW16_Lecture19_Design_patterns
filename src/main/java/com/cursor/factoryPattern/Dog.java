package com.cursor.factoryPattern;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Dog implements Animal {
    private static final Logger LOGGER = LogManager.getLogger(Dog.class);

    @Override
    public void say() {
        LOGGER.info("I am a dog and i say: Woof");
    }
}
