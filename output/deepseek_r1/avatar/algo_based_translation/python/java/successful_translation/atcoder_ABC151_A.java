
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class atcoder_ABC151_A {
    private static boolean debug = false;

    private static String parseInput(String linesAsString) {
        List<String> lines = new ArrayList<>();
        if (linesAsString == null) {
            debug = false;
            Scanner scanner = new Scanner(System.in);
            lines.add(scanner.nextLine());
        } else {
            debug = true;
            List<String> temp = Arrays.asList(linesAsString.split("\n"));
            if (temp.size() >= 2) {
                lines = temp.subList(1, temp.size() - 1);
            }
        }
        
        if (lines.isEmpty()) {
            return "";
        }
        
        String[] firstLineParts = lines.get(0).split(" ");
        return firstLineParts.length > 0 ? firstLineParts[0] : "";
    }

    private static String solve(String c) {
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        int index = alphabet.indexOf(c);
        return Character.toString(alphabet.charAt(index + 1));
    }

    public static void main(String[] args) {
        String inputChar = parseInput(null);
        String result = solve(inputChar);
        System.out.println(result);
    }
}

