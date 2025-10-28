
import java.util.*;
import java.util.stream.Collectors;

public class s087080706 {

    public static int computeMinCost(int n, int m, int x, List<Integer> a) {
        int i = Collections.binarySearch(a, x);
        if (i < 0) {
            i = -(i + 1);
        }
        return Math.min(a.subList(0, i).size(), a.subList(i, a.size()).size());
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] firstInput = scanner.nextLine().split(" ");
        int n = Integer.parseInt(firstInput[0]);
        int m = Integer.parseInt(firstInput[1]);
        int x = Integer.parseInt(firstInput[2]);

        List<Integer> a = Arrays.stream(scanner.nextLine().split(" "))
                                .map(Integer::parseInt)
                                .collect(Collectors.toList());

        int result = computeMinCost(n, m, x, a);
        System.out.println(result);

        scanner.close();
    }
}

