package com.mykyta.models.abstractfactory;

import com.mykyta.models.abstractfactory.headphones.Headphones;
import com.mykyta.models.abstractfactory.phones.Phone;

public interface ProductionFactory {
    Headphones createHeadphones();
    Phone createPhone();
}
