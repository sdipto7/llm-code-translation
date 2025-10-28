import java.util.*;

public class s913338871 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        scanner.nextLine();
        String[] inputArray = scanner.nextLine().split(" ");
        int[] a = new int[inputArray.length];
        for (int i = 0; i < inputArray.length; i++) {
            a[i] = Integer.parseInt(inputArray[i]);
        }
        Arrays.sort(a);
        List<Integer> s = new ArrayList<>();
        for (int i = N; i < a.length; i += 2) {
            s.add(a[i]);
        }
        int sum = 0;
        for (int num : s) {
            sum += num;
        }
        System.out.println(sum);
    }
}
