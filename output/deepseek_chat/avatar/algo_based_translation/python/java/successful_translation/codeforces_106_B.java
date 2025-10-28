
import java.util.*;

public class codeforces_106_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        List<int[]> inputArray = new ArrayList<>();
        
        for (int i = 0; i < n; i++) {
            int S = scanner.nextInt();
            int R = scanner.nextInt();
            int H = scanner.nextInt();
            int C = scanner.nextInt();
            inputArray.add(new int[]{S, R, H, C});
        }
        
        List<int[]> outdated = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (inputArray.get(i)[0] < inputArray.get(j)[0] && 
                    inputArray.get(i)[1] < inputArray.get(j)[1] && 
                    inputArray.get(i)[2] < inputArray.get(j)[2]) {
                    outdated.add(inputArray.get(i));
                }
            }
        }
        
        Set<int[]> outdatedSet = new HashSet<>();
        for (int[] item : outdated) {
            outdatedSet.add(item);
        }
        
        int minimumCost = 100000;
        int inputNumber = 0;
        
        for (int i = 0; i < n; i++) {
            int[] currentItem = inputArray.get(i);
            int cost = currentItem[3];
            boolean found = false;
            for (int[] outdatedItem : outdatedSet) {
                if (Arrays.equals(currentItem, outdatedItem)) {
                    found = true;
                    break;
                }
            }
            if (!found && cost < minimumCost) {
                minimumCost = cost;
                inputNumber = i + 1;
            }
        }
        
        System.out.println(inputNumber);
    }
}

