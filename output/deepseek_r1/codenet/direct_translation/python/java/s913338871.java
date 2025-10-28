import java.util.*;

public class s913338871 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.nextLine();
        int[] a = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        Arrays.sort(a);
        int sum = 0;
        for (int i = N; i < a.length; i += 2) {
            sum += a[i];
        }
        System.out.println(sum);
    }
}
