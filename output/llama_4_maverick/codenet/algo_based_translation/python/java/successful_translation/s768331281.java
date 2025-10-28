
import java.util.Arrays;
import java.util.Scanner;

public class s768331281 {
    public static void main(String[] args) {
        Object[] input = readInput(new Scanner(System.in));
        int N = (int) input[0];
        int L = (int) input[1];
        String[] S = (String[]) input[2];
        System.out.println(sortStrings(S));
    }

    public static Object[] readInput(Scanner scanner) {
        String[] firstLine = scanner.nextLine().split(" ");
        int N = Integer.parseInt(firstLine[0]);
        int L = Integer.parseInt(firstLine[1]);
        String[] S = new String[N];
        for (int i = 0; i < N; i++) {
            S[i] = scanner.nextLine().trim();
        }
        return new Object[]{N, L, S};
    }

    public static String sortStrings(String[] S) {
        Arrays.sort(S);
        StringBuilder sb = new StringBuilder();
        for (String s : S) {
            sb.append(s);
        }
        return sb.toString();
    }
}

