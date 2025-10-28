import java.util.*;
public class s913338871 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        List<Integer> a = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            a.add(sc.nextInt());
        }
        Collections.sort(a);
        List<Integer> s = new ArrayList<>();
        for (int i = N; i < a.size(); i += 2) {
            s.add(a.get(i));
        }
        int sum = 0;
        for (int num : s) {
            sum += num;
        }
        System.out.println(sum);
    }
}
