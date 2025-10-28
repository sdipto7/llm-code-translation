
import java.util.Scanner;
import java.util.ArrayList;

public class s025428739 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        
        ArrayList<Integer> lst = new ArrayList<>();
        lst.add(A + B);
        lst.add(A - B);
        lst.add(A * B);
        
        int max = lst.get(0);
        for (int i = 1; i < lst.size(); i++) {
            if (lst.get(i) > max) {
                max = lst.get(i);
            }
        }
        
        System.out.println(max);
        
        scanner.close();
    }
}

