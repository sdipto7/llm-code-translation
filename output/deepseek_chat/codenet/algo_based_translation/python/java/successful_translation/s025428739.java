import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class s025428739 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        ArrayList<Integer> lst = new ArrayList<>();
        lst.add(A + B);
        lst.add(A - B);
        lst.add(A * B);
        int maxValue = Collections.max(lst);
        System.out.println(maxValue);
    }
}
