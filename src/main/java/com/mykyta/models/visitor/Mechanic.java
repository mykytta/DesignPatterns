package com.mykyta.models.visitor;

public class Mechanic implements Visitor{
    @Override
    public void visit(EngineElement engine) {
        System.out.println("Replaced the cylinder");
    }

    @Override
    public void visit(BodyElement body) {
        System.out.println("Removed the dent");
    }
}
