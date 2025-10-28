To solve this problem, we need to maximize the enjoyment value of selecting dishes from a list, considering both the type of dish and their individual enjoyment values. The goal is to balance the number of different types of dishes and their total enjoyment value.

### Approach
1. **Sorting by Enjoyment**: First, we sort the dishes in descending order of their enjoyment values to prioritize higher enjoyment.
2. **Selecting Top K Dishes**: We select the top K dishes based on the sorted list.
3. **Categorizing Dishes**: We categorize the selected dishes into two groups: those that are the first of their type (selectedOnly) and those that are duplicates (selectedChohuku). We also keep track of unselected dishes that are of new types.
4. **Initial Calculation**: Calculate the initial maximum enjoyment value using the selected dishes.
5. **Optimizing by Swapping**: Iterate through possible swaps between the duplicate selected dishes and the unselected new type dishes to find the optimal balance between the number of types and total enjoyment.

### Solution Code

import java.util.*;

public class s804484425 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        List<int[]> info = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int t = sc.nextInt();
            int d = sc.nextInt();
            info.add(new int[]{t, d});
        }

        Collections.sort(info, (a, b) -> Integer.compare(b[1], a[1]));

        List<int[]> selected = info.subList(0, k);
        List<Integer> selectedOnly = new ArrayList<>();
        List<Integer> selectedChohuku = new ArrayList<>();
        List<Integer> unselectedOnly = new ArrayList<>();
        Map<Integer, Integer> map = new HashMap<>();

        for (int[] item : selected) {
            int t = item[0];
            int d = item[1];
            if (!map.containsKey(t)) {
                map.put(t, 1);
                selectedOnly.add(d);
            } else {
                selectedChohuku.add(d);
            }
        }

        int cntType = map.size();
        for (int[] item : info.subList(k, info.size())) {
            int t = item[0];
            int d = item[1];
            if (!map.containsKey(t)) {
                map.put(t, 1);
                unselectedOnly.add(d);
            }
        }

        long sumSelect = 0;
        for (int d : selectedOnly) sumSelect += d;
        for (int d : selectedChohuku) sumSelect += d;
        long ans = (long) cntType * cntType + sumSelect;

        Collections.reverse(unselectedOnly);

        int minSize = Math.min(selectedChohuku.size(), unselectedOnly.size());
        for (int i = 0; i < minSize; i++) {
            cntType++;
            sumSelect += unselectedOnly.get(unselectedOnly.size() - 1);
            sumSelect -= selectedChohuku.get(selectedChohuku.size() - 1);
            unselectedOnly.remove(unselectedOnly.size() - 1);
            selectedChohuku.remove(selectedChohuku.size() - 1);
            long current = (long) cntType * cntType + sumSelect;
            if (current > ans) {
                ans = current;
            }
        }

        System.out.println(ans);
    }
}


### Explanation
1. **Sorting**: The dishes are sorted by their enjoyment values in descending order to ensure we consider the highest enjoyment values first.
2. **Categorization**: We categorize the selected dishes into unique types and duplicates. This helps in efficiently managing the types and their contributions to the total score.
3. **Initial Calculation**: The initial score is calculated using the sum of the selected dishes and the square of the number of unique types.
4. **Swapping for Optimization**: By swapping duplicate selected dishes with new type dishes from the unselected list, we iteratively improve the score, balancing the number of types and the total enjoyment.

This approach ensures that we maximize the enjoyment value by considering both the diversity of types and the individual enjoyment values of the dishes.
