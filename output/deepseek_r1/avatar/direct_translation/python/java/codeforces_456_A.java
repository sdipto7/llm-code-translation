To solve this problem, we need to determine if there exists a pair of elements in a list of pairs such that the second element of one pair is greater than the second element of a previous pair, after sorting the list in descending order based on the first element. If such a pair exists, we print "Happy Alex"; otherwise, we print "Poor Alex".

### Approach
1. **Input Reading**: Read the number of pairs and then read each pair of integers.
2. **Sorting**: Sort the list of pairs in descending order based on the first element. If the first elements are equal, sort by the second element in descending order.
3. **Check Condition**: Iterate through the sorted list and check if there exists a pair where the second element is greater than the second element of the previous pair. If found, print "Happy Alex" and exit. If no such pair is found after checking all elements, print "Poor Alex".

### Solution Code

import java.util.*;

public class codeforces_456_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        List<int[]> m = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            m.add(new int[]{a, b});
        }
        Collections.sort(m, (x, y) -> {
            if (x[0] != y[0]) {
                return Integer.compare(y[0], x[0]);
            } else {
                return Integer.compare(y[1], x[1]);
            }
        });
        int[] a = m.get(0);
        boolean found = false;
        for (int i = 1; i < m.size(); i++) {
            int[] current = m.get(i);
            if (current[1] > a[1]) {
                System.out.println("Happy Alex");
                found = true;
                break;
            }
            a = current;
        }
        if (!found) {
            System.out.println("Poor Alex");
        }
    }
}


### Explanation
1. **Input Reading**: The code reads the number of pairs `n` and then reads each pair into a list of integer arrays.
2. **Sorting**: The list is sorted using a custom comparator that sorts primarily by the first element in descending order. If the first elements are equal, it sorts by the second element in descending order.
3. **Check Condition**: The code iterates through the sorted list starting from the second element. For each element, it checks if the second element is greater than the second element of the previous element. If such an element is found, it prints "Happy Alex" and exits. If the loop completes without finding such an element, it prints "Poor Alex".

This approach ensures that we efficiently determine the required condition using sorting and a single pass through the sorted list, resulting in an overall time complexity of O(n log n) due to the sorting step.
