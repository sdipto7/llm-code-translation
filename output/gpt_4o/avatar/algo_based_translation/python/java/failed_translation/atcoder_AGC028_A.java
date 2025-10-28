
import java.util.*;
import java.util.stream.Collectors;

public class atcoder_AGC028_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Step 1-3: Input
        int N = scanner.nextInt();
        int M = scanner.nextInt();
        String S = scanner.next();
        String T = scanner.next();

        // Step 4-5: Convert strings to lists of characters
        List<Character> list_S = S.chars().mapToObj(e -> (char) e).collect(Collectors.toList());
        List<Character> list_T = T.chars().mapToObj(e -> (char) e).collect(Collectors.toList());

        // Step 6: Initialize Number_i
        List<Integer> Number_i = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            Number_i.add(i);
        }

        // Step 7-8: Calculate Number_iMN
        List<Double> Number_iMN = new ArrayList<>();
        for (int i : Number_i) {
            Number_iMN.add(i * (double) M / N);
        }

        // Step 9: Initialize Number_j
        List<Integer> Number_j = new ArrayList<>();
        for (int j = 0; j < M; j++) {
            Number_j.add(j);
        }

        // Step 10: Calculate Kaburi_j
        List<Double> Kaburi_j = Number_iMN.stream().distinct().filter(Number_j::contains).collect(Collectors.toList());

        // Step 11-12: Calculate Kaburi_i
        List<Integer> Kaburi_i = new ArrayList<>();
        for (double j : Kaburi_j) {
            Kaburi_i.add((int) (j * N / M));
        }

        // Step 13-16: Check if corresponding elements are equal
        int counter = 0;
        int Flag = 0;
        int Kaburi_Size = Kaburi_i.size();
        while (counter <= Kaburi_Size - 1) {
            if (!list_S.get(Kaburi_i.get(counter)).equals(list_T.get(Kaburi_j.get(counter).intValue()))) {
                Flag = 1;
                break;
            }
            counter++;
        }

        // Step 17: gcd function
        if (Flag == 1) {
            System.out.println(-1);
        } else {
            System.out.println((int) (N * M / gcd(N, M)));
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

