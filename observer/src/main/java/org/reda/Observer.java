package org.reda;

public interface Observer{
//    void update(int state); // Méthode PUSH
    void update(Observable observable); // Méthode POP (PULL)
}
