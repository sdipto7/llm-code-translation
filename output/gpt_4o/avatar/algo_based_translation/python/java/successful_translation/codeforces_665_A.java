
import java.util.Scanner;

public class codeforces_665_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read and parse first line of input
        int a = scanner.nextInt();
        int at = scanner.nextInt();
        
        // Read and parse second line of input
        int b = scanner.nextInt();
        int bt = scanner.nextInt();
        
        // Read and parse third line of input (time in "HH:MM" format)
        String[] time = scanner.next().split(":");
        int t1 = Integer.parseInt(time[0]);
        int t2 = Integer.parseInt(time[1]);

        // Calculate st and fin
        int st = t2 + (t1 - 5) * 60;
        int fin = st + at;
        
        // Initialize now and ans
        int now = 0;
        int ans = 0;
        
        // Loop to count how many times task b can start after st
        while (now < fin && now < 1140) {
            if (now + bt > st) {
                ans++;
            }
            now += b;
        }
        
        // Output the result
        System.out.println(ans);
        
        scanner.close();
    }
}

