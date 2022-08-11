package com.mykyta.models.bridge;

public class Square extends Figure{

    protected Square(Color color) {
        super(color);
    }

    @Override
    public void createFigure() {
        System.out.println("Creating a square");
        color.fillWithColor();
    }
}
