
import java.util.Scanner;
public class s462546732 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] input = sc.nextLine().split(" ");
        int a = Integer.parseInt(input[0]);
        int b = Integer.parseInt(input[1]);
        if (a <= b) {
            System.out.println(a);
        } else {
            System.out.println(a - 1);
        }
    }
}

