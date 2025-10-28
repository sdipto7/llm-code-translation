
import java.util.Scanner;
import java.util.Collections;
import java.util.ArrayList;

public class s142939923 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        ArrayList<Integer> x = new ArrayList<>();
        x.add(a + b);
        x.add(a - b);
        x.add(a * b);
        System.out.println(Collections.max(x));
    }
}

