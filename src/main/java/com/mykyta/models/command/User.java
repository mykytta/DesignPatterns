package com.mykyta.models.command;

public class User {
    Command read;
    Command write;
    Command update;
    Command delete;

    public User(Command read, Command write, Command update, Command delete) {
        this.read = read;
        this.write = write;
        this.update = update;
        this.delete = delete;
    }

    public void readFile(){
        read.execute();
    }

    public void writeFile(){
        write.execute();
    }

    public void updateFile(){
        update.execute();
    }

    public void  deleteFile(){
        delete.execute();
    }
}
