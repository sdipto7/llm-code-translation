
import java.util.Arrays;
import java.util.Scanner;

public class codeforces_682_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();
        String[] inputValues = scanner.nextLine().split(" ");
        int[] numbers = new int[inputValues.length];
        
        for (int i = 0; i < inputValues.length; i++) {
            numbers[i] = Integer.parseInt(inputValues[i]);
        }
        
        Arrays.sort(numbers);
        int count = 0;
        
        for (int number : numbers) {
            if (number > count) {
                count++;
            }
        }
        
        System.out.println(count + 1);
    }
}

