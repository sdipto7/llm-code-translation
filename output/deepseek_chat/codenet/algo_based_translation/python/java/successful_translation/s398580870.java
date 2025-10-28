import java.util.Scanner;

public class s398580870 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        
        if (k % 2 == 1) {
            long result = (long) Math.pow(n / k, 3);
            System.out.println(result);
        } else {
            long part1 = (long) Math.pow(n / k, 3);
            int temp = n + (k / 2);
            long part2 = (long) Math.pow(temp / k, 3);
            long result = part1 + part2;
            System.out.println(result);
        }
    }
}
