
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class codeforces_95_A {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int pya = Integer.parseInt(scanner.nextLine());
        List<String> arre = new ArrayList<>();
        
        while (pya > 0) {
            pya--;
            arre.add(scanner.nextLine().toLowerCase());
        }
        
        String oString = scanner.nextLine();
        String lowString = oString.toLowerCase();
        char letter1 = scanner.nextLine().toLowerCase().charAt(0);
        char letter2 = (letter1 != 'a') ? 'a' : 'b';
        
        Set<Integer> setcito = new HashSet<>();
        
        for (String x : arre) {
            if (lowString.contains(x)) {
                int wat = 0;
                while (true) {
                    int index = lowString.indexOf(x, wat);
                    if (index < 0) {
                        break;
                    }
                    for (int i = index; i < index + x.length(); i++) {
                        setcito.add(i);
                    }
                    wat = index + 1;
                }
            }
        }
        
        char[] oStringArray = oString.toCharArray();
        
        for (int i : setcito) {
            char letter = (lowString.charAt(i) != letter1) ? letter1 : letter2;
            oStringArray[i] = Character.isLowerCase(oStringArray[i]) ? letter : Character.toUpperCase(letter);
        }
        
        for (char c : oStringArray) {
            System.out.print(c);
        }
        System.out.println();
        
        scanner.close();
    }
}

