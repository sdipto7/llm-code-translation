
import java.util.*;

public class codeforces_95_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int pya = Integer.parseInt(scanner.nextLine());
        List<String> arre = new ArrayList<>();
        for (int i = 0; i < pya; i++) {
            arre.add(scanner.nextLine().toLowerCase());
        }
        String oString = scanner.nextLine();
        String lowString = oString.toLowerCase();
        String letter1Input = scanner.nextLine();
        char letter1 = letter1Input.isEmpty() ? 'a' : letter1Input.toLowerCase().charAt(0);
        char letter2 = letter1 != 'a' ? 'a' : 'b';
        Set<Integer> setcito = new HashSet<>();
        for (String x : arre) {
            if (x.isEmpty()) continue;
            int index = lowString.indexOf(x);
            while (index != -1) {
                for (int i = index; i < index + x.length(); i++) {
                    setcito.add(i);
                }
                index = lowString.indexOf(x, index + 1);
            }
        }
        char[] oArray = oString.toCharArray();
        for (int i : setcito) {
            if (i >= oArray.length) continue;
            char replacement = lowString.charAt(i) != letter1 ? letter1 : letter2;
            oArray[i] = Character.isUpperCase(oArray[i]) ? Character.toUpperCase(replacement) : replacement;
        }
        System.out.println(new String(oArray));
    }
}

