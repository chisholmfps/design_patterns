package decorator;

import java.util.ArrayList;

public abstract class Tree {
    private static final String RESET = "\033[0m";  // Text Reset
    private static final String GREEN = "\033[0;32m";   // GREEN
    private static final String WHITE = "\033[0;37m";   // WHITE
    private static final String RED = "\033[0;31m";     // RED
    private static final String YELLOW = "\033[0;33m";  // YELLOW
    private static final String BROWN = "\u001B[38;2;139;69;19m"; // RGB: 139, 69, 19

    protected ArrayList<String> lines;
    
    /**
     * Creates a new Tree with the given lines.
     *
     * @param lines the text lines representing the tree
     */
    public Tree(ArrayList<String> lines) {
        this.lines = lines;
    }

    /**
     * Returns the tree as a formatted string.
     *
     * @return the complete tree as a single string
     */
    @Override
    public String toString() {
        return String.join("\n", lines) + RESET;
    }
}
