
import java.util.Scanner;
import java.util.Arrays;

public class atcoder_ABC042_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] ABC = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        long countFives = Arrays.stream(ABC).filter(x -> x == 5).count();
        if (countFives == 2) {
            int sum = Arrays.stream(ABC).sum();
            System.out.println(sum == 17 ? "YES" : "NO");
        } else {
            System.out.println("NO");
        }
    }
}

