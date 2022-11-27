package presentation.impl;

import presentation.UserInterface;
import service.ConsoleDataService;
import service.impl.ConsoleDataServiceImpl;

public class UserInterfaceImpl implements UserInterface {

    ConsoleDataService consoleDataService = ConsoleDataServiceImpl.getInstance();

    @Override
    public String adminMenu() {
        int menuItem;

        menuItem = consoleDataService.getNumFromConsole("" +
                        "|+++ ADMIN MENU +++|\n" +
                        "1. Show all files\n" +
                        "2. Search by keyword\n",
                1, 2);

        switch (menuItem) {
            case 1:
                return "service get_all_files";
            case 2:
                return "service search petrov";
        }
        return "Enter number 1 - 2!";
    }

    @Override
    public void userMenu() {

    }
}
