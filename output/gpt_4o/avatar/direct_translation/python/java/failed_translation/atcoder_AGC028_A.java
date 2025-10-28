
import java.util.*;

public class atcoder_AGC028_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();
        String S = scanner.next();
        String T = scanner.next();
        List<Integer> Number_i = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            Number_i.add(i);
        }
        List<Double> Number_iMN = new ArrayList<>();
        for (int i : Number_i) {
            Number_iMN.add(i * (double) M / N);
        }
        List<Integer> Number_j = new ArrayList<>();
        for (int j = 0; j < M; j++) {
            Number_j.add(j);
        }
        Set<Double> Kaburi_j = new HashSet<>(Number_iMN);
        Kaburi_j.retainAll(Number_j);
        List<Integer> Kaburi_i = new ArrayList<>();
        for (double j : Kaburi_j) {
            Kaburi_i.add((int) (j * N / M));
        }
        int counter = 0;
        int Flag = 0;
        int Kaburi_Size = Kaburi_i.size();
        while (counter <= Kaburi_Size - 1) {
            if (S.charAt(Kaburi_i.get(counter)) == T.charAt((int)(Kaburi_j.toArray()[counter]))) {
                // pass
            } else {
                Flag = 1;
                break;
            }
            counter++;
        }
        if (Flag == 1) {
            System.out.println(-1);
        } else {
            System.out.println((int) ((long) N * M / gcd(N, M)));
        }
    }
    
    public static int gcd(int a, int b) {
        while (b > 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}

