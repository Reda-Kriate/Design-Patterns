import org.reda.composite.File;
import org.reda.composite.Folder;

public class Test {
    public static void main(String[] args) {
        Folder root = new Folder("Root");
        Folder src = new Folder("src");
        Folder build = new Folder("build");

        root.addChild(new File("pom.xml"));
        root.addChild(new File("jit.java"));
        root.addChild(src);
        root.addChild(build);

        src.addChild(new File("main.java"));
        src.addChild(new File("test.java"));

        build.addChild(new File("maven"));
        build.addChild(new File("git.gt"));

        // Un seul appel print() sur le nœud racine exécute l'affichage de toute l'arborescence !
        root.print();
    }
}
