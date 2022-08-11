package com.mykyta.models.command;

public class Demo {
    public static void main(String[] args) {
        File file = new File();

        User user = new User(new ReadCommand(file), new WriteCommand(file),
                new UpdateCommand(file), new DeleteCommand(file));

        user.readFile();
        user.writeFile();
        user.updateFile();
        user.deleteFile();
    }
}
