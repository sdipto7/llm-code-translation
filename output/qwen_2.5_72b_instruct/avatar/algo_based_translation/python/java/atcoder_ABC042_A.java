import java.util.Scanner;

public class atcoder_ABC042_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] parts = input.split(" ");
        int[] ABC = new int[parts.length];
        
        for (int i = 0; i < parts.length; i++) {
            ABC[i] = Integer.parseInt(parts[i]);
        }
        
        int countOfFive = 0;
        for (int num : ABC) {
            if (num == 5) {
                countOfFive++;
            }
        }
        
        if (countOfFive == 2) {
            int sum = 0;
            for (int num : ABC) {
                sum += num;
            }
            if (sum == 17) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        } else {
            System.out.println("NO");
        }
        
        scanner.close();
    }
}
