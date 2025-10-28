
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class atcoder_ABC125_B {

    public static int calculateProfit(int N, List<Integer> V, List<Integer> C) {
        List<Integer> list = new ArrayList<>();
        list.add(0);
        int ans = 0;
        int X = 0;
        int Y = 0;

        for (int i = 0; i < N; i++) {
            if (V.get(i) - C.get(i) > 0) {
                X = V.get(i);
                Y = C.get(i);
                list.add(X - Y);
            }
        }
        return list.stream().mapToInt(Integer::intValue).sum();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = Integer.parseInt(scanner.nextLine().trim());
        List<Integer> V = new ArrayList<>();
        List<Integer> C = new ArrayList<>();

        String[] vInput = scanner.nextLine().trim().split(" ");
        for (String vStr : vInput) {
            V.add(Integer.parseInt(vStr));
        }
        
        String[] cInput = scanner.nextLine().trim().split(" ");
        for (String cStr : cInput) {
            C.add(Integer.parseInt(cStr));
        }

        System.out.println(calculateProfit(N, V, C));

        scanner.close();
    }
}

