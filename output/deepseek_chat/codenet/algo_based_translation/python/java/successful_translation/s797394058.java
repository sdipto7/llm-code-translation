import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class s797394058 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int x = 1;
        
        List<Integer> N_list = IntStream.range(0, N)
                                       .map(i -> i + 1)
                                       .boxed()
                                       .collect(Collectors.toList());
        
        List<List<Integer>> n = new ArrayList<>();
        generateProduct(N_list, 3, new ArrayList<>(), n);
        
        int m = n.size();
        System.out.println(m);
    }
    
    private static void generateProduct(List<Integer> list, int repeat, 
                                      List<Integer> current, List<List<Integer>> result) {
        if (current.size() == repeat) {
            result.add(new ArrayList<>(current));
            return;
        }
        
        for (int num : list) {
            current.add(num);
            generateProduct(list, repeat, current, result);
            current.remove(current.size() - 1);
        }
    }
}
