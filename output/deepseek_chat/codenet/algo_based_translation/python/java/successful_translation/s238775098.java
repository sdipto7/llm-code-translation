import java.util.Scanner;

public class s238775098 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        double res = 0.0;
        scanner.nextLine();
        
        for (int i = 0; i < n; i++) {
            String[] parts = scanner.nextLine().split(" ");
            String x = parts[0];
            String u = parts[1];
            
            if (u.equals("BTC")) {
                res += Double.parseDouble(x) * 380000.0;
            } else {
                res += Integer.parseInt(x);
            }
        }
        
        System.out.println(res);
    }
}
