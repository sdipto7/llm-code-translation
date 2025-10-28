
import java.util.Scanner;

public class codeforces_673_A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String[] arrStr = sc.nextLine().split(" ");
        int[] arr = new int[arrStr.length];
        for (int i = 0; i < arrStr.length; i++) {
            arr[i] = Integer.parseInt(arrStr[i]);
        }
        if (arr[0] > 15) {
            System.out.println(15);
        } else {
            boolean found = false;
            int result = -1;
            for (int i = 1; i < arr.length; i++) {
                if (arr[i] - arr[i - 1] > 15) {
                    result = arr[i - 1] + 15;
                    found = true;
                    break;
                }
            }
            if (found) {
                System.out.println(result);
            } else {
                if (arr[arr.length - 1] == 90 || arr[arr.length - 1] + 15 >= 90) {
                    System.out.println(90);
                } else {
                    System.out.println(arr[arr.length - 1] + 15);
                }
            }
        }
    }
}

