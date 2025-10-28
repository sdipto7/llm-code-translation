
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class codeforces_518_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String t = scanner.nextLine();
        scanner.close();

        Map<Character, Integer> freqs = new HashMap<>();
        for (char c : s.toCharArray()) {
            freqs.put(c, freqs.getOrDefault(c, 0) + 1);
        }

        Map<Character, Integer> freqt = new HashMap<>();
        for (char c : t.toCharArray()) {
            freqt.put(c, freqt.getOrDefault(c, 0) + 1);
        }

        int yay = 0;
        for (Character c : freqs.keySet()) {
            while (freqs.get(c) > 0 && freqt.containsKey(c) && freqt.get(c) > 0) {
                yay++;
                freqs.put(c, freqs.get(c) - 1);
                freqt.put(c, freqt.get(c) - 1);
            }
        }

        int whoops = 0;
        for (Character c : freqs.keySet()) {
            while (freqs.get(c) > 0) {
                if (Character.isLowerCase(c)) {
                    char upper = Character.toUpperCase(c);
                    if (freqt.containsKey(upper) && freqt.get(upper) > 0) {
                        whoops++;
                        freqs.put(c, freqs.get(c) - 1);
                        freqt.put(upper, freqt.get(upper) - 1);
                    } else {
                        break;
                    }
                } else if (Character.isUpperCase(c)) {
                    char lower = Character.toLowerCase(c);
                    if (freqt.containsKey(lower) && freqt.get(lower) > 0) {
                        whoops++;
                        freqs.put(c, freqs.get(c) - 1);
                        freqt.put(lower, freqt.get(lower) - 1);
                    } else {
                        break;
                    }
                } else {
                    break;
                }
            }
        }

        System.out.println(yay + " " + whoops);
    }
}

