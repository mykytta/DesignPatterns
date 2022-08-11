package com.mykyta.models.command;

public class ReadCommand implements Command{
    File file;

    public ReadCommand(File file) {
        this.file = file;
    }


    @Override
    public void execute() {
        file.read();
    }
}
