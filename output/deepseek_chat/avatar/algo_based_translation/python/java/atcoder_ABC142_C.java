
import java.util.*;
import java.util.stream.Collectors;

public class atcoder_ABC142_C {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        scanner.nextLine();
        
        String[] inputArray = scanner.nextLine().split(" ");
        List<int[]> A = new ArrayList<>();
        for (int i = 0; i < inputArray.length; i++) {
            int[] tuple = {i + 1, Integer.parseInt(inputArray[i])};
            A.add(tuple);
        }
        
        List<int[]> A_ = A.stream()
                         .sorted(Comparator.comparingInt(a -> a[1]))
                         .collect(Collectors.toList());
        
        List<Integer> A__ = new ArrayList<>();
        for (int[] a : A_) {
            A__.add(a[0]);
        }
        
        for (int i = 0; i < A__.size() - 1; i++) {
            System.out.print(A__.get(i) + " ");
        }
        System.out.println(A__.get(A__.size() - 1));
    }
}

