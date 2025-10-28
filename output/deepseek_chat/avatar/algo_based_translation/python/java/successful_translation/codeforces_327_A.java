
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class codeforces_327_A {
    public static List<Integer> find(String s, char ch) {
        return IntStream.range(0, s.length())
                .filter(i -> s.charAt(i) == ch)
                .boxed()
                .collect(Collectors.toList());
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();
        String s = scanner.nextLine().replace(" ", "");
        
        if (!s.contains("0")) {
            System.out.println(n - 1);
        } else {
            List<Integer> indices = find(s, '0');
            if (indices.size() == 1) {
                System.out.println(n);
            } else {
                int maximum = 0;
                List<List<Integer>> combs = new ArrayList<>();
                for (int i = 0; i < indices.size(); i++) {
                    for (int j = i + 1; j < indices.size(); j++) {
                        combs.add(Arrays.asList(indices.get(i), indices.get(j)));
                    }
                }
                
                for (List<Integer> x : combs) {
                    int indexDiff = Math.abs(indices.indexOf(x.get(0)) - indices.indexOf(x.get(1)));
                    int posDiff = Math.abs(x.get(0) - x.get(1));
                    int calculated = 2 + 2 * (indexDiff - 1) - (posDiff - 1);
                    maximum = Math.max(maximum, calculated);
                }
                
                long countOnes = s.chars().filter(c -> c == '1').count();
                System.out.println(countOnes + maximum);
            }
        }
        scanner.close();
    }
}

