package decorator;

public class SpruceTree extends Tree {
    private static final String GREEN = "\033[0;32m";
    private static final String BROWN = "\u001B[38;2;139;69;19m";

    public SpruceTree() {
        super(FileReader.getLines("decorator/spruce-tree.txt"));
        for (int i = 0; i < lines.size(); i++) {
            String line = lines.get(i);
            if (line.contains("|")) {
                line = line.replace("|", BROWN + "|" + GREEN);
                lines.set(i, GREEN + line);
            } else {
                lines.set(i, GREEN + line);
            }
        }
    }
}
