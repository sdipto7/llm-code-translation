To solve this problem, we need to determine the number of non-decreasing sequences formed from a given list of integers. The approach involves using a binary search to efficiently determine where each new integer should be placed in the existing sequences to maintain the non-decreasing order.

### Approach
1. **Binary Search for Efficient Placement**: For each integer, we use binary search to find the appropriate position in the existing sequences. This helps in maintaining the non-decreasing order efficiently.
2. **Dynamic List Management**: We maintain a list of lists where each sublist represents a non-decreasing sequence. For each new integer, we either add it to an existing sequence or create a new sequence if necessary.
3. **Check Last Element**: The binary search checks the last element of each sublist to determine if the new integer can be added to maintain the non-decreasing order.

### Solution Code

import java.util.ArrayList;
import java.util.Scanner;

public class atcoder_ABC134_E {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = Integer.parseInt(scanner.nextLine());
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            int A = Integer.parseInt(scanner.nextLine());
            int idx = binarySearch(ans, A);

            if (idx == ans.size()) {
                ArrayList<Integer> newList = new ArrayList<>();
                newList.add(A);
                ans.add(newList);
            } else {
                ans.get(idx).add(A);
            }
        }

        System.out.println(ans.size());
    }

    private static int binarySearch(ArrayList<ArrayList<Integer>> ans, int key) {
        int bad = -1;
        int good = ans.size();

        while (good - bad > 1) {
            int mid = (bad + good) / 2;
            if (ans.get(mid).get(ans.get(mid).size() - 1) < key) {
                good = mid;
            } else {
                bad = mid;
            }
        }

        return good;
    }
}


### Explanation
1. **Reading Input**: The input is read using a scanner. The first integer `N` represents the number of elements to process.
2. **Binary Search Function**: The `binarySearch` function determines the position where the new integer should be placed. It checks the last element of each sublist to ensure the non-decreasing order.
3. **Updating Sequences**: For each integer, based on the position returned by the binary search, the integer is either added to an existing sublist or a new sublist is created.
4. **Output Result**: Finally, the number of sublists (non-decreasing sequences) is printed.

This approach efficiently manages the sequences using binary search, ensuring that each insertion is done in logarithmic time relative to the number of existing sequences, leading to an overall time complexity of O(N log N).
