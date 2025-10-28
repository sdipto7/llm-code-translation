import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class s142939923 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        ArrayList<Integer> x = new ArrayList<>();
        x.add(a + b);
        x.add(a - b);
        x.add(a * b);
        int maxValue = Collections.max(x);
        System.out.println(maxValue);
    }
}
