
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class codeforces_672_A {
    public static void main(String[] args) {
        ArrayList<Integer> li = new ArrayList<>();
        for (int i = 1; i <= 370; i++) {
            int p = i;
            int count = 0;
            while (p != 0) {
                p /= 10;
                count++;
            }
            
            if (count == 1) {
                li.add(i);
            } else if (count == 2 || count == 3) {
                ArrayList<Integer> temp = new ArrayList<>();
                int q = i;
                while (q != 0) {
                    temp.add(q % 10);
                    q /= 10;
                }
                Collections.reverse(temp);
                li.addAll(temp);
            }
        }
        li.remove(li.size() - 1);
        li.remove(li.size() - 1);
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(li.get(n - 1));
        scanner.close();
    }
}

