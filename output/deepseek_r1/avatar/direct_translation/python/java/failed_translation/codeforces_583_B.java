To solve this problem, we need to determine the number of passes required to process all elements in an array, where each pass alternates between processing elements from the start to end and then from end to start. Each element is processed if its value is less than or equal to the current count of processed elements. The array is reversed after each pass to alternate the processing direction.

### Approach
1. **Input Reading**: Read the integer `n` and the array `a` of integers.
2. **Initialization**: Initialize counters to keep track of the number of processed elements and the number of passes.
3. **Processing Loop**: Use a while loop to continue processing until all elements are processed. In each iteration:
   - Increment the pass counter.
   - Process elements in the current order of the array, marking elements as processed if they meet the criteria.
   - Reverse the array to alternate the processing direction for the next pass.
4. **Output**: Print the number of passes required.

### Solution Code

import java.util.*;

public class codeforces_583_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        List<Integer> a = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            a.add(scanner.nextInt());
        }
        int counter = 0;
        int counterTurn = -1;
        while (counter < a.size()) {
            counterTurn++;
            for (int i = 0; i < a.size(); i++) {
                int num = a.get(i);
                if (num != -1 && num <= counter) {
                    counter++;
                    a.set(i, -1);
                }
            }
            Collections.reverse(a);
        }
        System.out.println(counterTurn);
    }
}


### Explanation
- **Input Handling**: The code reads the input values using a `Scanner` and stores the integers in a list.
- **Counter Initialization**: `counter` tracks the number of processed elements, starting at 0. `counterTurn` tracks the number of passes, starting at -1 to account for the initial increment.
- **Processing Loop**: The while loop runs until all elements are processed. Each pass processes elements in the current order, marks them as processed by setting them to -1, and reverses the array for the next pass.
- **Reversing the Array**: The `Collections.reverse(a)` method is used to reverse the array after each pass, alternating the processing direction.

This approach ensures that each element is processed in the correct order and direction, efficiently counting the number of passes required to process all elements.
