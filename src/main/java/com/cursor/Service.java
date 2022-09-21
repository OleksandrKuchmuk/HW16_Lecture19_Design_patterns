package com.cursor;

import com.cursor.builderPattern.CarBuildRunner;
import com.cursor.facadePattern.MainFacadePattern;
import com.cursor.factoryPattern.MainFactory;
import com.cursor.singletonPattern.Program;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Scanner;

public class Service {
    private static final Logger LOGGER = LogManager.getLogger(Service.class);
    private Scanner scanner = new Scanner(System.in);
    private CarBuildRunner carBuild = new CarBuildRunner();
    private MainFacadePattern mainFacade = new MainFacadePattern();
    private MainFactory mainFactory = new MainFactory();
    private Program program = new Program();
    private int choice;

    public void makeChoice() {
        LOGGER.info("To start the program with pattern Builder enter 1");
        LOGGER.info("To start the program with pattern Facade enter 2");
        LOGGER.info("To start the program with pattern Factory enter 3");
        LOGGER.info("To start the program with pattern Singleton enter 4");
        LOGGER.info("To stop the program enter 0");
        choice = scanner.nextInt();
        choseProgramDependingOnTheChoice(choice);
    }

    public void choseProgramDependingOnTheChoice(Integer choice) {
        switch (choice) {
            case (0):
                System.exit(0);
                break;
            case (1):
                carBuild.buildRunner();
                break;
            case (2):
                mainFacade.facadeRunner();
                break;
            case (3):
                mainFactory.factoryMain();
                break;
            case (4):
                program.singletonMain();
                break;
            default:
                LOGGER.info("Invalid input");
        }
    }
}