
import java.util.Scanner;
import java.util.ArrayList;

public class s554393427 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        ArrayList<Object[]> mo = new ArrayList<>();
        
        for (int i = 0; i < N; i++) {
            String xStr = scanner.next();
            String u = scanner.next();
            double x = Double.parseDouble(xStr);
            mo.add(new Object[]{x, u});
        }
        
        double okz = 0.0;
        for (Object[] i : mo) {
            double value = (Double) i[0];
            String currency = (String) i[1];
            
            if (currency.equals("JPY")) {
                okz += value;
            } else {
                okz += value * 380000.0;
            }
        }
        
        System.out.println(okz);
    }
}

