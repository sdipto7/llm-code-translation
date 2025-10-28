
import java.util.Scanner;

public class codeforces_334_A {
    public static void main(String[] args) {
        processNumbers();
    }

    public static void processNumbers() {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int i = 1;
        int j = n * n;
        
        while (i < j) {
            System.out.println(i + " " + j);
            i += 1;
            j -= 1;
        }
        
        scanner.close();
    }
}

