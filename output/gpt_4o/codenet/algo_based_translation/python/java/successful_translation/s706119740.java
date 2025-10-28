
import java.util.Arrays;
import java.util.Scanner;

public class s706119740 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] candy = Arrays.stream(scanner.nextLine().split(" "))
                            .mapToInt(Integer::parseInt)
                            .sorted()
                            .toArray();
        
        if (candy[0] + candy[1] == candy[2]) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        
        scanner.close();
    }
}

