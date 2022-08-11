package com.mykyta.models.visitor;

public interface Visitor {
    void visit(EngineElement engine);
    void visit(BodyElement body);
}
