import java.util.Scanner;

public class s960572618 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] inputs = scanner.nextLine().trim().split(" ");
        String a = inputs[0];
        String b = inputs[1];
        String c = inputs[2];
        if (a.equals(b) && b.equals(c)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
