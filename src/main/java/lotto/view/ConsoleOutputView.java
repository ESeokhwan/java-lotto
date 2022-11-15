package lotto.view;

public class ConsoleOutputView {
    public void print(String text) {
        System.out.print(text);
    }

    public void println(String text) {
        System.out.println(text);
    }

    public void printlnError(String errorText) {
        System.out.println("[ERROR] " + errorText);
    }
}
