
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class atcoder_ABC171_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        scanner.nextLine();
        
        String[] inputArray = scanner.nextLine().split(" ");
        ArrayList<Integer> inputValues = new ArrayList<>();
        for (String num : inputArray) {
            inputValues.add(Integer.parseInt(num));
        }
        
        Collections.sort(inputValues);
        
        int elementsToTake = Math.max(0, Math.min(k, inputValues.size()));
        int total = 0;
        for (int i = 0; i < elementsToTake; i++) {
            total += inputValues.get(i);
        }
        
        System.out.println(total);
    }
}

