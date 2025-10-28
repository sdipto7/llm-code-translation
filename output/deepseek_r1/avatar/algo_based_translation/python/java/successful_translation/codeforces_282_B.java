
import java.util.Scanner;
import java.util.ArrayList;

public class codeforces_282_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstLine = scanner.nextInt();
        scanner.nextLine();
        int total = 0;
        ArrayList<String> memory = new ArrayList<>();
        
        for (int x = 0; x < firstLine; x++) {
            String[] parts = scanner.nextLine().trim().split("\\s+");
            int A = Integer.parseInt(parts[0]);
            int G = Integer.parseInt(parts[1]);
            
            if (total + A <= 500) {
                total += A;
                memory.add("A");
            } else {
                total -= G;
                memory.add("G");
            }
        }
        
        System.out.println(String.join("", memory));
        scanner.close();
    }
}

