package com.mykyta.models.command;

public class UpdateCommand implements Command{
    File file;

    public UpdateCommand(File file) {
        this.file = file;
    }

    @Override
    public void execute() {
        file.update();
    }
}
