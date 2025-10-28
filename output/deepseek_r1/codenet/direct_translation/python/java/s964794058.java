To solve this problem, we need to determine the minimum and maximum number of distinct colors that can be used to categorize participants based on their arrival times. The arrival times are given in milliseconds, and the categorization is done by dividing the arrival time by 400. The problem also specifies that any arrival time of 3200 milliseconds or more (i.e., division by 400 results in 8 or higher) is considered a special case and should be counted separately.

### Approach
1. **Input Handling**: Read the number of participants and their respective arrival times.
2. **Categorization**:
   - For each arrival time, check if it falls into the special category (3200 milliseconds or more). If so, increment the count of these special cases.
   - For other times, check if the category (result of division by 400) has been seen before. If not, add it to the list of seen categories.
3. **Determine Results**:
   - The minimum number of colors is the number of unique non-special categories. If there are no non-special categories but there are special cases, the minimum is 1.
   - The maximum number of colors is the sum of the unique non-special categories and the special cases.

### Solution Code

import java.util.ArrayList;
import java.util.Scanner;

public class s964794058 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int memTime = scanner.nextInt();
        int[] memLate = new int[memTime];
        for (int i = 0; i < memTime; i++) {
            memLate[i] = scanner.nextInt();
        }
        ArrayList<Integer> colorList = new ArrayList<>();
        int highLate = 0;
        for (int color = 0; color < memTime; color++) {
            int member = memLate[color];
            if (member / 400 >= 8) {
                highLate++;
            } else {
                int div = member / 400;
                if (!colorList.contains(div)) {
                    colorList.add(div);
                }
            }
        }
        int maxColor = colorList.size() + highLate;
        int minColor = colorList.size();
        if (minColor == 0) {
            minColor = 1;
        }
        System.out.println(minColor + " " + maxColor);
    }
}


### Explanation
- **Input Handling**: The code reads the number of participants and their arrival times using a `Scanner`.
- **Categorization**: For each arrival time, it checks if the time is 3200 or more (by checking if division by 400 is 8 or higher). These are counted separately. For other times, it checks if the category (result of division by 400) is already in the list of seen categories. If not, it adds it.
- **Result Calculation**: The minimum number of colors is the size of the list of seen categories, adjusted to 1 if there are no non-special categories but there are special cases. The maximum is the sum of the size of the list and the count of special cases.

This approach efficiently categorizes the arrival times and handles edge cases where there might be no non-special categories but some special cases.
