import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class codeforces_421_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String[] firstLine = scanner.nextLine().split(" ");
        int n = Integer.parseInt(firstLine[0]);
        int a = Integer.parseInt(firstLine[1]);
        int b = Integer.parseInt(firstLine[2]);
        
        List<Integer> lista = new ArrayList<>();
        String[] secondLine = scanner.nextLine().split(" ");
        for (String num : secondLine) {
            lista.add(Integer.parseInt(num));
        }
        
        List<Integer> listb = new ArrayList<>();
        String[] thirdLine = scanner.nextLine().split(" ");
        for (String num : thirdLine) {
            listb.add(Integer.parseInt(num));
        }
        
        for (int k = 0; k < n; k++) {
            if (lista.contains(k + 1)) {
                System.out.print("1 ");
            } else {
                System.out.print("2 ");
            }
        }
        
        System.out.println();
        
        scanner.close();
    }
}
