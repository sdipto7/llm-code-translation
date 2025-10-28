

import java.util.Scanner;
import java.util.HashSet;

public class codeforces_421_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        scanner.nextLine();
        
        HashSet<Integer> setA = new HashSet<>();
        String[] inputA = scanner.nextLine().split(" ");
        for (String s : inputA) {
            setA.add(Integer.parseInt(s));
        }
        
        HashSet<Integer> setB = new HashSet<>();
        String[] inputB = scanner.nextLine().split(" ");
        for (String s : inputB) {
            setB.add(Integer.parseInt(s));
        }
        
        for (int k = 0; k < n; k++) {
            if (setA.contains(k + 1)) {
                System.out.print("1 ");
            } else {
                System.out.print("2 ");
            }
        }
    }
}

