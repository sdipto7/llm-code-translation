
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class s934308496 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] firstLine = scanner.nextLine().split(" ");
        int n = Integer.parseInt(firstLine[0]);
        int x = Integer.parseInt(firstLine[1]);
        
        ArrayList<Integer> m = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(scanner.nextLine());
            m.add(num);
        }
        
        Collections.sort(m);
        
        int sum_m = 0;
        for (int num : m) {
            sum_m += num;
        }
        
        int remaining = x - sum_m;
        int additional = remaining / m.get(0);
        int total = n + additional;
        
        System.out.println(total);
    }
}

