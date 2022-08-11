package com.mykyta.models.bridge;

public class FigureCreator {
    public static void main(String[] args) {
        Figure[] figures = {new Square(new Blue()),
                new Circle(new Red())
        };

        for (Figure figure : figures){
            figure.createFigure();
        }
    }
}
