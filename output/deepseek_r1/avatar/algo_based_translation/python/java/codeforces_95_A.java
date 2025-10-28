
import java.util.Scanner;
import java.util.HashSet;

public class codeforces_95_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int pya = Integer.parseInt(scanner.nextLine());
        HashSet<String> arre = new HashSet<>();
        while (pya-- > 0) {
            arre.add(scanner.nextLine().toLowerCase());
        }
        String oString = scanner.nextLine();
        String lowString = oString.toLowerCase();
        char letter1 = scanner.nextLine().toLowerCase().charAt(0);
        char letter2 = (letter1 != 'a') ? 'a' : 'b';
        HashSet<Integer> setcito = new HashSet<>();
        
        for (String x : arre) {
            if (lowString.contains(x)) {
                int wat = 0;
                while (true) {
                    int index = lowString.indexOf(x, wat);
                    if (index == -1) break;
                    for (int i = index; i < index + x.length(); i++) {
                        setcito.add(i);
                    }
                    wat = index + 1;
                }
            }
        }
        
        char[] oArray = oString.toCharArray();
        for (int idx : setcito) {
            if (idx >= oArray.length) continue;
            char current = lowString.charAt(idx);
            char select = (current == letter1) ? letter2 : letter1;
            oArray[idx] = (Character.isLowerCase(oArray[idx])) ? select : Character.toUpperCase(select);
        }
        
        System.out.println(new String(oArray));
    }
}

