package com.cursor;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Main {
    private static final Logger LOGGER = LogManager.getLogger(Main.class);

    public static void main(String[] args) {
        Service service = new Service();
        LOGGER.info("\nTis is the main class and you can start from here");
        service.makeChoice();
    }
}