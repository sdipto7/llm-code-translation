
import java.util.Scanner;

public class s453478465 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] inputs = scanner.nextLine().split(" ");
        int a = Integer.parseInt(inputs[0]);
        int b = Integer.parseInt(inputs[1]);
        
        if (a <= 8 && b <= 8) {
            System.out.println("Yay!");
        } else {
            System.out.println(":(");
        }
    }
}

