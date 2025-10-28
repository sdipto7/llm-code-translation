
import java.util.Scanner;

public class atcoder_ABC151_A {

    static boolean debug = false;

    public static void log(String text) {
        if (debug) {
            System.out.println(text);
        }
    }

    public static String[] parseInput(String linesAsString) {
        String[] lines;
        if (linesAsString == null) {
            debug = false;
            Scanner scanner = new Scanner(System.in);
            lines = new String[]{scanner.nextLine()};
            scanner.close();
        } else {
            debug = true;
            lines = linesAsString.split("\n");
        }
        String c = lines[0].split(" ")[0];
        return new String[]{c};
    }

    public static String solve(String c) {
        String a = "abcdefghijklmnopqrstuvwxyz";
        int i = a.indexOf(c);
        return Character.toString(a.charAt(i + 1));
    }

    public static void main(String[] args) {
        String[] parsedInput = parseInput(null);
        String result = solve(parsedInput[0]);
        System.out.println(result);
    }
}

