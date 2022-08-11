package com.mykyta.models.abstractfactory;

import com.mykyta.models.abstractfactory.headphones.Headphones;
import com.mykyta.models.abstractfactory.phones.Phone;

public class Production {
    private Headphones headphones;
    private Phone phone;

    public Production(ProductionFactory productionFactory){
        headphones = productionFactory.createHeadphones();
        phone = productionFactory.createPhone();
    }

    public void printModel(){
        headphones.printModel();
        phone.printModel();
    }
}
