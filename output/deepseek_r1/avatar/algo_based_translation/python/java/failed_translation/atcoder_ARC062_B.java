
import java.util.Scanner;

public class atcoder_ARC062_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        System.out.println(processGame(input));
        scanner.close();
    }

    private static int processGame(String s) {
        char[] chars = s.toCharArray();
        int numG = 0, numP = 0, score = 0;
        
        for (char x : chars) {
            if (x == 'g') {
                if (numG - numP > 0) {
                    score++;
                    numP++;
                } else {
                    numG++;
                }
            } else if (x == 'p') {
                if (numG - numP > 0) {
                    numP++;
                } else {
                    score--;
                    numG++;
                }
            }
        }
        return score;
    }
}

