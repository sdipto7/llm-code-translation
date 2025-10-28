
import java.util.Arrays;
import java.util.Scanner;

public class codeforces_462_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        scanner.nextLine();
        String s = scanner.nextLine();
        
        int[] count = new int[26];
        for (char c : s.toCharArray()) {
            int index = c - 'A';
            count[index]++;
        }
        
        Arrays.sort(count);
        for (int i = 0; i < 13; i++) {
            int temp = count[i];
            count[i] = count[25 - i];
            count[25 - i] = temp;
        }
        
        int res = 0;
        for (int i = 0; i < 26; i++) {
            if (count[i] >= k) {
                res += k * k;
                System.out.println(res);
                return;
            }
            k -= count[i];
            res += count[i] * count[i];
        }
        System.out.println(res);
    }
}

