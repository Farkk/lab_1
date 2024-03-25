public class FindingCountSymbolOnLastRows extends FindingCountRowsToOutConsole {
    @Override
    public int calculateCharsToFillLastLine(int consoleWidth, String text) {
        int lastLineLength = text.length() % consoleWidth;
        return lastLineLength == 0 ? consoleWidth : lastLineLength - 1;
    }
}
