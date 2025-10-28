
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class atcoder_ABC151_A {
    private static boolean debug = false;
    
    private static void log(String text) {
        if (debug) {
            System.out.println(text);
        }
    }
    
    private static String[] parseInput(String linesAsString) {
        String[] lines;
        if (linesAsString == null) {
            debug = false;
            Scanner scanner = new Scanner(System.in);
            lines = new String[]{scanner.nextLine()};
            scanner.close();
        } else {
            debug = true;
            String[] allLines = linesAsString.split("\n");
            lines = Arrays.copyOfRange(allLines, 1, allLines.length - 1);
        }
        String c = lines[0].split(" ")[0];
        return new String[]{c};
    }
    
    private static String solve(String c) {
        String a = "abcdefghijklmnopqrstuvwxyz";
        int i = a.indexOf(c);
        return String.valueOf(a.charAt(i + 1));
    }
    
    public static void main(String[] args) {
        String input = null;
        if (args.length > 0) {
            StringBuilder sb = new StringBuilder();
            for (String arg : args) {
                sb.append(arg).append("\n");
            }
            input = sb.toString();
        }
        
        String[] parsed = parseInput(input);
        String result = solve(parsed[0]);
        
        if (result instanceof String) {
            System.out.print(result);
        }
    }
}

