import java.util.*;

public class codeforces_459_B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        int[] l1 = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        Arrays.sort(l1);
        int a = l1[l1.length - 1];
        int b = l1[0];
        if (a == b) {
            System.out.println((a - b) + " " + (n * (n - 1)) / 2);
        } else {
            int ac = 0;
            int bc = 0;
            for (int num : l1) {
                if (num == a) ac++;
                if (num == b) bc++;
            }
            System.out.println((a - b) + " " + (ac * bc));
        }
    }
}
