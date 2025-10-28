
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class s554393427 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = Integer.parseInt(scanner.nextLine());
        List<Object[]> mo = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            String[] input = scanner.nextLine().split(" ");
            double x = Double.parseDouble(input[0]);
            String u = input[1];
            mo.add(new Object[]{x, u});
        }

        double okz = 0.0;
        for (Object[] i : mo) {
            if (i[1].equals("JPY")) {
                okz += (double) i[0];
            } else {
                okz += (double) i[0] * 380000;
            }
        }

        System.out.println(okz);
    }
}

