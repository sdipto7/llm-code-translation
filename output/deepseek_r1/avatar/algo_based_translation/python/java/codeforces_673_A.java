
import java.util.Scanner;

public class codeforces_673_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();
        String[] inputValues = scanner.nextLine().split(" ");
        int[] arr = new int[inputValues.length];
        for (int i = 0; i < inputValues.length; i++) {
            arr[i] = Integer.parseInt(inputValues[i]);
        }
        
        if (arr[0] > 15) {
            System.out.println(15);
            return;
        }
        
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] - arr[i - 1] > 15) {
                System.out.println(arr[i - 1] + 15);
                return;
            }
        }
        
        if (arr[arr.length - 1] == 90 || arr[arr.length - 1] + 15 >= 90) {
            System.out.println(90);
        } else {
            System.out.println(arr[arr.length - 1] + 15);
        }
    }
}

