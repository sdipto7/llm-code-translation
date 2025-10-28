
import java.util.Scanner;
import java.util.ArrayList;

public class s002779582 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        scanner.nextLine();
        
        ArrayList<Integer> Hs = new ArrayList<>();
        String[] inputArray = scanner.nextLine().split(" ");
        for (String s : inputArray) {
            Hs.add(Integer.parseInt(s));
        }
        
        int ans = 0;
        int maxH = 0;
        for (int H : Hs) {
            if (maxH <= H) {
                ans++;
                maxH = H;
            }
        }
        
        System.out.println(ans);
    }
}

