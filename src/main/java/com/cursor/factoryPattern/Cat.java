package com.cursor.factoryPattern;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Cat implements Animal{
        private static final Logger LOGGER = LogManager.getLogger(Cat.class);

    @Override
    public void say() {
        LOGGER.info("I am a cat and i say: Meow");
    }
}
