
import java.util.Scanner;

public class codeforces_632_B {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.nextLine(); // Read and discard the first line
        String[] values = scanner.nextLine().split(" ");
        String types = scanner.nextLine();
        
        int n = values.length;
        int[][] pieces = new int[n][2];
        
        for (int i = 0; i < n; i++) {
            pieces[i][0] = Integer.parseInt(values[i]);
            pieces[i][1] = types.charAt(i);
        }
        
        System.out.println(Bob_sMaxStrength(pieces));
    }

    public static int Bob_sMaxStrength(int[][] pieces) {
        int pScore = 0;
        int sScore = 0;
        int pMaxScore = 0;
        int sMaxScore = 0;
        
        for (int[] piece : pieces) {
            if (piece[1] == 'B') {
                pScore += piece[0];
                sScore += piece[0];
            }
        }
        
        pMaxScore = pScore;
        sMaxScore = sScore;
        
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

