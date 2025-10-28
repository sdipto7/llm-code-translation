
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class codeforces_421_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String[] firstInput = scanner.nextLine().split(" ");
        int n = Integer.parseInt(firstInput[0]);
        int a = Integer.parseInt(firstInput[1]);
        int b = Integer.parseInt(firstInput[2]);
        
        String[] listaInput = scanner.nextLine().split(" ");
        List<Integer> lista = new ArrayList<>();
        for (String num : listaInput) {
            lista.add(Integer.parseInt(num));
        }
        
        String[] listbInput = scanner.nextLine().split(" ");
        List<Integer> listb = new ArrayList<>();
        for (String num : listbInput) {
            listb.add(Integer.parseInt(num));
        }
        
        for (int k = 0; k < n; k++) {
            int current = k + 1;
            if (lista.contains(current)) {
                System.out.print("1 ");
            } else {
                System.out.print("2 ");
            }
        }
    }
}

