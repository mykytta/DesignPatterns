package com.mykyta.models.visitor;

public class VisitorApp {
    public static void main(String[] args) {
        Element engine = new EngineElement();
        Element body = new BodyElement();
        Visitor mechanic = new Mechanic();

        engine.accept(mechanic);
        body.accept(mechanic);
    }
}
