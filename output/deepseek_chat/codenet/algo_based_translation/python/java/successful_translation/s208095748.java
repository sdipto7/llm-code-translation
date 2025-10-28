
import java.util.Scanner;

public class s208095748 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputStr = scanner.nextLine();
        String[] inputList = inputStr.split(" ");
        int A = Integer.parseInt(inputList[0]);
        int B = Integer.parseInt(inputList[1]);
        int C = Integer.parseInt(inputList[2]);
        
        if (B < C) {
            System.out.println(0);
        } else {
            if (A * C < B) {
                System.out.println(C);
            } else {
                int result = B / A;
                System.out.println(result);
            }
        }
    }
}

