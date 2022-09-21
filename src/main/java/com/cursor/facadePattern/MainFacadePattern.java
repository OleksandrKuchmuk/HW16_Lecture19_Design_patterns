package com.cursor.facadePattern;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class MainFacadePattern {
    private static final Logger LOGGER = LogManager.getLogger(MainFacadePattern.class);

    public static void main(String[] args) {
        LOGGER.info("This is the Facade pattern, and show how it works");
        String textToFile = "Text will be write to file and then read from file by other method";
        LOGGER.info("Text to write to file.txt: "+textToFile);
        WriteToFileFacade writeToFile = new WriteToFileFacade();
        ReadFromFileFacade readFromFile = new ReadFromFileFacade();

        LOGGER.info("In this step we write some text to file");
        writeToFile.writeToFile("file.txt", textToFile);

        LOGGER.info("In this step we read some text from file");
        LOGGER.info(readFromFile.readFile("file.txt"));


    }

}
