
import java.util.Scanner;

public class atcoder_ABC151_A {
    private static boolean debug = false;

    public static void log(String text) {
        if (debug) {
            System.out.println(text);
        }
    }

    public static String[] parseInput(String linesAsString) {
        if (linesAsString == null) {
            debug = false;
            Scanner scanner = new Scanner(System.in);
            String[] lines = new String[1];
            lines[0] = scanner.nextLine();
            scanner.close();
            String[] result = new String[1];
            result[0] = lines[0].split(" ")[0];
            return result;
        } else {
            debug = true;
            String[] lines = linesAsString.split("\n");
            String[] result = new String[1];
            result[0] = lines[1].split(" ")[0];
            return result;
        }
    }

    public static String solve(String c) {
        String a = "abcdefghijklmnopqrstuvwxyz";
        int i = a.indexOf(c);
        return String.valueOf(a.charAt(i + 1));
    }

    public static void main(String[] args) {
        String[] input = parseInput(null);
        String result = solve(input[0]);
        System.out.println(result);
    }
}

