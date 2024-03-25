import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int choice = 0;
        while (true) {
            System.out.println("Выберите вариант (1 или 2):");
            String choiceStr = scanner.nextLine();
            try {
                choice = Integer.parseInt(choiceStr);
                if (choice == 1 || choice == 2) break;
                else System.out.println("Неверный выбор. Введите число 1 или 2.");

            } catch (NumberFormatException e) {
                System.out.println("Неверный выбор. Введите число 1 или 2.");
            }
        }

        System.out.print("Введите ширину консоли: ");
        String consoleWidthStr = scanner.nextLine();
        int consoleWidth = Integer.parseInt(consoleWidthStr);

        System.out.println("Введите текст:");
        String text = scanner.nextLine();

        if (choice == 1) {
            FindingCountRowsToOutConsole ConsoleManager = new FindingCountRowsToOutConsole();

            int operation = 0;
            while (true) {
                System.out.println("Выберите вариант (1 или 2):");
                String operationStr = scanner.nextLine();
                try {
                    operation = Integer.parseInt(operationStr);
                    if (operation == 1 || operation == 2) break;
                    else System.out.println("Неверный выбор. Введите число 1 или 2.");

                } catch (NumberFormatException e) {
                    System.out.println("Неверный выбор. Введите число 1 или 2.");
                }
            }

            switch (operation) {
                case 1:
                    int charsToFillLastLine = ConsoleManager.calculateCharsToFillLastLine(consoleWidth, text);

                    System.out.println("Текст построчно:");
                    while (!text.isEmpty()) {
                        String line = text.substring(0, Math.min(consoleWidth, text.length()));
                        System.out.println(line.trim());
                        text = text.substring(line.length());
                    }

                    System.out.println("Количество символов для заполнения последней строки: " + charsToFillLastLine);
                    break;
                case 2:
                    int countLines = ConsoleManager.calculateRowsToOutConsole(text, consoleWidth);
                    System.out.println("Текст построчно:");
                    while (!text.isEmpty()) {
                        String line = text.substring(0, Math.min(consoleWidth, text.length()));
                        System.out.println(line.trim());
                        text = text.substring(line.length());
                    }

                    System.out.println("Количество строк для вывода: " + countLines);
                    break;
            }

        } else if (choice == 2) {
            FindingCountSymbolOnLastRows ConsoleManager = new FindingCountSymbolOnLastRows();

            int operation = 0;
            while (true) {
                System.out.println("Выберите вариант (1 или 2):");
                String operationStr = scanner.nextLine();
                try {
                    operation = Integer.parseInt(operationStr);
                    if (operation == 1 || operation == 2) break;
                    else System.out.println("Неверный выбор. Введите число 1 или 2.");

                } catch (NumberFormatException e) {
                    System.out.println("Неверный выбор. Введите число 1 или 2.");
                }
            }
            switch (operation) {
                case 1:
                    int charsToFillLastLine = ConsoleManager.calculateCharsToFillLastLine(consoleWidth, text);

                    System.out.println("Текст построчно:");
                    while (!text.isEmpty()) {
                        String line = text.substring(0, Math.min(consoleWidth, text.length()));
                        System.out.println(line.trim());
                        text = text.substring(line.length());
                    }

                    System.out.println("Количество символов на последней строке: " + charsToFillLastLine);
                    break;
                case 2:
                    int countLines = ConsoleManager.calculateRowsToOutConsole(text, consoleWidth);
                    System.out.println("Текст построчно:");
                    while (!text.isEmpty()) {
                        String line = text.substring(0, Math.min(consoleWidth, text.length()));
                        System.out.println(line.trim());
                        text = text.substring(line.length());
                    }

                    System.out.println("Количество строк для вывода: " + countLines);
                    break;
            }
        }
    }
}