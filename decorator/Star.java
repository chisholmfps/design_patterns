package decorator;

import java.util.ArrayList;

public class Star extends TreeDecorator {
    public Star(Tree tree) {
        super(new ArrayList<>(tree.lines));
        this.tree = tree;
        integrateDecor(FileReader.getLines("decorator/star.txt"));
    }
}
