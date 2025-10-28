
import java.util.*;

public class atcoder_ABC171_B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        sc.nextLine();
        String[] parts = sc.nextLine().split(" ");
        ArrayList<Integer> list = new ArrayList<>();
        for (String part : parts) {
            list.add(Integer.parseInt(part));
        }
        Collections.sort(list);
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += list.get(i);
        }
        System.out.println(sum);
    }
}

