package com.cursor.facadePattern;

import java.io.FileWriter;
import java.io.IOException;

public class WriteToFileFacade {
//    String textToFile = "This text will be write to file and then read from file by other method";

    public void writeToFile(String fileName, String text) {
        try {
            FileWriter fileWriter = new FileWriter(fileName);
            fileWriter.write(text);
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
