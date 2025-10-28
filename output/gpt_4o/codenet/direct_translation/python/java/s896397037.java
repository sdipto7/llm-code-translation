
import java.util.Scanner;
import java.util.Arrays;

public class s896397037 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] s = sc.next().toCharArray();
        Arrays.sort(s);
        if (s[0] == s[1] && s[0] != s[2] && s[2] == s[3]) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}

