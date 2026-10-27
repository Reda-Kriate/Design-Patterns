package org.reda.composite;

public abstract class Component {
    protected int level = 0; // Niveau d'indentation dans la hiérarchie
    protected String name;

    public Component(String name) {
        this.name = name;
    }

    public abstract void print(); // Opération commune à tous les composants

    public String tabs(){ // Génère le nombre de tabulations en fonction du niveau
        String tabs = "";
        for (int i = 0; i<level ; i++){
            tabs= tabs +"\t";
        }
        return tabs;
    }
}
