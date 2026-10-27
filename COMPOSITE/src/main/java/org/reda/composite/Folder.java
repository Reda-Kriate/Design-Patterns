package org.reda.composite;

import java.util.ArrayList;
import java.util.List;

public class Folder extends Component {

    // Composition
    private List<Component> components = new ArrayList<>();

    public Folder(String name) {
        super(name);
    }

    @Override
    public void print() {
        System.out.println( tabs() + "Folder : " + name);
        // un affichage à tous les enfants (fichiers ou sous-dossiers)
        for (Component c : components){
            c.print();
        }
    }

    //l'ajout des sous-dossier et fichier (component)
    public Component addChild(Component c){
        c.level = this.level + 1;
        components.add(c);
        return c;
    }
}
