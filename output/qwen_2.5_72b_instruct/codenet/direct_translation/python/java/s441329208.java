import java.util.Arrays;
import java.util.Scanner;

public class s441329208 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char[] s = scanner.nextLine().toCharArray();
        char[] t = scanner.nextLine().toCharArray();
        Arrays.sort(s);
        Arrays.sort(t);
        for (int i = 0, j = t.length - 1; i < s.length && j >= 0; i++, j--) {
            char temp = t[i];
            t[i] = t[j];
            t[j] = temp;
        }
        System.out.println(Arrays.toString(s).compareTo(Arrays.toString(t)) < 0 ? "Yes" : "No");
    }
}
