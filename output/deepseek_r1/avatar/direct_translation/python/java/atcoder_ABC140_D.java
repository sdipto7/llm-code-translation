To solve this problem, we need to determine the maximum possible number of happy people in a line after up to K operations. Each operation can change the direction a person is facing, and a person is happy if they are facing the same direction as their immediate neighbors.

### Approach
1. **Count Segments**: First, we count the number of segments in the initial configuration. A segment is a consecutive sequence of people facing the same direction. The number of segments helps us determine the initial number of unhappy people.
2. **Calculate Initial Happy People**: The initial number of happy people can be derived from the number of segments. If there are `segCnt` segments, the number of unhappy people is `segCnt`, and the happy people are `N - 1 - segCnt`.
3. **Determine Maximum Happy People**: If the number of operations `K` is enough to merge all segments, the maximum happy people will be `N - 1`. Otherwise, each operation can reduce the number of segments by up to 2, so the maximum happy people will be `curHappy + 2*K`.

### Solution Code

import java.util.*;

public class atcoder_ABC140_D {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = Integer.parseInt(scanner.next());
        int K = Integer.parseInt(scanner.next());
        String S = scanner.next();
        int segCnt = 0;
        for (int i = 0; i < N - 1; i++) {
            if (S.charAt(i) != S.charAt(i + 1)) {
                segCnt++;
            }
        }
        int curHappy = N - 1 - segCnt;
        int ans;
        if (2 * K >= segCnt) {
            ans = N - 1;
        } else {
            ans = curHappy + 2 * K;
        }
        System.out.println(ans);
    }
}


### Explanation
1. **Reading Input**: The input values for N (number of people), K (number of operations), and S (string representing directions) are read.
2. **Counting Segments**: We iterate through the string S to count how many times the direction changes, which gives the number of segments.
3. **Calculating Initial Happy People**: Using the number of segments, we compute the initial number of happy people.
4. **Determining Result**: Based on the number of operations K, we check if it's possible to merge all segments. If yes, the result is the maximum possible happy people (N-1). Otherwise, we calculate the result using the formula `curHappy + 2*K`.

This approach efficiently determines the maximum number of happy people with the given constraints, ensuring optimal use of operations.
