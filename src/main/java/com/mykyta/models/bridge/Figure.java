package com.mykyta.models.bridge;

public abstract class Figure {
    protected Color color;

    protected Figure(Color color) {
        this.color = color;
    }

    public abstract void createFigure();
}
