
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class codeforces_632_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.nextLine(); // Read and discard a line
        List<int[]> pieces = new ArrayList<>();
        
        String[] numbers = scanner.nextLine().split(" ");
        String chars = scanner.nextLine();
        
        for (int i = 0; i < numbers.length; i++) {
            int number = Integer.parseInt(numbers[i]);
            char character = chars.charAt(i);
            pieces.add(new int[]{number, character});
        }
        
        System.out.println(bobMaxStrength(pieces));
    }

    public static int bobMaxStrength(List<int[]> pieces) {
        int pScore = 0, sScore = 0, pMaxScore = 0, sMaxScore = 0;
        for (int[] piece : pieces) {
            if (piece[1] == 'B') {
                pScore += piece[0];
            }
        }
        sScore = pScore;
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
        
        for (int i = pieces.size() - 1; i >= 0; i--) {
            if (pieces.get(i)[1] == 'A') {
                sScore += pieces.get(i)[0];
                if (sScore > sMaxScore) {
                    sMaxScore = sScore;
                }
            } else {
                sScore -= pieces.get(i)[0];
            }
        }
        
        return Math.max(pMaxScore, sMaxScore);
    }
}

