
import java.util.Scanner;
public class s522872163 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] input = sc.nextLine().split(" ");
        int X = Integer.parseInt(input[0]);
        int A = Integer.parseInt(input[1]);
        if (X < A) {
            System.out.println(0);
        } else {
            System.out.println(10);
        }
    }
}

