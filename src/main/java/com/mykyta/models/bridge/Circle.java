package com.mykyta.models.bridge;

public class Circle extends Figure{

    protected Circle(Color color) {
        super(color);
    }

    @Override
    public void createFigure() {
        System.out.println("Creating a circle");
        color.fillWithColor();
    }
}
