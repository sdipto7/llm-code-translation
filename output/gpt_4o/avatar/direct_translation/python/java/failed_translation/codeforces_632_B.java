
import java.util.Scanner;

public class codeforces_632_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();
        String[] pieceValues = scanner.nextLine().split(" ");
        String pieceTypes = scanner.nextLine();
        Piece[] pieces = new Piece[pieceValues.length];
        for (int i = 0; i < pieceValues.length; i++) {
            pieces[i] = new Piece(Integer.parseInt(pieceValues[i]), pieceTypes.charAt(i));
        }
        System.out.println(BobsMaxStrength(pieces));
    }

    static class Piece {
        int value;
        char type;

        Piece(int value, char type) {
            this.value = value;
            this.type = type;
        }
    }

    public static int BobsMaxStrength(Piece[] pieces) {
        int pScore = 0, sScore = 0, pMaxScore = 0, sMaxScore = 0;
        for (Piece piece : pieces) {
            if (piece.type == 'B') {
                pScore += piece.value;
            }
        }
        pMaxScore = sMaxScore = pScore;
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
        for (int i = pieces.length - 1; i >= 0; i--) {
            if (pieces[i].type == 'A') {
                sScore += pieces[i].value;
                if (sScore > sMaxScore) {
                    sMaxScore = sScore;
                }
            } else {
                sScore -= pieces[i].value;
            }
        }
        return Math.max(pMaxScore, sMaxScore);
    }
}

