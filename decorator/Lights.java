package decorator;

import java.util.ArrayList;

public class Lights extends TreeDecorator {
    private static final String WHITE = "\033[0;37m";

    private Tree tree;

    /**
     * Creates a Lights decorator.
     *
     * @param tree the tree to decorate
     */
    public Lights(Tree tree) {
        super(new ArrayList<>(tree.lines));
        this.tree = tree;
        ArrayList<String> decor = FileReader.getLines("decorator/lights.txt");
        integrateDecor(decor, WHITE);
    }
}
