
import java.util.*;

public class codeforces_609_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String[] firstLine = scanner.nextLine().split(" ");
        int n = Integer.parseInt(firstLine[0]);
        int m = Integer.parseInt(firstLine[1]);
        
        String[] secondLine = scanner.nextLine().split(" ");
        List<Integer> lst = new ArrayList<>();
        for (String s : secondLine) {
            lst.add(Integer.parseInt(s));
        }
        
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        for (int num : lst) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }
        
        int res = 0;
        for (int i = 0; i < n; i++) {
            int current = lst.get(i);
            int count = frequencyMap.get(current);
            if (count > 1) {
                res += n - i - count;
                frequencyMap.put(current, count - 1);
            } else {
                res += n - i - 1;
            }
        }
        
        System.out.println(res);
    }
}

