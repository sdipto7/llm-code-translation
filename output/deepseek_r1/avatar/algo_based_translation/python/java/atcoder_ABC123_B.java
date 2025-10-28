
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class atcoder_ABC123_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<int[]> menu = new ArrayList<>();
        
        for (int i = 0; i < 5; i++) {
            String input = scanner.nextLine();
            int value = Integer.parseInt(input);
            int lastDigit = Character.getNumericValue(input.charAt(input.length() - 1));
            if (lastDigit == 0) {
                lastDigit = 10;
            }
            menu.add(new int[]{value, lastDigit});
        }
        
        Collections.sort(menu, Comparator.comparingInt(a -> a[1]));
        
        int ans = 0;
        for (int i = 1; i < menu.size(); i++) {
            ans += ((menu.get(i)[0] + 9) / 10) * 10;
        }
        ans += menu.get(0)[0];
        
        System.out.println(ans);
    }
}

