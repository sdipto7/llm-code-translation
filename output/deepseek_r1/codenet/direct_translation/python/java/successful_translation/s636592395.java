
import java.util.*;

public class s636592395 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        scanner.nextLine();
        String[] parts = scanner.nextLine().split(" ");
        int[] A = new int[parts.length];
        for (int i = 0; i < parts.length; i++) {
            A[i] = Integer.parseInt(parts[i]);
        }
        Arrays.sort(A);
        System.out.println(A[A.length - 1] - A[0]);
    }
}

