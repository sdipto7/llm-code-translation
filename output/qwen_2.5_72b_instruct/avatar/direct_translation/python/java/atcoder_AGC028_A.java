import java.util.*;
import java.util.stream.IntStream;

public class atcoder_AGC028_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();
        String S = scanner.next();
        String T = scanner.next();
        char[] list_S = S.toCharArray();
        char[] list_T = T.toCharArray();
        int[] Number_i = IntStream.range(0, N).toArray();
        List<Double> Number_iMN = new ArrayList<>();
        for (int i : Number_i) {
            Number_iMN.add((double) i * M / N);
        }
        int[] Number_j = IntStream.range(0, M).toArray();
        Set<Double> set_iMN = new HashSet<>(Number_iMN);
        Set<Integer> set_j = Arrays.stream(Number_j).asDoubleStream().boxed().collect(Collectors.toSet());
        List<Integer> Kaburi_j = set_iMN.stream().filter(set_j::contains).map(Double::intValue).collect(Collectors.toList());
        List<Integer> Kaburi_i = new ArrayList<>();
        for (int j : Kaburi_j) {
            Kaburi_i.add(j * N / M);
        }
        int counter = 0;
        int Flag = 0;
        int Kaburi_Size = Kaburi_i.size();
        while (counter <= Kaburi_Size - 1) {
            if (list_S[Kaburi_i.get(counter)] == list_T[Kaburi_j.get(counter)]) {
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
