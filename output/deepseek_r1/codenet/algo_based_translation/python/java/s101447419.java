
import java.util.*;

public class s101447419 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();
        int[] v = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        
        List<Integer> ve = new ArrayList<>();
        List<Integer> vo = new ArrayList<>();
        for (int i = 0; i < n / 2; i++) {
            ve.add(v[2 * i]);
            vo.add(v[2 * i + 1]);
        }
        
        Map<Integer, Integer> ceMap = new HashMap<>();
        for (int num : ve) ceMap.put(num, ceMap.getOrDefault(num, 0) + 1);
        List<Map.Entry<Integer, Integer>> ceEntries = new ArrayList<>(ceMap.entrySet());
        ceEntries.sort((a, b) -> b.getValue().compareTo(a.getValue()));
        
        Map<Integer, Integer> coMap = new HashMap<>();
        for (int num : vo) coMap.put(num, coMap.getOrDefault(num, 0) + 1);
        List<Map.Entry<Integer, Integer>> coEntries = new ArrayList<>(coMap.entrySet());
        coEntries.sort((a, b) -> b.getValue().compareTo(a.getValue()));
        
        int ceTop = ceEntries.isEmpty() ? -1 : ceEntries.get(0).getKey();
        int ceTopCount = ceEntries.isEmpty() ? 0 : ceEntries.get(0).getValue();
        int coTop = coEntries.isEmpty() ? -1 : coEntries.get(0).getKey();
        int coTopCount = coEntries.isEmpty() ? 0 : coEntries.get(0).getValue();
        
        int ans = n;
        if (ceTop != coTop) {
            ans = n - ceTopCount - coTopCount;
        } else {
            if (ceEntries.size() == 1 && coEntries.size() == 1) {
                ans = n - ceTopCount;
            } else if (ceEntries.size() == 1) {
                ans = n - ceTopCount - (coEntries.size() >= 2 ? coEntries.get(1).getValue() : 0);
            } else if (coEntries.size() == 1) {
                ans = n - coTopCount - (ceEntries.size() >= 2 ? ceEntries.get(1).getValue() : 0);
            } else {
                int option1 = n - ceTopCount - coEntries.get(1).getValue();
                int option2 = n - ceEntries.get(1).getValue() - coTopCount;
                ans = Math.min(option1, option2);
            }
        }
        System.out.println(ans);
    }
}

