
import java.util.*;

public class codeforces_108_B {
    public static String s() {
        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();
        String[] inputArray = scanner.nextLine().split(" ");
        int[] a = new int[inputArray.length];
        for (int i = 0; i < inputArray.length; i++) {
            a[i] = Integer.parseInt(inputArray[i]);
        }
        Arrays.sort(a);
        for (int i = 1; i < a.length; i++) {
            if (a[i] != a[i - 1] && a[i] < a[i - 1] * 2) {
                return "YES";
            }
        }
        return "NO";
    }
    
    public static void main(String[] args) {
        System.out.println(s());
    }
}

