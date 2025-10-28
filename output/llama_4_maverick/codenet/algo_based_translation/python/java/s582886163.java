
import java.util.Arrays;
import java.util.Scanner;

public class s582886163 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] capacityList = new int[5];
        for (int i = 0; i < 5; i++) {
            capacityList[i] = scanner.nextInt();
        }
        scanner.close();
        System.out.println(calculateMinimumSteps(N, capacityList));
    }

    public static int calculateMinimumSteps(int N, int[] capacityList) {
        Arrays.sort(capacityList);
        int bottleNeck = capacityList[0];
        int steps = (N + bottleNeck - 1) / bottleNeck;
        int result = 4 + steps;
        return result;
    }
}

