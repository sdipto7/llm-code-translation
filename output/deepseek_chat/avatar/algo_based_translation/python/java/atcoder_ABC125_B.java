
import java.util.Scanner;
import java.util.ArrayList;

public class atcoder_ABC125_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        scanner.nextLine();
        
        String[] V_str = scanner.nextLine().split(" ");
        ArrayList<Integer> V = new ArrayList<>();
        for (String s : V_str) {
            V.add(Integer.parseInt(s));
        }
        
        String[] C_str = scanner.nextLine().split(" ");
        ArrayList<Integer> C = new ArrayList<>();
        for (String s : C_str) {
            C.add(Integer.parseInt(s));
        }
        
        ArrayList<Integer> list = new ArrayList<>();
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
        
        int sum = 0;
        for (int num : list) {
            sum += num;
        }
        
        System.out.println(sum);
    }
}

