
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class codeforces_282_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstline = scanner.nextInt();
        int total = 0;
        List<String> memory = new ArrayList<>();
        for (int x = 0; x < firstline; x++) {
            int A = scanner.nextInt();
            int G = scanner.nextInt();
            if (total + A <= 500) {
                total += A;
                memory.add("A");
            } else {
                total -= G;
                memory.add("G");
            }
        }
        System.out.println(String.join("", memory));
        scanner.close();
    }
}

