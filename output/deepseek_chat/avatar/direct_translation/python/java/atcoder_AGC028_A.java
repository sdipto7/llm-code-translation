
import java.util.*;

public class atcoder_AGC028_A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        sc.nextLine();
        String S = sc.nextLine();
        String T = sc.nextLine();
        char[] list_S = S.toCharArray();
        char[] list_T = T.toCharArray();
        List<Integer> number_i = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            number_i.add(i);
        }
        List<Double> number_iMN = new ArrayList<>();
        for (int i : number_i) {
            number_iMN.add((double) i * M / N);
        }
        List<Integer> number_j = new ArrayList<>();
        for (int j = 0; j < M; j++) {
            number_j.add(j);
        }
        Set<Double> set1 = new HashSet<>(number_iMN);
        Set<Integer> set2 = new HashSet<>(number_j);
        set1.retainAll(set2);
        List<Double> kaburi_j = new ArrayList<>(set1);
        List<Integer> kaburi_i = new ArrayList<>();
        for (double j : kaburi_j) {
            kaburi_i.add((int) (j * N / M));
        }
        int counter = 0;
        int flag = 0;
        int kaburi_size = kaburi_i.size();
        while (counter <= kaburi_size - 1) {
            if (list_S[kaburi_i.get(counter)] == list_T[kaburi_j.get(counter).intValue()]) {
            } else {
                flag = 1;
                break;
            }
            counter++;
        }
        if (flag == 1) {
            System.out.println(-1);
        } else {
            System.out.println(N * M / gcd(N, M));
        }
    }

    private static int gcd(int a, int b) {
        while (b > 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}

