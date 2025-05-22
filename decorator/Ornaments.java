package decorator;

import java.util.ArrayList;

public class Ornaments extends TreeDecorator {
    public Ornaments(Tree tree) {
        super(new ArrayList<>(tree.lines));
        this.tree = tree;
        integrateDecor(FileReader.getLines("decorator/ornaments.txt"));
    }
}
