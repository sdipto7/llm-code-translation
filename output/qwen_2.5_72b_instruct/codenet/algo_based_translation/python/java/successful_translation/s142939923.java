
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class s142939923 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        scanner.close();

        List<Integer> x = new ArrayList<>();
        x.add(a + b);
        x.add(a - b);
        x.add(a * b);

        int max = Collections.max(x);
        System.out.println(max);
    }
}

