
import java.util.Scanner;
import java.util.stream.IntStream;

public class codeforces_617_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine();
        
        if (a.chars().filter(ch -> ch == '1').count() == 0) {
            System.out.println(0);
        } else {
            String trimmed = a.replaceAll("^0+|0+$", "");
            String[] parts = trimmed.split("1");
            
            int product = IntStream.of(parts.length == 0 ? new int[]{1} : 
                IntStream.range(0, parts.length)
                         .map(i -> parts[i].length() + 1)
                         .toArray())
                         .reduce(1, (x, y) -> x * y);
            
            System.out.println(product);
        }
        
        scanner.close();
    }
}

