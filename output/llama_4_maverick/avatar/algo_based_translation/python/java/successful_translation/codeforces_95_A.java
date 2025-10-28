
import java.util.*;

public class codeforces_95_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfStrings = scanner.nextInt();
        scanner.nextLine();
        List<String> inputStrings = new ArrayList<>();
        while (numberOfStrings > 0) {
            numberOfStrings--;
            inputStrings.add(scanner.nextLine().toLowerCase());
        }
        String originalString = scanner.nextLine();
        String lowercaseString = originalString.toLowerCase();
        char firstLetter = scanner.nextLine().charAt(0);
        firstLetter = Character.toLowerCase(firstLetter);
        char secondLetter = (firstLetter != 'a') ? 'a' : 'b';
        boolean[] validityFlags = new boolean[originalString.length()];
        Set<Integer> indicesToReplace = new HashSet<>();
        for (String string : inputStrings) {
            if (lowercaseString.contains(string)) {
                int searchStart = 0;
                while (true) {
                    int index = lowercaseString.indexOf(string, searchStart);
                    if (index < 0) {
                        break;
                    }
                    for (int i = index; i < index + string.length(); i++) {
                        indicesToReplace.add(i);
                    }
                    searchStart = index + 1;
                }
            }
        }
        char[] characters = originalString.toCharArray();
        for (Integer index : indicesToReplace) {
            char replacementLetter = (lowercaseString.charAt(index) != firstLetter) ? firstLetter : secondLetter;
            if (Character.isLowerCase(characters[index])) {
                characters[index] = replacementLetter;
            } else {
                characters[index] = Character.toUpperCase(replacementLetter);
            }
        }
        System.out.print(String.valueOf(characters));
        System.out.println();
    }
}

