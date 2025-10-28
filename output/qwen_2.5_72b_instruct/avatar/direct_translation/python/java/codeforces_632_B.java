
import java.util.Scanner;

public class codeforces_632_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();
        String[] input = scanner.nextLine().split(" ");
        char[] types = scanner.nextLine().toCharArray();
        int[] values = new int[input.length];
        for (int i = 0; i < input.length; i++) {
            values[i] = Integer.parseInt(input[i]);
        }
        System.out.println(Bob_sMaxStrength(values, types));
    }

    public static int Bob_sMaxStrength(int[] values, char[] types) {
        int pScore = 0;
        int sScore = 0;
        int pMaxScore = 0;
        int sMaxScore = 0;
        for (int i = 0; i < types.length; i++) {
            if (types[i] == 'B') {
                pScore += values[i];
                sScore += values[i];
            }
        }
        pMaxScore = pScore;
        sMaxScore = sScore;
        for (int i = 0; i < types.length; i++) {
            if (types[i] == 'A') {
                pScore += values[i];
                if (pScore > pMaxScore) {
                    pMaxScore = pScore;
                }
            } else {
                pScore -= values[i];
            }
        }
        for (int i = types.length - 1; i >= 0; i--) {
            if (types[i] == 'A') {
                sScore += values[i];
                if (sScore > sMaxScore) {
                    sMaxScore = sScore;
                }
            } else {
                sScore -= values[i];
            }
        }
        return Math.max(pMaxScore, sMaxScore);
    }
}

