
import java.util.Scanner;
import java.util.ArrayList;

public class s025428739 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        ArrayList<Integer> lst = new ArrayList<>();
        lst.add(A + B);
        lst.add(A - B);
        lst.add(A * B);
        int maxVal = Math.max(lst.get(0), Math.max(lst.get(1), lst.get(2)));
        System.out.println(maxVal);
    }
}

