package com.cursor.factoryPattern;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Cow implements Animal {
    private static final Logger LOGGER = LogManager.getLogger(Cow.class);

    @Override
    public void say() {
        LOGGER.info("I am a cow and i say: Moo");
    }
}
