
import java.util.*;
import java.util.stream.Collectors;

public class atcoder_ABC150_C {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();
        
        List<Integer> numbers = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            numbers.add(i);
        }
        
        List<List<Integer>> orig = generatePermutations(numbers);
        
        String[] pInput = scanner.nextLine().split(" ");
        List<Integer> pList = Arrays.stream(pInput)
                                  .map(Integer::parseInt)
                                  .collect(Collectors.toList());
        
        String[] qInput = scanner.nextLine().split(" ");
        List<Integer> qList = Arrays.stream(qInput)
                                  .map(Integer::parseInt)
                                  .collect(Collectors.toList());
        
        int pn = orig.indexOf(pList);
        int qn = orig.indexOf(qList);
        
        System.out.println(Math.abs(pn - qn));
    }
    
    private static List<List<Integer>> generatePermutations(List<Integer> numbers) {
        List<List<Integer>> result = new ArrayList<>();
        permute(numbers, 0, result);
        return result;
    }
    
    private static void permute(List<Integer> arr, int k, List<List<Integer>> result) {
        for (int i = k; i < arr.size(); i++) {
            Collections.swap(arr, i, k);
            permute(arr, k + 1, result);
            Collections.swap(arr, k, i);
        }
        if (k == arr.size() - 1) {
            result.add(new ArrayList<>(arr));
        }
    }
}

