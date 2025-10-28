import java.util.*;

public class atcoder_ABC171_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        scanner.nextLine();
        
        String[] inputArray = scanner.nextLine().split(" ");
        int[] numbers = new int[inputArray.length];
        for (int i = 0; i < inputArray.length; i++) {
            numbers[i] = Integer.parseInt(inputArray[i]);
        }
        
        Arrays.sort(numbers);
        
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += numbers[i];
        }
        
        System.out.println(sum);
    }
}
