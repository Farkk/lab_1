public class FindingCountCharactersToFillConsole implements IConsoleLayoutManager  {
    @Override
    public int calculateCharsToFillLastLine(int consoleWidth, String text) {
        int textLength = text.length();
        int remainder = textLength % consoleWidth;
        int charsToFillLastLine = 0;

        if (remainder > 0) {
            charsToFillLastLine = consoleWidth - remainder;
        }

        return charsToFillLastLine;
    }
}
