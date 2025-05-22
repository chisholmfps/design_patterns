package decorator;

import java.util.ArrayList;

public class Star extends TreeDecorator {
    private static final String YELLOW = "\033[0;33m";

    private Tree tree;

    /**
     * Creates a new Star decorator.
     *
     * @param tree the tree to decorate
     */
    public Star(Tree tree) {
        super(new ArrayList<>(tree.lines));
        this.tree = tree;
        ArrayList<String> decor = FileReader.getLines("decorator/star.txt");
        integrateDecor(decor, YELLOW);
    }
}
