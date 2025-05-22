package decorator;

import java.util.ArrayList;

public class Lights extends TreeDecorator {
    public Lights(Tree tree) {
        super(new ArrayList<>(tree.lines));
        this.tree = tree;
        integrateDecor(FileReader.getLines("decorator/lights.txt"));
    }
}
