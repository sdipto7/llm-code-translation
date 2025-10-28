
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class s582886163 {

    public static int calculateMinTime(int N, List<Integer> capacities) {
        List<Integer> capacityList = new ArrayList<>(capacities);
        Collections.sort(capacityList);
        int bottleNeck = capacityList.get(0);
        return 4 + (N + bottleNeck - 1) / bottleNeck;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        List<Integer> capacities = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            capacities.add(scanner.nextInt());
        }
        int result = calculateMinTime(N, capacities);
        System.out.println(result);
        scanner.close();
    }
}

