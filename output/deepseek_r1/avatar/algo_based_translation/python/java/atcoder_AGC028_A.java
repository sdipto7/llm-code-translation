
import java.util.*;

public class atcoder_AGC028_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();
        scanner.nextLine();
        String S = scanner.nextLine().trim();
        String T = scanner.nextLine().trim();
        scanner.close();

        char[] listS = S.toCharArray();
        char[] listT = T.toCharArray();

        Set<Integer> kaburiJSet = new HashSet<>();
        for (int i = 0; i < N; i++) {
            if ((i * M) % N == 0) {
                int j = (i * M) / N;
                kaburiJSet.add(j);
            }
        }

        List<Integer> kaburiJ = new ArrayList<>(kaburiJSet);
        Collections.sort(kaburiJ);

        List<Integer> kaburiI = new ArrayList<>();
        for (int j : kaburiJ) {
            kaburiI.add((j * N) / M);
        }

        int flag = 0;
        int kaburiSize = kaburiI.size();
        int counter = 0;

        while (counter < kaburiSize) {
            int currentI = kaburiI.get(counter);
            int currentJ = kaburiJ.get(counter);
            if (listS[currentI] != listT[currentJ]) {
                flag = 1;
                break;
            }
            counter++;
        }

        if (flag == 1) {
            System.out.println(-1);
        } else {
            int gcdVal = gcd(N, M);
            System.out.println((N * M) / gcdVal);
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

