To solve this problem, we need to determine the number of pairs of points in a given set of points in a d-dimensional space such that the Euclidean distance between each pair is an integer. 

### Approach
1. **Input Reading**: Read the number of points `n` and the number of dimensions `d`.
2. **Store Points**: Store each point in a 2D array where each row represents a point and each column represents a dimension.
3. **Calculate Distance**: For each pair of points, compute the Euclidean distance. This is done by summing the squared differences of their coordinates in each dimension and then taking the square root of the sum.
4. **Check Integer Distance**: Check if the computed distance is an integer. This can be verified by checking if the distance is equal to its floor value and ensuring it is not infinite (though in practice, with integer coordinates, the distance won't be infinite).
5. **Count Valid Pairs**: Maintain a count of all valid pairs where the distance is an integer.

### Solution Code

import java.util.Scanner;

public class atcoder_ABC133_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int d = scanner.nextInt();
        int[][] points = new int[n][d];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < d; j++) {
                points[i][j] = scanner.nextInt();
            }
        }
        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                double distance = 0.0;
                for (int k = 0; k < d; k++) {
                    int diff = points[i][k] - points[j][k];
                    distance += diff * diff;
                }
                distance = Math.sqrt(distance);
                if (distance == Math.floor(distance) && !Double.isInfinite(distance)) {
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}


### Explanation
- **Reading Input**: The input is read using a `Scanner` to first get the number of points and dimensions. Each point's coordinates are then read into a 2D array.
- **Distance Calculation**: For each pair of points, the Euclidean distance is calculated by iterating over each dimension, computing the squared difference, summing these values, and then taking the square root.
- **Integer Check**: The check for the distance being an integer is done using `distance == Math.floor(distance)`, which ensures that the distance has no fractional part. The check `!Double.isInfinite(distance)` is a safeguard, though it's not strictly necessary here as the input coordinates are integers.
- **Counting Pairs**: The count of valid pairs is incremented each time a valid pair is found, and the result is printed at the end.

This approach efficiently checks all pairs of points and correctly counts those with integer distances, leveraging basic arithmetic and mathematical functions in Java.
