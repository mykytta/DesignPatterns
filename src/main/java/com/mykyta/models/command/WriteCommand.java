package com.mykyta.models.command;

public class WriteCommand implements Command{
    File file;

    public WriteCommand(File file) {
        this.file = file;
    }

    @Override
    public void execute() {
        file.write();
    }
}
