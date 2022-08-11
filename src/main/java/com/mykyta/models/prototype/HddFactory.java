package com.mykyta.models.prototype;

public class HddFactory {
    HDD hdd;

    public HddFactory(HDD hdd) {
        this.hdd = hdd;
    }

    public void setHdd(HDD hdd) {
        this.hdd = hdd;
    }

    HDD cloneHdd(){
        return (HDD) hdd.copy();
    }
}
