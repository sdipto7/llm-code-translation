
import java.util.*;

public class codeforces_95_A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int pya = sc.nextInt();
        sc.nextLine();
        List<String> arre = new ArrayList<>();
        while (pya > 0) {
            pya -= 1;
            arre.add(sc.nextLine().toLowerCase());
        }
        String oString = sc.nextLine();
        String lowString = oString.toLowerCase();
        char letter1 = sc.nextLine().charAt(0);
        letter1 = Character.toLowerCase(letter1);
        char letter2 = (letter1 != 'a') ? 'a' : 'b';
        boolean[] valid = new boolean[oString.length()];
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
            oStringArray[i] = Character.isLowerCase(oString.charAt(i)) ? letter : Character.toUpperCase(letter);
        }
        for (char c : oStringArray) {
            System.out.print(c);
        }
        System.out.println();
    }
}

