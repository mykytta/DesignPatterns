package com.mykyta.models.abstractfactory;

import com.mykyta.models.abstractfactory.headphones.Headphones;
import com.mykyta.models.abstractfactory.headphones.SamsungHeadphones;
import com.mykyta.models.abstractfactory.phones.Phone;
import com.mykyta.models.abstractfactory.phones.SamsungPhone;

public class SamsungFactory implements ProductionFactory{
    @Override
    public Headphones createHeadphones() {
        return new SamsungHeadphones();
    }

    @Override
    public Phone createPhone() {
        return new SamsungPhone();
    }
}
