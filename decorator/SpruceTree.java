package decorator;

public class SpruceTree extends Tree {
    public SpruceTree() {
        super(FileReader.getLines("decorator/spruce-tree.txt"));

        for (int i = 0; i < lines.size(); i++) {
            StringBuilder sb = new StringBuilder();
            String line = lines.get(i);

            for (char c : line.toCharArray()) {
                if (c == 'B') {
                    sb.append(BROWN).append('|').append(RESET); // Replace B with brown |
                } else {
                    sb.append(GREEN).append(c).append(RESET);  // Everything else stays the same, just green
                }
            }

            lines.set(i, sb.toString());
        }
    }
}

