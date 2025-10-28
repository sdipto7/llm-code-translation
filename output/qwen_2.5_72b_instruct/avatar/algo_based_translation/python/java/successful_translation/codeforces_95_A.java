import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class codeforces_95_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int pya = scanner.nextInt();
        scanner.nextLine();
        List<String> arre = new ArrayList<>();
        while (pya > 0) {
            pya--;
            arre.add(scanner.nextLine().toLowerCase());
        }
        String oString = scanner.nextLine();
        String lowString = oString.toLowerCase();
        String letter1 = scanner.nextLine().charAt(0) + "";
        letter1 = letter1.toLowerCase();
        String letter2 = letter1.equals("a") ? "b" : "a";
        int[] valid = new int[oString.length()];
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
            String letter = lowString.charAt(i) != letter1.charAt(0) ? letter1 : letter2;
            oStringArray[i] = Character.isLowerCase(oStringArray[i]) ? letter.charAt(0) : Character.toUpperCase(letter.charAt(0));
        }
        for (char x : oStringArray) {
            System.out.print(x);
        }
        System.out.println();
    }
}
