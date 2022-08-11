package com.mykyta.models.memento;

public class Demo {
    public static void main(String[] args) throws InterruptedException {
        Game game = new Game();
        game.set("LVL 5");
        System.out.println(game);

        File file = new File();
        file.setSave(game.save());

        Thread.sleep(3000);
        game.set("LVL 7 ");
        System.out.println(game);

        game.load(file.getSave());
        System.out.println(game);


    }

}
