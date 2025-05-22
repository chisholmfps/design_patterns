package decorator;

import java.util.ArrayList;

public class Ornaments extends TreeDecorator {
    private static final String RED = "\033[0;31m";

    private Tree tree;

    public Ornaments(Tree tree) {
        super(new ArrayList<>(tree.lines));
        this.tree = tree;
        ArrayList<String> decor = FileReader.getLines("decorator/ornaments.txt");
        integrateDecor(decor, RED);
    }
}
