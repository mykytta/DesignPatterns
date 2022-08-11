package com.mykyta.models.visitor;

public interface Element {
    void accept(Visitor visitor);
}
