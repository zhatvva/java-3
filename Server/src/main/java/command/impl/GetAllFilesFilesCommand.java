package command.impl;

import command.Command;
import service.FileBaseService;
import service.ServiceProvider;

public class GetAllFilesFilesCommand implements Command {

    private final FileBaseService fileBaseService = ServiceProvider.getInstance().getFileBaseService();

    @Override
    public String execute(String request) {
        return fileBaseService.getAllFiles();
    }
}
