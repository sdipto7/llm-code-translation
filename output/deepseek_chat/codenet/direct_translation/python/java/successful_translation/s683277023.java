import java.util.*;

public class s683277023 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        List<Integer> li = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            li.add(sc.nextInt());
        }
        Collections.sort(li);
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += li.get(i);
        }
        System.out.println(sum);
    }
}
