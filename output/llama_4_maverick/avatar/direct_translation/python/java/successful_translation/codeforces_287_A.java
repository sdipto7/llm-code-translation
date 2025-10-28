
import java.util.Scanner;

public class codeforces_287_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[][] t = new String[4][];
        for (int i = 0; i < 4; i++) {
            t[i] = scanner.next().split("");
        }
        int black;
        int white;
        int correct = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                black = 0;
                white = 0;
                if (t[i][j].equals("#")) {
                    black++;
                } else {
                    white++;
                }
                if (t[i][j + 1].equals("#")) {
                    black++;
                } else {
                    white++;
                }
                if (t[i + 1][j].equals("#")) {
                    black++;
                } else {
                    white++;
                }
                if (t[i + 1][j + 1].equals("#")) {
                    black++;
                } else {
                    white++;
                }
                if (black == 0 || black == 3 || black == 4 || white == 0 || white == 3 || white == 4) {
                    correct = 1;
                    break;
                }
            }
            if (correct == 1) {
                break;
            }
        }
        if (correct == 1) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}

