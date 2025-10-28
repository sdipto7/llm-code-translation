
import java.util.Scanner;

public class s025428739 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        scanner.close();

        java.util.List<Integer> lst = new java.util.ArrayList<>();
        lst.add(A + B);
        lst.add(A - B);
        lst.add(A * B);

        System.out.println(java.util.Collections.max(lst));
    }
}

