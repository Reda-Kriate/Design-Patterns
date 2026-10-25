package org.reda.decorator;

import org.reda.boisson.Boisson;

public abstract class DecoratorBoisson extends Boisson {
    Boisson boisson; // Composition avec l'objet décoré

    public DecoratorBoisson(Boisson boisson) {
        this.boisson = boisson; // Initialisation de la boisson à décorer
    }

    @Override
    public abstract String getDescription(); // Ré-abstraction de la méthode
}
