
import java.util.ArrayList;
import java.util.Scanner;

public class codeforces_147_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        ArrayList<String> res = new ArrayList<>();
        char[] punctuation = {',', '.', '!', '?'};
        
        for (int i = 0; i < s.length(); i++) {
            if (i >= 1) {
                if (s.charAt(i) == ' ') {
                    if (!res.get(res.size() - 1).equals(" ")) {
                        res.add(String.valueOf(s.charAt(i)));
                    } else {
                        continue;
                    }
                } else {
                    boolean isPunctuation = false;
                    for (char p : punctuation) {
                        if (s.charAt(i) == p) {
                            isPunctuation = true;
                            break;
                        }
                    }
                    if (isPunctuation) {
                        if (res.get(res.size() - 1).equals(" ")) {
                            res.remove(res.size() - 1);
                        }
                        res.add(String.valueOf(s.charAt(i)));
                        res.add(" ");
                    } else {
                        res.add(String.valueOf(s.charAt(i)));
                    }
                }
            } else {
                if (s.charAt(i) == ' ') {
                    continue;
                }
                boolean isPunctuation = false;
                for (char p : punctuation) {
                    if (s.charAt(i) == p) {
                        isPunctuation = true;
                        break;
                    }
                }
                if (isPunctuation) {
                    continue;
                } else {
                    res.add(String.valueOf(s.charAt(i)));
                }
            }
        }
        for (String str : res) {
            System.out.print(str);
        }
    }
}

