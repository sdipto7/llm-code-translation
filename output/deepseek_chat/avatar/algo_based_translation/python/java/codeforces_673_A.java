
import java.util.Scanner;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

public class codeforces_673_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();
        String[] inputArr = scanner.nextLine().split(" ");
        List<Integer> arr = new ArrayList<>();
        for (String num : inputArr) {
            arr.add(Integer.parseInt(num));
        }
        
        if (arr.get(0) > 15) {
            System.out.println(15);
        } else {
            boolean found = false;
            for (int i = 1; i < arr.size(); i++) {
                if (arr.get(i) - arr.get(i - 1) > 15) {
                    System.out.println(arr.get(i - 1) + 15);
                    found = true;
                    break;
                }
            }
            if (!found) {
                if (arr.get(arr.size() - 1) == 90 || arr.get(arr.size() - 1) + 15 >= 90) {
                    System.out.println(90);
                } else {
                    System.out.println(arr.get(arr.size() - 1) + 15);
                }
            }
        }
    }
}

