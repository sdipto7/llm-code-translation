
import java.util.Scanner;

public class s557080041 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        
        if (input.equals("0")) {
            System.out.println("Yes");
        } else {
            char[] charArray = input.toCharArray();
            int[] intArray = new int[charArray.length];
            for (int i = 0; i < charArray.length; i++) {
                intArray[i] = Character.getNumericValue(charArray[i]);
            }
            int sum = 0;
            for (int num : intArray) {
                sum += num;
            }
            if (sum % 9 == 0) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
    }
}

