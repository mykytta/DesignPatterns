package com.mykyta.models.visitor;

public class Driver implements Visitor{
    @Override
    public void visit(EngineElement engine) {
        System.out.println("Poured oil into the engine");
    }

    @Override
    public void visit(BodyElement body) {
        System.out.println("Washed the car");
    }
}
