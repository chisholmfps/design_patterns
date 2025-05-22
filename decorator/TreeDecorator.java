package decorator;

import java.util.ArrayList;

public abstract class TreeDecorator extends Tree {
    protected Tree tree;

    public TreeDecorator(ArrayList<String> lines) {
        super(lines);
    }

    protected void integrateDecor(ArrayList<String> decor) {
        for (int i = 0; i < lines.size() && i < decor.size(); i++) {
            String baseLine = lines.get(i);
            String decorLine = decor.get(i);
            StringBuilder newLine = new StringBuilder();

            int baseIndex = 0;
            for (int j = 0; j < baseLine.length(); ) {
                // Preserve ANSI escape codes
                if (baseLine.charAt(j) == '\033') {
                    int end = j + 1;
                    while (end < baseLine.length() && baseLine.charAt(end) != 'm') end++;
                    end++;
                    newLine.append(baseLine, j, end);
                    j = end;
                    continue;
                }

                // Handle R() → red ()
                if (baseIndex + 2 < decorLine.length()
                        && decorLine.charAt(baseIndex) == 'R'
                        && decorLine.charAt(baseIndex + 1) == '('
                        && decorLine.charAt(baseIndex + 2) == ')') {

                    // Skip 2 visible characters in base
                    int visibleChars = 0;
                    while (j < baseLine.length() && visibleChars < 2) {
                        if (baseLine.charAt(j) == '\033') {
                            int end = j + 1;
                            while (end < baseLine.length() && baseLine.charAt(end) != 'm') end++;
                            end++;
                            newLine.append(baseLine, j, end);
                            j = end;
                        } else {
                            visibleChars++;
                            j++;
                        }
                    }

                    newLine.append(RED).append("()").append(RESET);
                    baseIndex += 3;
                    continue;
                }

                // Handle W* → white *
                if (baseIndex + 1 < decorLine.length()
                        && decorLine.charAt(baseIndex) == 'W'
                        && decorLine.charAt(baseIndex + 1) == '*') {
                    newLine.append(WHITE).append('*').append(RESET);
                    baseIndex += 2;
                    j++;
                    continue;
                }

                // Skip 'Y' (used for alignment in star.txt)
                char decorChar = (baseIndex < decorLine.length()) ? decorLine.charAt(baseIndex) : ' ';
                if (decorChar == 'Y') {
                    baseIndex++;
                    continue;
                }

                // Yellow star decorations
                if ("/\\<>".indexOf(decorChar) >= 0) {
                    newLine.append(YELLOW).append(decorChar).append(RESET);
                    baseIndex++;
                    j++;
                    continue;
                }

                // White +
                if (decorChar == '+') {
                    newLine.append(WHITE).append('+').append(RESET);
                    baseIndex++;
                    j++;
                    continue;
                }

                // Fallback: preserve base character
                newLine.append(baseLine.charAt(j));
                baseIndex++;
                j++;
            }

            lines.set(i, newLine.toString());
        }
    }
}
