
import java.util.Scanner;
import java.util.List;
import java.util.Arrays;

public class atcoder_ABC170_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        List<Integer> a = Arrays.stream(input.split(" "))
                                .map(Integer::parseInt)
                                .toList();
        
        for (int e = 0; e < a.size(); e++) {
            int i = a.get(e);
            if (i == 0) {
                System.out.println(e + 1);
                break;
            }
        }
        
        scanner.close();
    }
}

