
import java.util.Scanner;

public class codeforces_632_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();
        String[] valuesStr = scanner.nextLine().split(" ");
        String typesLine = scanner.nextLine();
        scanner.close();

        int[] values = new int[valuesStr.length];
        for (int i = 0; i < valuesStr.length; i++) {
            values[i] = Integer.parseInt(valuesStr[i]);
        }
        char[] types = typesLine.toCharArray();

        int initialSum = 0;
        for (int i = 0; i < types.length; i++) {
            if (types[i] == 'B') {
                initialSum += values[i];
            }
        }

        int pScore = initialSum;
        int pMaxScore = initialSum;
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

        int sScore = initialSum;
        int sMaxScore = initialSum;
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

        System.out.println(Math.max(pMaxScore, sMaxScore));
    }
}

