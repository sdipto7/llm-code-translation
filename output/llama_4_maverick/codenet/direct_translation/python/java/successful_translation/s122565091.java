
import java.util.Scanner;

public class s122565091 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] firstLine = sc.nextLine().split(" ");
        int a = Integer.parseInt(firstLine[0]);
        int v = Integer.parseInt(firstLine[1]);
        String[] secondLine = sc.nextLine().split(" ");
        int b = Integer.parseInt(secondLine[0]);
        int w = Integer.parseInt(secondLine[1]);
        int t = sc.nextInt();
        if (a == b) {
            System.out.println("YES");
        } else if (v <= w) {
            System.out.println("NO");
        } else {
            if (t < Math.abs(a - b) / (double) (v - w)) {
                System.out.println("NO");
            } else {
                System.out.println("YES");
            }
        }
    }
}

