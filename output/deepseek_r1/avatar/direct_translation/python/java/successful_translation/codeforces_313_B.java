
import java.util.Scanner;
import java.util.ArrayList;

public class codeforces_313_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String soz = scanner.nextLine();
        int[] a = new int[soz.length() + 1];
        for (int i = 1; i < soz.length(); i++) {
            a[i] = a[i - 1];
            if (soz.charAt(i - 1) == soz.charAt(i)) {
                a[i]++;
            }
        }
        int n = Integer.parseInt(scanner.nextLine());
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String[] parts = scanner.nextLine().trim().split("\\s+");
            int m = Integer.parseInt(parts[0]);
            int l = Integer.parseInt(parts[1]);
            arr.add(a[l - 1] - a[m - 1]);
        }
        for (int num : arr) {
            System.out.println(num);
        }
    }
}

