
import java.util.*;

public class codeforces_632_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();
        String[] values = scanner.nextLine().split(" ");
        String types = scanner.nextLine();
        
        List<int[]> pieces = new ArrayList<>();
        for (int i = 0; i < values.length; i++) {
            int value = Integer.parseInt(values[i]);
            char type = types.charAt(i);
            pieces.add(new int[]{value, type});
        }
        
        System.out.println(Bob_sMaxStrength(pieces));
    }
    
    public static int Bob_sMaxStrength(List<int[]> pieces) {
        int sumB = 0;
        for (int[] piece : pieces) {
            if ((char)piece[1] == 'B') {
                sumB += piece[0];
            }
        }
        
        int pScore = sumB;
        int sScore = sumB;
        int pMaxScore = sumB;
        int sMaxScore = sumB;
        
        for (int[] piece : pieces) {
            if ((char)piece[1] == 'A') {
                pScore += piece[0];
                if (pScore > pMaxScore) {
                    pMaxScore = pScore;
                }
            } else {
                pScore -= piece[0];
            }
        }
        
        for (int i = pieces.size() - 1; i >= 0; i--) {
            int[] piece = pieces.get(i);
            if ((char)piece[1] == 'A') {
                sScore += piece[0];
                if (sScore > sMaxScore) {
                    sMaxScore = sScore;
                }
            } else {
                sScore -= piece[0];
            }
        }
        
        if (pMaxScore > sMaxScore) {
            return pMaxScore;
        }
        return sMaxScore;
    }
}

