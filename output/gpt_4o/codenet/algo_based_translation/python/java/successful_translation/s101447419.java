
import java.util.*;

public class s101447419 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] v = new int[n];
        for (int i = 0; i < n; i++) {
            v[i] = scanner.nextInt();
        }
        
        List<Integer> ve = new ArrayList<>();
        List<Integer> vo = new ArrayList<>();
        for (int i = 0; i < n / 2; i++) {
            ve.add(v[2 * i]);
            vo.add(v[2 * i + 1]);
        }
        
        Map<Integer, Integer> ce = new HashMap<>();
        Map<Integer, Integer> co = new HashMap<>();
        
        for (int num : ve) {
            ce.put(num, ce.getOrDefault(num, 0) + 1);
        }
        
        for (int num : vo) {
            co.put(num, co.getOrDefault(num, 0) + 1);
        }
        
        int ans = n;
        int[] ceMax = mostCommon(ce);
        int[] coMax = mostCommon(co);
        
        if (ceMax[0] != coMax[0]) {
            ans = n - ceMax[1] - coMax[1];
        } else if (ce.size() == 1 && co.size() == 1) {
            ans = n - ceMax[1];
        } else if (ce.size() == 1) {
            int[] coSecondMax = secondMostCommon(co);
            ans = n - ceMax[1] - coSecondMax[1];
        } else if (co.size() == 1) {
            int[] ceSecondMax = secondMostCommon(ce);
            ans = n - ceSecondMax[1] - coMax[1];
        } else {
            int[] ceSecondMax = secondMostCommon(ce);
            int[] coSecondMax = secondMostCommon(co);
            ans = Math.min(n - ceMax[1] - coSecondMax[1], n - ceSecondMax[1] - coMax[1]);
        }
        
        System.out.println(ans);
    }
    
    private static int[] mostCommon(Map<Integer, Integer> map) {
        int maxKey = -1;
        int maxCount = 0;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() > maxCount) {
                maxKey = entry.getKey();
                maxCount = entry.getValue();
            }
        }
        return new int[]{maxKey, maxCount};
    }
    
    private static int[] secondMostCommon(Map<Integer, Integer> map) {
        int maxKey = -1;
        int maxCount = 0;
        int secondMaxKey = -1;
        int secondMaxCount = 0;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() > maxCount) {
                secondMaxKey = maxKey;
                secondMaxCount = maxCount;
                maxKey = entry.getKey();
                maxCount = entry.getValue();
            } else if (entry.getValue() > secondMaxCount) {
                secondMaxKey = entry.getKey();
                secondMaxCount = entry.getValue();
            }
        }
        return new int[]{secondMaxKey, secondMaxCount};
    }
}

