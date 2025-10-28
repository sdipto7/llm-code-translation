import java.util.Scanner;

public class atcoder_ABC151_A {
    static boolean debug = false;

    static void log(String text) {
        if (debug) {
            System.out.println(text);
        }
    }

    static String[] parseInput(String linesAsString) {
        String[] lines;
        if (linesAsString == null) {
            debug = false;
            Scanner scanner = new Scanner(System.in);
            lines = new String[]{scanner.nextLine()};
        } else {
            debug = true;
            lines = linesAsString.split("\n");
            lines = java.util.Arrays.copyOfRange(lines, 1, lines.length);
        }
        String c = lines[0].split(" ")[0];
        return new String[]{c};
    }

    static String solve(String c) {
        String a = "abcdefghijklmnopqrstuvwxyz";
        int i = a.indexOf(c);
        return a.substring(i + 1, i + 2);
    }

    public static void main(String[] args) {
        String[] input = parseInput(null);
        String result = solve(input[0]);
        if (result instanceof String) {
            System.out.printf("%s", result);
        }
    }
}
