
import java.util.Scanner;

public class codeforces_678_A {

    public static int calculate_next_multiple(String input_string) {
        int vamshi, z, result;

        // Parse input
        String[] inputs = input_string.split(" ");
        vamshi = Integer.parseInt(inputs[0]);
        z = Integer.parseInt(inputs[1]);

        // Calculate the next multiple
        result = ((vamshi / z) + 1) * z;

        // Return the result
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input_string = scanner.nextLine();
        int nextMultiple = calculate_next_multiple(input_string);
        System.out.println(nextMultiple);
        scanner.close();
    }
}

