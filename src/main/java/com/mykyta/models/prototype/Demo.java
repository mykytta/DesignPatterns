package com.mykyta.models.prototype;

public class Demo {
    public static void main(String[] args) {
        HDD hdd = new HDD(256, "Seagate");

        System.out.println(hdd);

        HddFactory hddFactory = new HddFactory(hdd);
        HDD cloneHdd = hddFactory.cloneHdd();
        System.out.println(cloneHdd);
    }
}
