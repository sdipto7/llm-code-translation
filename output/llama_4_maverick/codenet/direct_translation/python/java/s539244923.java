
import java.util.Scanner;
public class s539244923 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] input = sc.nextLine().split(" ");
        int n = Integer.parseInt(input[0]);
        int k = Integer.parseInt(input[1]);
        System.out.println(k % n == 0 ? n + k : k - n);
    }
}

