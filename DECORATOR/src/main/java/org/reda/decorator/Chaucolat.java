package org.reda.decorator;

import org.reda.boisson.Boisson;

public class Chaucolat extends DecoratorBoisson{

    public Chaucolat(Boisson boisson) {
        super(boisson); // Transmet la boisson au constructeur parent
    }

    @Override
    public double cout() {
        return boisson.cout() + 2; // Prix du chocolat + coût de la boisson décorée
    }

    @Override
    public String getDescription() {
        return boisson.getDescription() + " Au chocolat";
    }
}
