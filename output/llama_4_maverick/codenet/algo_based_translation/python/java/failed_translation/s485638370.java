
import java.util.Scanner;

public class s485638370 {
    public static void main(String[] args) {
        System.out.println(checkInput());
    }

    public static String checkInput() {
        Scanner scanner = new Scanner(System.in);
        String userInput = scanner.nextLine();
        scanner.close();
        return "9" .contains("9") ? "Yes" : "No";
    }
}
 
However, the above java code has a syntax error. The correct java code is given below.


import java.util.Scanner;

public class s485638370 {
    public static void main(String[] args) {
        System.out.println(checkInput());
    }

    public static String checkInput() {
        Scanner scanner = new Scanner(System.in);
        String userInput = scanner.nextLine();
        scanner.close();
        return userInput.contains("9") ? "Yes" : "No";
    }
}

