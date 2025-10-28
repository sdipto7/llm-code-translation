
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class codeforces_632_B {
    static class Piece {
        int value;
        char type;
        
        Piece(int value, char type) {
            this.value = value;
            this.type = type;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();
        String[] values = scanner.nextLine().split(" ");
        String[] types = scanner.nextLine().split(" ");
        List<Piece> pieces = new ArrayList<>();
        
        for (int i = 0; i < values.length; i++) {
            int value = Integer.parseInt(values[i]);
            char type = types[i].charAt(0);
            pieces.add(new Piece(value, type));
        }
        
        System.out.println(bobSMaxStrength(pieces));
    }

    public static int bobSMaxStrength(List<Piece> pieces) {
        int initialSum = 0;
        for (Piece piece : pieces) {
            if (piece.type == 'B') {
                initialSum += piece.value;
            }
        }
        
        int pScore = initialSum;
        int sScore = initialSum;
        int pMaxScore = initialSum;
        int sMaxScore = initialSum;

        for (Piece piece : pieces) {
            if (piece.type == 'A') {
                pScore += piece.value;
                if (pScore > pMaxScore) {
                    pMaxScore = pScore;
                }
            } else {
                pScore -= piece.value;
            }
        }

        for (int i = pieces.size() - 1; i >= 0; i--) {
            Piece piece = pieces.get(i);
            if (piece.type == 'A') {
                sScore += piece.value;
                if (sScore > sMaxScore) {
                    sMaxScore = sScore;
                }
            } else {
                sScore -= piece.value;
            }
        }

        return Math.max(pMaxScore, sMaxScore);
    }
}

