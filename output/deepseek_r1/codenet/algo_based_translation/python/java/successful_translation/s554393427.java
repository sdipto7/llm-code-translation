
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class s554393427 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        scanner.nextLine();
        List<String[]> mo = new ArrayList<>();
        
        for (int i = 0; i < N; i++) {
            String[] parts = scanner.nextLine().trim().split("\\s+");
            mo.add(parts);
        }
        
        double okz = 0.0;
        for (String[] entry : mo) {
            double x = Double.parseDouble(entry[0]);
            String u = entry[1];
            if (u.equals("JPY")) {
                okz += x;
            } else {
                okz += x * 380000.0;
            }
        }
        
        System.out.println(okz);
        scanner.close();
    }
}

