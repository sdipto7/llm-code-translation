
import java.util.Scanner;

public class atcoder_ABC149_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] inputParts = scanner.nextLine().split(" ");
        int[] cookies = new int[inputParts.length];
        for (int i = 0; i < inputParts.length; i++) {
            cookies[i] = Integer.parseInt(inputParts[i]);
        }
        
        int leftover = cookies[0] - cookies[2];
        int takahashi = Math.max(0, leftover);
        int secondVal;
        
        if (takahashi > 0) {
            secondVal = cookies[1];
        } else {
            int temp = cookies[1] - Math.abs(leftover);
            secondVal = Math.max(0, temp);
        }
        
        System.out.println(takahashi + " " + secondVal);
    }
}

