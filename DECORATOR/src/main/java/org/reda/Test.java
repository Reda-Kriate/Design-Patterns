package org.reda;

import org.reda.boisson.Boisson;
import org.reda.boisson.Espresso;
import org.reda.boisson.Latte;
import org.reda.decorator.Caramel;
import org.reda.decorator.Chaucolat;
import org.reda.decorator.Noisette;

public class Test {
    public static void main(String[] args) {
        Boisson boisson;
//        boisson = new Espresso();
//        System.out.println(boisson.getDescription());
//        System.out.println(boisson.cout());
//        System.out.println("--------------------------");
//
//        boisson = new Chaucolat(boisson);
//        System.out.println(boisson.getDescription());
//        System.out.println(boisson.cout());
//        System.out.println("--------------------------");
//
//        boisson = new Caramel(boisson);
//        System.out.println(boisson.getDescription());
//        System.out.println(boisson.cout());
//        System.out.println("--------------------------");

        boisson = new Chaucolat(new Caramel(new Noisette(new Latte())));
        System.out.println(boisson.getDescription());
        System.out.println(boisson.cout());
    }
}
