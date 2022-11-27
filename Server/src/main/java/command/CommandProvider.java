package command;

import command.impl.AddFileCommand;
import command.impl.DeleteFileCommand;
import command.impl.GetAllFilesFilesCommand;
import command.impl.GetFilesBySearchCommand;

import java.util.HashMap;
import java.util.Map;

public class CommandProvider {

    private final Map<String, Command> commands = new HashMap<>();

    public CommandProvider() {
        commands.put("get_all_files", new GetAllFilesFilesCommand());
        commands.put("delete_file", new DeleteFileCommand());
        commands.put("add_file", new AddFileCommand());
        commands.put("search", new GetFilesBySearchCommand());
    }

    public Command getCommand(String request) {
        return commands.get(request);
    }
}
