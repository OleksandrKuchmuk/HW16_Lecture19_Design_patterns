package com.cursor.factoryPattern;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Duck implements Animal{
    private static final Logger LOGGER = LogManager.getLogger(Duck.class);

    @Override
    public void say() {
        LOGGER.info("I am a duck and i say: Quack-quack");
    }
}
