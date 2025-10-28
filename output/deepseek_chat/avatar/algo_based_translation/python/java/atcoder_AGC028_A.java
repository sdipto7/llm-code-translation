
import java.util.*;

public class atcoder_AGC028_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();
        scanner.nextLine();
        String S = scanner.nextLine();
        String T = scanner.nextLine();
        
        char[] list_S = S.toCharArray();
        char[] list_T = T.toCharArray();
        
        List<Integer> Number_i = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            Number_i.add(i);
        }
        
        List<Double> Number_iMN = new ArrayList<>();
        for (int i : Number_i) {
            Number_iMN.add(i * (double)M / N);
        }
        
        List<Integer> Number_j = new ArrayList<>();
        for (int j = 0; j < M; j++) {
            Number_j.add(j);
        }
        
        Set<Double> Number_iMN_set = new HashSet<>(Number_iMN);
        Set<Integer> Number_j_set = new HashSet<>(Number_j);
        Set<Double> intersection = new HashSet<>(Number_iMN_set);
        intersection.retainAll(Number_j_set);
        List<Double> Kaburi_j = new ArrayList<>(intersection);
        Collections.sort(Kaburi_j);
        
        List<Integer> Kaburi_i = new ArrayList<>();
        for (double j : Kaburi_j) {
            Kaburi_i.add((int)(j * N / M));
        }
        
        int counter = 0;
        int Flag = 0;
        int Kaburi_Size = Kaburi_i.size();
        
        while (counter <= Kaburi_Size - 1) {
            int index_i = Kaburi_i.get(counter);
            int index_j = Kaburi_j.get(counter).intValue();
            if (list_S[index_i] != list_T[index_j]) {
                Flag = 1;
                break;
            }
            counter++;
        }
        
        if (Flag == 1) {
            System.out.println(-1);
        } else {
            int result = N * M / gcd(N, M);
            System.out.println(result);
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

