
import java.util.Scanner;

public class s462546732 {

    public static void compareAndPrint(String inputStr) {
        String[] parts = inputStr.split(" ");
        String aStr = parts[0];
        String bStr = parts[1];
        
        int a = Integer.parseInt(aStr);
        int b = Integer.parseInt(bStr);
        
        if (a <= b) {
            System.out.println(a);
        } else {
            System.out.println(a - 1);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputStr = scanner.nextLine();
        compareAndPrint(inputStr);
        scanner.close();
    }
}

