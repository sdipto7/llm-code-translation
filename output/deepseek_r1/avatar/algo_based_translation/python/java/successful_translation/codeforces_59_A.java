
import java.util.Scanner;

public class codeforces_59_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String txt = scanner.nextLine();
        int upperCount = 0;
        int lowerCount = 0;
        
        for (int i = 0; i < txt.length(); i++) {
            char c = txt.charAt(i);
            if (Character.isLowerCase(c)) {
                lowerCount++;
            } else {
                upperCount++;
            }
        }
        
        String output;
        if (upperCount > lowerCount) {
            output = txt.toUpperCase();
        } else {
            output = txt.toLowerCase();
        }
        
        System.out.println(output);
        scanner.close();
    }
}

