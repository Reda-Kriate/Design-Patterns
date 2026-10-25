package org.reda.decorator;

import org.reda.boisson.Boisson;

public class Caramel extends DecoratorBoisson{

    public Caramel(Boisson boisson) {
        super(boisson);
    }

    @Override
    public double cout() {
        return boisson.cout() + 2.5;
    }

    @Override
    public String getDescription() {
        return boisson.getDescription() + " Au Caramel";
    }
}
