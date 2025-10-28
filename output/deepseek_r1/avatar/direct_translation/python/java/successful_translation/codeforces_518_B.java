
import java.util.HashMap;
import java.util.Scanner;

public class codeforces_518_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String t = scanner.nextLine();
        HashMap<Character, Integer> freqs = new HashMap<>();
        HashMap<Character, Integer> freqt = new HashMap<>();
        int yay = 0, whoops = 0;

        for (char c : s.toCharArray()) {
            freqs.put(c, freqs.getOrDefault(c, 0) + 1);
        }
        for (char c : t.toCharArray()) {
            freqt.put(c, freqt.getOrDefault(c, 0) + 1);
        }

        for (Character c : freqs.keySet()) {
            if (freqt.containsKey(c)) {
                int min = Math.min(freqs.get(c), freqt.get(c));
                yay += min;
                freqs.put(c, freqs.get(c) - min);
                freqt.put(c, freqt.get(c) - min);
            }
        }

        for (Character c : freqs.keySet()) {
            while (freqs.get(c) > 0) {
                if (Character.isLowerCase(c)) {
                    char upper = Character.toUpperCase(c);
                    if (freqt.containsKey(upper) && freqt.get(upper) > 0) {
                        freqs.put(c, freqs.get(c) - 1);
                        freqt.put(upper, freqt.get(upper) - 1);
                        whoops++;
                    } else {
                        break;
                    }
                } else if (Character.isUpperCase(c)) {
                    char lower = Character.toLowerCase(c);
                    if (freqt.containsKey(lower) && freqt.get(lower) > 0) {
                        freqs.put(c, freqs.get(c) - 1);
                        freqt.put(lower, freqt.get(lower) - 1);
                        whoops++;
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

