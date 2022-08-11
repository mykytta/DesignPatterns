package com.mykyta.models.command;

public class DeleteCommand implements Command {
    File file;

    public DeleteCommand(File file) {
        this.file = file;
    }

    @Override
    public void execute() {
        file.delete();
    }
}
