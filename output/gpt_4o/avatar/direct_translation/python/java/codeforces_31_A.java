
import java.util.Scanner;

public class codeforces_31_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int y = Integer.parseInt(scanner.nextLine());
        String[] inputArray = scanner.nextLine().split(" ");
        int[] arr = new int[inputArray.length];
        
        for (int i = 0; i < inputArray.length; i++) {
            arr[i] = Integer.parseInt(inputArray[i]);
        }
        
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (i == j) {
                    continue;
                }
                for (int k = 0; k < arr.length; k++) {
                    if (arr[k] != arr[j] && arr[k] != arr[i] && arr[k] == arr[i] + arr[j]) {
                        System.out.println((k + 1) + " " + (j + 1) + " " + (i + 1));
                        return;
                    }
                }
            }
        }
        System.out.println(-1);
    }
}

