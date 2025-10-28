To solve this problem, we need to determine the coordinates of two additional points that form a square with the given two points. The solution involves checking various conditions based on the relative positions of the given points and calculating the necessary coordinates accordingly.

### Approach
1. **Input Parsing**: Read the input coordinates of the two points.
2. **Check for Horizontal or Vertical Alignment**:
   - If the points are aligned horizontally (same y-coordinates), calculate the vertical distance and determine the coordinates of the other two points.
   - If the points are aligned vertically (same x-coordinates), calculate the horizontal distance and determine the coordinates of the other two points.
3. **Check for Diagonal Alignment**:
   - If the points form a diagonal with a slope of 1 or -1, determine the coordinates of the other two points based on the diagonal distance.
4. **Default Case**: If none of the above conditions are met, output -1 as it is not possible to form a square.

### Solution Code

import java.util.Scanner;
import java.lang.Math;

public class codeforces_459_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] parts = input.split(" ");
        int[] l1 = new int[4];
        for (int i = 0; i < 4; i++) {
            l1[i] = Integer.parseInt(parts[i]);
        }
        int x1 = l1[0];
        int y1 = l1[1];
        int x2 = l1[2];
        int y2 = l1[3];
        int denominator = x2 - x1;
        int numerator = y2 - y1;
        if (numerator == 0) {
            int d = (int) Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
            int x3 = x2;
            int y3 = y2 + d;
            int x4 = x1;
            int y4 = y1 + d;
            System.out.println(x3 + " " + y3 + " " + x4 + " " + y4);
        } else if (denominator == 0) {
            int d = (int) Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
            int x3 = x2 + d;
            int y3 = y1;
            int x4 = x1 + d;
            int y4 = y2;
            System.out.println(x3 + " " + y3 + " " + x4 + " " + y4);
        } else {
            double quotient = (double) numerator / denominator;
            if (quotient == 1 || quotient == -1) {
                int d = (int) Math.sqrt(Math.pow(x2 - x1, 2) / 2);
                if (quotient == 1) {
                    int x3 = x1;
                    int y3 = y2;
                    int x4 = x2;
                    int y4 = y1;
                    System.out.println(x3 + " " + y3 + " " + x4 + " " + y4);
                } else {
                    int x3 = x2;
                    int y3 = y1;
                    int x4 = x1;
                    int y4 = y2;
                    System.out.println(x3 + " " + y3 + " " + x4 + " " + y4);
                }
            } else {
                System.out.println("-1");
            }
        }
    }
}


### Explanation
1. **Input Parsing**: The input is read as a string and split into individual coordinates, which are then converted to integers.
2. **Horizontal Alignment Check**: If the y-coordinates are the same, the vertical distance is calculated, and the other two points are determined by moving vertically from the given points.
3. **Vertical Alignment Check**: If the x-coordinates are the same, the horizontal distance is calculated, and the other two points are determined by moving horizontally from the given points.
4. **Diagonal Check**: If the slope between the points is 1 or -1, the diagonal distance is used to determine the coordinates of the other two points, forming a square.
5. **Default Case**: If none of the valid conditions are met, it outputs -1, indicating a square cannot be formed.

This approach efficiently checks all possible valid configurations for forming a square with the given points and handles each case appropriately.
