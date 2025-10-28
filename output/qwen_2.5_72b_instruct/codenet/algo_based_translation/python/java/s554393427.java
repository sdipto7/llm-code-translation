
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class s554393427 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        List<float[]> mo = new ArrayList<>();
        
        for (int _ = 0; _ < N; _++) {
            float x = scanner.nextFloat();
            String u = scanner.next();
            mo.add(new float[]{x, u.equals("JPY") ? 1 : 0});
        }
        
        float okz = 0;
        for (float[] i : mo) {
            if (i[1] == 1) {
                okz += i[0];
            } else {
                okz += i[0] * 380000;
            }
        }
        
        System.out.println(okz);
        scanner.close();
    }
}

