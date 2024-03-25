public class FindingCountRowsToOutConsole extends FindingCountCharactersToFillConsole {
    public int calculateRowsToOutConsole(String text, int consoleWidth) {
        int lines = 1;
        int currentLineLength = 0;

        for (char c : text.toCharArray()) {
            if (c == '\n') {
                lines++;
                currentLineLength = 0;
            } else {
                currentLineLength++;
                if (currentLineLength > consoleWidth) {
                    lines++;
                    currentLineLength = 0;
                }
            }
        }
        return lines;
    }
}
