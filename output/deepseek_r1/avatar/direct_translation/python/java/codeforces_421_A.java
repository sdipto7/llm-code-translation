
import java.util.*;

public class codeforces_421_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] firstLine = scanner.nextLine().split(" ");
        int n = Integer.parseInt(firstLine[0]);
        int a = Integer.parseInt(firstLine[1]);
        int b = Integer.parseInt(firstLine[2]);
        
        Set<Integer> lista = new HashSet<>();
        String[] listaStr = scanner.nextLine().split(" ");
        for (String s : listaStr) {
            lista.add(Integer.parseInt(s));
        }
        
        String[] listbStr = scanner.nextLine().split(" ");
        
        for (int k = 1; k <= n; k++) {
            System.out.print(lista.contains(k) ? "1 " : "2 ");
        }
    }
}

