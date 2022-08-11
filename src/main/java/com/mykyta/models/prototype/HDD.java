package com.mykyta.models.prototype;

public class HDD implements Prototype {
    private int capacity;
    private String name;

    public HDD(int capacity, String name) {
        this.capacity = capacity;
        this.name = name;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public Object copy() {
        HDD copyHdd = new HDD(capacity, name);
        return copyHdd;
    }

    @Override
    public String toString() {
        return "HDD{" +
                "capacity=" + capacity +
                ", name='" + name + '\'' +
                '}';
    }
}
