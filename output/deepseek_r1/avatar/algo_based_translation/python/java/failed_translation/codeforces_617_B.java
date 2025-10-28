
import java.util.Scanner;
import java.util.ArrayList;

public class codeforces_617_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();
        String a = scanner.nextLine();
        
        int countOnes = 0;
        for (char c : a.toCharArray()) {
            if (c == '1') {
                countOnes++;
            }
        }
        
        if (countOnes == 0) {
            System.out.println(0);
        } else {
            String strippedA = a.replaceAll("^[0 ]+", "").replaceAll("[0 ]+$", "");
            String[] splitParts = strippedA.split("1");
            ArrayList<Integer> factors = new ArrayList<>();
            
            for (String part : splitParts) {
                int zeroCount = 0;
                for (char c : part.toCharArray()) {
                    if (c == '0') {
                        zeroCount++;
                    }
                }
                factors.add(zeroCount + 1);
            }
            
            int productResult = 1;
            for (int factor : factors) {
                productResult *= factor;
            }
            
            System.out.println(productResult);
        }
    }
}

