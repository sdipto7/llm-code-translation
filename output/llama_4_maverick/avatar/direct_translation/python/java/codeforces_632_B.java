
import java.util.Scanner;

public class codeforces_632_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();
        String[] values = scanner.nextLine().split(" ");
        String[] piecesStr = scanner.nextLine().split(" ");
        int[][] pieces = new int[values.length][2];
        for (int i = 0; i < values.length; i++) {
            pieces[i][0] = Integer.parseInt(values[i]);
            pieces[i][1] = piecesStr[i].charAt(0);
        }
        System.out.println(Bob_sMaxStrength(pieces));
    }

    public static int Bob_sMaxStrength(int[][] pieces) {
        int pScore = 0, sScore = 0, pMaxScore = 0, sMaxScore = 0;
        for (int[] piece : pieces) {
            if (piece[1] == 'B') {
                pMaxScore += piece[0];
                sMaxScore += piece[0];
            }
        }
        pScore = sMaxScore;
        sScore = pMaxScore;
        for (int[] piece : pieces) {
            if (piece[1] == 'A') {
                pScore += piece[0];
                if (pScore > pMaxScore) {
                    pMaxScore = pScore;
                }
            } else {
                pScore -= piece[0];
            }
        }
        for (int i = pieces.length - 1; i >= 0; i--) {
            if (pieces[i][1] == 'A') {
                sScore += pieces[i][0];
                if (sScore > sMaxScore) {
                    sMaxScore = sScore;
                }
            } else {
                sScore -= pieces[i][0];
            }
        }
        return Math.max(pMaxScore, sMaxScore);
    }
}

