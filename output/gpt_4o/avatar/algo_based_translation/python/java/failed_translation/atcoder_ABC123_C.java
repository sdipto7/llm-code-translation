
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.lang.Math;

public class atcoder_ABC123_C {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int N = scanner.nextInt();
        List<Integer> A = new ArrayList<>();
        
        for (int i = 0; i < 5; i++) {
            A.add(scanner.nextInt());
        }
        
        int minA = Collections.min(A);
        int result = (int) Math.ceil((double) N / minA) + 4;
        
        System.out.println(result);
        
        scanner.close();
    }
}

