
import java.util.Scanner;
import java.util.Arrays;

public class atcoder_ABC042_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] inputTokens = scanner.nextLine().split(" ");
        int[] ABC = Arrays.stream(inputTokens).mapToInt(Integer::parseInt).toArray();
        
        long countFive = Arrays.stream(ABC).filter(x -> x == 5).count();
        
        if (countFive == 2) {
            int totalSum = Arrays.stream(ABC).sum();
            if (totalSum == 17) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        } else {
            System.out.println("NO");
        }
    }
}

