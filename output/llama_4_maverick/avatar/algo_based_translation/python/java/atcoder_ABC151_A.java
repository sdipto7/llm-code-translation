
public class atcoder_ABC151_A {
    private static boolean debug = false;

    public static void log(String text) {
        if (debug) {
            System.out.println(text);
        }
    }

    public static String parseInput(String linesAsString) {
        String[] lines;
        if (linesAsString == null) {
            debug = false;
            lines = new String[1];
            lines[0] = new java.util.Scanner(System.in).nextLine();
        } else {
            debug = true;
            lines = linesAsString.split("\n");
            String[] temp = new String[lines.length - 2];
            System.arraycopy(lines, 1, temp, 0, lines.length - 2);
            lines = temp;
        }
        return lines[0].split(" ")[0];
    }

    public static char solve(char c) {
        String a = "abcdefghijklmnopqrstuvwxyz";
        int i = a.indexOf(c);
        return a.charAt((i + 1) % 26);
    }

    public static void main(String[] args) {
        char result = solve(parseInput(null).charAt(0));
        System.out.println(result);
    }
}

