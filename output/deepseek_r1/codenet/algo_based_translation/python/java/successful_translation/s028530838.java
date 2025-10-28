
import java.util.Scanner;

public class s028530838 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String x = scanner.nextLine();
        boolean hasLowercase = false;
        boolean allLowercase = true;
        
        for (char c : x.toCharArray()) {
            if (Character.isLetter(c)) {
                hasLowercase = true;
                if (!Character.isLowerCase(c)) {
                    allLowercase = false;
                }
            }
        }
        
        if (hasLowercase && allLowercase) {
            System.out.println("a");
        } else {
            System.out.println("A");
        }
    }
}

