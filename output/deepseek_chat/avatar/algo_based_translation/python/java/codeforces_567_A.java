
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class codeforces_567_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inp = scanner.nextInt();
        scanner.nextLine();
        String[] inputArray = scanner.nextLine().split(" ");
        List<Integer> lista = new ArrayList<>();
        for (String s : inputArray) {
            lista.add(Integer.parseInt(s));
        }
        
        for (int i = 0; i < lista.size(); i++) {
            if (i == 0) {
                System.out.println((lista.get(1) - lista.get(0)) + " " + (lista.get(lista.size()-1) - lista.get(0)));
                continue;
            } else if (i == lista.size() - 1) {
                System.out.println((lista.get(lista.size()-1) - lista.get(lista.size()-2)) + " " + (lista.get(lista.size()-1) - lista.get(0)));
                continue;
            } else {
                if (lista.get(i) - lista.get(i-1) > lista.get(i+1) - lista.get(i)) {
                    System.out.print((lista.get(i+1) - lista.get(i)) + " ");
                } else {
                    System.out.print((lista.get(i) - lista.get(i-1)) + " ");
                }
                
                if (lista.get(lista.size()-1) - lista.get(i) > lista.get(i) - lista.get(0)) {
                    System.out.println(lista.get(lista.size()-1) - lista.get(i));
                } else {
                    System.out.println(lista.get(i) - lista.get(0));
                }
            }
        }
    }
}

