
import java.util.Scanner;

public class atcoder_ABC171_E {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        String[] inputValues = scanner.nextLine().split(" ");
        int[] arr = new int[inputValues.length];
        for (int i = 0; i < inputValues.length; i++) {
            arr[i] = Integer.parseInt(inputValues[i]);
        }
        
        int total = 0;
        for (int num : arr) {
            total ^= num;
        }
        
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            if (i > 0) {
                result.append(" ");
            }
            result.append(arr[i] ^ total);
        }
        
        System.out.println(result.toString());
    }
}

