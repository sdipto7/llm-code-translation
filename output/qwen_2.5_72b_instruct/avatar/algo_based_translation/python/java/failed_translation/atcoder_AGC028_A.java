
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class atcoder_AGC028_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();
        String S = scanner.next();
        String T = scanner.next();
        List<Character> list_S = new ArrayList<>();
        for (char c : S.toCharArray()) {
            list_S.add(c);
        }
        List<Character> list_T = new ArrayList<>();
        for (char c : T.toCharArray()) {
            list_T.add(c);
        }
        List<Integer> Number_i = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            Number_i.add(i);
        }
        List<Double> Number_iMN = new ArrayList<>();
        for (int i : Number_i) {
            Number_iMN.add((double) i * M / N);
        }
        List<Integer> Number_j = new ArrayList<>();
        for (int j = 0; j < M; j++) {
            Number_j.add(j);
        }
        Set<Double> set_Number_iMN = new HashSet<>(Number_iMN);
        Set<Integer> set_Number_j = new HashSet<>(Number_j);
        set_Number_iMN.retainAll(set_Number_j);
        List<Integer> Kaburi_j = new ArrayList<>(set_Number_iMN.stream().map(Double::intValue).toList());
        List<Integer> Kaburi_i = new ArrayList<>();
        for (int j : Kaburi_j) {
            Kaburi_i.add((int) (j * N / M));
        }
        int counter = 0;
        int Flag = 0;
        int Kaburi_Size = Kaburi_i.size();
        while (counter <= Kaburi_Size - 1) {
            if (list_S.get(Kaburi_i.get(counter)).equals(list_T.get(Kaburi_j.get(counter)))) {
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
            System.out.println(N * M / gcd(N, M));
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

