
import java.util.Scanner;
import java.util.Arrays;

public class codeforces_108_B {
    public static void main(String[] args) {
        System.out.println(s());
    }

    public static String s() {
        Scanner scanner = new Scanner(System.in);
        scanner.nextLine(); // Ignore the first line of input
        String[] inputStringArray = scanner.nextLine().split(" ");
        int[] a = new int[inputStringArray.length];
        
        for (int i = 0; i < inputStringArray.length; i++) {
            a[i] = Integer.parseInt(inputStringArray[i]);
        }
        
        Arrays.sort(a);
        
        for (int i = 1; i < a.length; i++) {
            if (a[i] != a[i - 1] && a[i] < a[i - 1] * 2) {
                scanner.close();
                return "YES";
            }
        }
        
        scanner.close();
        return "NO";
    }
}

