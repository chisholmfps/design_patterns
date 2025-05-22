package decorator;

import java.util.ArrayList;

public abstract class TreeDecorator extends Tree {
    private static final String GREEN = "\033[0;32m";
    private static final String RESET = "\033[0m";

    public TreeDecorator(ArrayList<String> lines) {
        super(lines);
    }

    protected void integrateDecor(ArrayList<String> decor, String color) {
    for (int i = 0; i < decor.size(); i++) {
        if (i >= lines.size()) continue;

        String baseLineWithColors = lines.get(i);
        String baseLine = baseLineWithColors.replaceAll("\033\\[[;\\d]*m", "");  // Strip ANSI
        String decorLine = decor.get(i);

        StringBuilder newLine = new StringBuilder();
        int visualIndex = 0;

        for (int j = 0; j < baseLineWithColors.length(); j++) {
            char ch = baseLineWithColors.charAt(j);

            if (ch == '\033') {
                // Copy ANSI code through untouched
                int mIndex = baseLineWithColors.indexOf('m', j);
                newLine.append(baseLineWithColors, j, mIndex + 1);
                j = mIndex;
            } else {
                if (
                    visualIndex < decorLine.length() &&
                    !Character.isWhitespace(decorLine.charAt(visualIndex))
                ) {
                    // Replace with decoration character and apply color
                    char decorChar = decorLine.charAt(visualIndex);
                    newLine.append(color).append(decorChar).append("\033[0;32m"); // Reset to green
                } else {
                    newLine.append(ch); // Keep base char
                }
                visualIndex++;
            }
        }

        lines.set(i, "\033[0;32m" + newLine.toString());
    }
}


}
