
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class codeforces_672_A {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(generateNumberSequence(n));
    }

    public static int generateNumberSequence(int n) {
        List<Integer> li = new ArrayList<>();
        int ind = 0; // Unused variable

        for (int i = 1; i <= 370; i++) {
            List<Integer> temp = new ArrayList<>();
            int p = i, q = i;
            int count = 0;

            while (p != 0) {
                p /= 10;
                count++;
            }

            if (count == 1) {
                li.add(i);
            }

            if (count == 2) {
                temp = new ArrayList<>();
                while (q != 0) {
                    int x = q % 10;
                    q /= 10;
                    temp.add(x);
                }
                for (int j = temp.size() - 1; j >= 0; j--) {
                    li.add(temp.get(j));
                }
            }

            if (count == 3) {
                temp = new ArrayList<>();
                while (q != 0) {
                    int x = q % 10;
                    q /= 10;
                    temp.add(x);
                }
                for (int j = temp.size() - 1; j >= 0; j--) {
                    li.add(temp.get(j));
                }
            }
        }

        li.remove(li.size() - 1);
        li.remove(li.size() - 1);

        return li.get(n - 1);
    }
}

