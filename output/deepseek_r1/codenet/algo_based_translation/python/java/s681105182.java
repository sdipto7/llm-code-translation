
import java.util.*;

public class s681105182 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.nextLine();
        String[] parts = sc.nextLine().split(" ");
        List<Long> aLi = new ArrayList<>();
        for (String part : parts) {
            aLi.add(Long.parseLong(part));
        }
        Collections.sort(aLi);
        long n = aLi.get(aLi.size() - 1);
        double minDiff = Double.MAX_VALUE;
        long r = 0;
        for (int i = 0; i < aLi.size() - 1; i++) {
            long a = aLi.get(i);
            double diff = Math.abs(n / 2.0 - a);
            if (diff < minDiff) {
                minDiff = diff;
                r = a;
            }
        }
        System.out.println(n + " " + r);
    }
}

