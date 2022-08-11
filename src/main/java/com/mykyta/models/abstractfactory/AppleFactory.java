package com.mykyta.models.abstractfactory;

import com.mykyta.models.abstractfactory.headphones.AppleHeadphones;
import com.mykyta.models.abstractfactory.headphones.Headphones;
import com.mykyta.models.abstractfactory.phones.ApplePhone;
import com.mykyta.models.abstractfactory.phones.Phone;

public class AppleFactory implements ProductionFactory{

    @Override
    public Headphones createHeadphones() {
        return new AppleHeadphones();
    }

    @Override
    public Phone createPhone() {
        return new ApplePhone();
    }
}
