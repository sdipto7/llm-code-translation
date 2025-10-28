
import java.util.*;
import java.util.stream.Collectors;

public class atcoder_ABC128_C {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        scanner.nextLine();
        
        List<List<Integer>> li = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            String[] parts = scanner.nextLine().split(" ");
            List<Integer> row = new ArrayList<>();
            for (int j = 1; j < parts.length; j++) {
                row.add(Integer.parseInt(parts[j]));
            }
            li.add(row);
        }
        
        String[] pParts = scanner.nextLine().split(" ");
        int[] pArray = new int[pParts.length];
        for (int i = 0; i < pParts.length; i++) {
            pArray[i] = Integer.parseInt(pParts[i]);
        }
        
        Set<Integer> q = new HashSet<>();
        for (List<Integer> row : li) {
            q.addAll(row);
        }
        
        Set<Integer> r = new HashSet<>();
        for (int i = 1; i <= n; i++) {
            r.add(i);
        }
        
        Set<Integer> v = new HashSet<>(r);
        v.removeAll(q);
        
        int ans = 0;
        List<Integer> qList = new ArrayList<>(q);
        int qSize = qList.size();
        
        for (int i = 0; i <= qSize; i++) {
            for (List<Integer> combination : combinations(qList, i)) {
                Set<Integer> s = new HashSet<>(combination);
                boolean valid = true;
                
                for (int j = 0; j < li.size(); j++) {
                    List<Integer> u = li.get(j);
                    int w = pArray[j];
                    
                    Set<Integer> uSet = new HashSet<>(u);
                    uSet.retainAll(s);
                    
                    if (uSet.size() % 2 != w) {
                        valid = false;
                        break;
                    }
                }
                
                if (valid) {
                    ans += Math.pow(2, v.size());
                }
            }
        }
        
        System.out.println(ans);
        scanner.close();
    }
    
    private static <T> List<List<T>> combinations(List<T> list, int k) {
        List<List<T>> result = new ArrayList<>();
        combinationsHelper(list, k, 0, new ArrayList<>(), result);
        return result;
    }
    
    private static <T> void combinationsHelper(List<T> list, int k, int start, List<T> current, List<List<T>> result) {
        if (current.size() == k) {
            result.add(new ArrayList<>(current));
            return;
        }
        
        for (int i = start; i < list.size(); i++) {
            current.add(list.get(i));
            combinationsHelper(list, k, i + 1, current, result);
            current.remove(current.size() - 1);
        }
    }
}

