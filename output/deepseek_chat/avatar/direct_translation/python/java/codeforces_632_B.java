import java.util.*;

public class codeforces_632_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();
        String[] values = scanner.nextLine().split(" ");
        String types = scanner.nextLine();
        List<Pair<Integer, Character>> pieces = new ArrayList<>();
        for (int i = 0; i < values.length; i++) {
            pieces.add(new Pair<>(Integer.parseInt(values[i]), types.charAt(i)));
        }
        System.out.println(bobsMaxStrength(pieces));
    }

    public static int bobsMaxStrength(List<Pair<Integer, Character>> pieces) {
        int pScore = 0, sScore = 0, pMaxScore = 0, sMaxScore = 0;
        for (Pair<Integer, Character> piece : pieces) {
            if (piece.getValue() == 'B') {
                pMaxScore += piece.getKey();
            }
        }
        pScore = sScore = pMaxScore;
        for (Pair<Integer, Character> piece : pieces) {
            if (piece.getValue() == 'A') {
                pScore += piece.getKey();
                if (pScore > pMaxScore) {
                    pMaxScore = pScore;
                }
            } else {
                pScore -= piece.getKey();
            }
        }
        for (int i = pieces.size() - 1; i >= 0; i--) {
            if (pieces.get(i).getValue() == 'A') {
                sScore += pieces.get(i).getKey();
                if (sScore > sMaxScore) {
                    sMaxScore = sScore;
                }
            } else {
                sScore -= pieces.get(i).getKey();
            }
        }
        return Math.max(pMaxScore, sMaxScore);
    }

    static class Pair<K, V> {
        private K key;
        private V value;

        public Pair(K key, V value) {
            this.key = key;
            this.value = value;
        }

        public K getKey() {
            return key;
        }

        public V getValue() {
            return value;
        }
    }
}
