
import java.util.Scanner;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class atcoder_ABC123_C {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        List<Integer> A = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            A.add(scanner.nextInt());
        }
        int minVal = Collections.min(A);
        double result = Math.ceil((double) N / minVal);
        System.out.println((int) result + 4);
    }
}

