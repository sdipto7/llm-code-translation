
import java.util.Scanner;

public class atcoder_ABC151_A {
    static boolean debug = false;

    static void log(String text) {
        if (debug) {
            System.out.println(text);
        }
    }

    static String[] parseInput(String linesAsString) {
        if (linesAsString == null) {
            debug = false;
            Scanner scanner = new Scanner(System.in);
            String line = scanner.nextLine();
            scanner.close();
            return new String[] { line.split(" ")[0] };
        } else {
            debug = true;
            String[] lines = linesAsString.split("\n");
            return new String[] { lines[0].split(" ")[0] };
        }
    }

    static char solve(String c) {
        String a = "abcdefghijklmnopqrstuvwxyz";
        int i = a.indexOf(c);
        return a.charAt(i + 1);
    }

    public static void main(String[] args) {
        String[] input = parseInput(null);
        char result = solve(input[0]);
        System.out.println(result);
    }
}

