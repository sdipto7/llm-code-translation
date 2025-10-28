
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class codeforces_287_A {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<List<Character>> t = new ArrayList<>();

        for (int i = 0; i < 4; i++) {
            String inputLine = scanner.nextLine();
            List<Character> l = new ArrayList<>();
            for (char c : inputLine.toCharArray()) {
                l.add(c);
            }
            t.add(l);
        }

        String result = checkPattern(t);
        System.out.println(result);

        scanner.close();
    }

    public static String checkPattern(List<List<Character>> t) {
        int black = 0;
        int white = 0;
        int correct = 0;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (t.get(i).get(j) == '#') {
                    black++;
                } else {
                    white++;
                }
                if (t.get(i).get(j + 1) == '#') {
                    black++;
                } else {
                    white++;
                }
                if (t.get(i + 1).get(j) == '#') {
                    black++;
                } else {
                    white++;
                }
                if (t.get(i + 1).get(j + 1) == '#') {
                    black++;
                } else {
                    white++;
                }

                if (black == 0 || black == 3 || white == 0 || white == 3 || white == 4 || black == 4) {
                    correct = 1;
                    break;
                }
                black = 0;
                white = 0;
            }
            if (correct == 1) {
                break;
            }
        }

        if (correct == 1) {
            return "YES";
        } else {
            return "NO";
        }
    }
}

