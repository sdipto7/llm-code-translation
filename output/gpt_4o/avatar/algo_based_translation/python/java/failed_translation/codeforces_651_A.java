
import java.util.Scanner;

public class codeforces_651_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read two integers from input
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        
        // Calculate the result using the given logic
        int result = Math.max(x + y - 3 + ((y - x) % 3 > 0 ? 1 : 0), 0);
        
        // Print the result
        System.out.println(result);
        
        scanner.close();
    }
    
    // Function to read a single integer input
    public static int num_inp() {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        scanner.close();
        return num;
    }

    // Function to read a list of integers from input
    public static int[] arr_inp() {
        Scanner scanner = new Scanner(System.in);
        String[] inputs = scanner.nextLine().split(" ");
        int[] arr = new int[inputs.length];
        for (int i = 0; i < inputs.length; i++) {
            arr[i] = Integer.parseInt(inputs[i]);
        }
        scanner.close();
        return arr;
    }

    // Function to read multiple integers from input
    public static int[] sp_inp() {
        Scanner scanner = new Scanner(System.in);
        String[] inputs = scanner.nextLine().split(" ");
        int[] result = new int[inputs.length];
        for (int i = 0; i < inputs.length; i++) {
            result[i] = Integer.parseInt(inputs[i]);
        }
        scanner.close();
        return result;
    }

    // Function to read a string input
    public static String str_inp() {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        scanner.close();
        return str;
    }
}

