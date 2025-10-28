
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class codeforces_25_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        String[] input = scanner.nextLine().split(" ");
        List<Integer> list = new ArrayList<>();
        
        for (String s : input) {
            list.add(Integer.parseInt(s) % 2);
        }
        
        int sum = 0;
        for (int num : list) {
            sum += num;
        }
        
        if (sum == 1) {
            System.out.println(list.indexOf(1) + 1);
        } else {
            System.out.println(list.indexOf(0) + 1);
        }
        
        scanner.close();
    }
}

