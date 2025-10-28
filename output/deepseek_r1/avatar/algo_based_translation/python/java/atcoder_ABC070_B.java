
import java.util.Arrays;
import java.util.Scanner;

public class atcoder_ABC070_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        int[] a = new int[4];
        
        for (int i = 0; i < 4; i++) {
            a[i] = Integer.parseInt(input[i]);
        }
        
        if (a[1] <= a[2] || a[3] <= a[0]) {
            System.out.println(0);
        } else {
            Arrays.sort(a);
            System.out.println(a[2] - a[1]);
        }
    }
}

