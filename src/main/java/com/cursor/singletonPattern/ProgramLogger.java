package com.cursor.singletonPattern;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ProgramLogger {
    private static final Logger LOGGER = LogManager.getLogger(ProgramLogger.class);
    private static ProgramLogger programLogger;
    private static String logFile = "LOGGER: This is log file. \n\n";

    private ProgramLogger() {
    }

    public static synchronized ProgramLogger getProgramLogger() {
        if (programLogger == null) {
            programLogger = new ProgramLogger();
        }
        return programLogger;
    }

    public void addLogInfo(String logInfo) {
        logFile += logInfo + "\n";
    }

    public void showLogFile() {
        LOGGER.info("\n\n" + logFile);
    }
}