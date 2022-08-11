package com.mykyta.models.abstractfactory;

public class Demo {
    public static void main(String[] args) {
        Production production1 = createProductionByFactoryName("Apple");
        production1.printModel();

        Production production2 = createProductionByFactoryName("Samsung");
        production2.printModel();
    }

    private static Production createProductionByFactoryName(String factoryName) {
        if(factoryName.equalsIgnoreCase("Apple")) {
            return new Production(new AppleFactory());
        }else if(factoryName.equalsIgnoreCase("Samsung")) {
            return new Production(new SamsungFactory());
        } else{
            throw new RuntimeException("This factory is not available");
        }
    }
}
