
import java.util.Scanner;

public class codeforces_30_A {
    public static Object task4(int A, int B, int n) {
        for (int X = -1000; X <= 1000; X++) {
            if (A * Math.pow(X, n) == B) {
                return X;
            }
        }
        return "No solution";
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] inputs = scanner.nextLine().split(" ");
        int A = Integer.parseInt(inputs[0]);
        int B = Integer.parseInt(inputs[1]);
        int n = Integer.parseInt(inputs[2]);
        System.out.println(task4(A, B, n));
        scanner.close();
    }
}

