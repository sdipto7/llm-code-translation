
import java.util.Scanner;

public class s752993784 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char[] s = scanner.nextLine().toCharArray();
        int[] countRemainder = new int[2019];
        long cnt = 0;
        int m = 1;
        int currentMod = 0;
        
        for (int i = 0; i < s.length; i++) {
            int digit = s[s.length - 1 - i] - '0';
            currentMod = (currentMod + digit * m) % 2019;
            m = (m * 10) % 2019;
            countRemainder[currentMod]++;
        }
        countRemainder[0]++;
        
        for (int r = 0; r < 2019; r++) {
            cnt += (long) countRemainder[r] * (countRemainder[r] - 1) / 2;
        }
        
        System.out.println(cnt);
    }
}

