package decorator;

import java.util.ArrayList;

public class Tree {
    protected static final String RESET = "\033[0m";
    protected static final String GREEN = "\033[0;32m";
    protected static final String WHITE = "\033[0;37m";
    protected static final String RED = "\033[0;31m";
    protected static final String YELLOW = "\033[0;33m";
    protected static final String BROWN = "\u001B[38;2;139;69;19m";

    protected ArrayList<String> lines;

    public Tree(ArrayList<String> lines) {
        this.lines = lines;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (String line : lines) {
            sb.append(line).append("\n");
        }
        return sb.toString();
    }
}
