package com.cursor.singletonPattern;

import com.cursor.Main;

public class Program {
    public void singletonMain() {
        ProgramLogger.getProgramLogger().addLogInfo("This is the first log entry in this program");
        ProgramLogger.getProgramLogger().addLogInfo("This is the second log entry in this program");
        ProgramLogger.getProgramLogger().addLogInfo("This is the third log entry in this program");

        ProgramLogger.getProgramLogger().showLogFile();

        Main.main(new String[]{"0"});
    }
}