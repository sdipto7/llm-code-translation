
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class s952264435 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] input = readInput(scanner);
        int N = input[0];
        List<Integer> A = readListInput(scanner, input[1]);
        int result = calculateResult(N, A);
        System.out.println(result);
    }

    public static int[] readInput(Scanner scanner) {
        String[] line = scanner.nextLine().split(" ");
        int N = Integer.parseInt(line[0]);
        int M = Integer.parseInt(line[1]);
        return new int[]{N, M};
    }

    public static List<Integer> readListInput(Scanner scanner, int M) {
        List<Integer> A = new ArrayList<>();
        String[] line = scanner.nextLine().split(" ");
        for (int i = 0; i < M; i++) {
            A.add(Integer.parseInt(line[i]));
        }
        return A;
    }

    public static int calculateResult(int N, List<Integer> A) {
        int A_sum = 0;
        for (int num : A) {
            A_sum += num;
        }
        return N - A_sum >= 0 ? N - A_sum : -1;
    }
}

