
import java.util.Scanner;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.DataFlavor;
import java.io.File;
import java.io.FileNotFoundException;

public class atcoder_ABC155_E {
    public static void main(String[] args) {
        String[] inputMethods = {"clipboard", "file", "key"};
        int usingMethod = 0;
        String inputMethod = inputMethods[usingMethod];
        boolean isTest = false;

        if (System.getProperty("os.name").toLowerCase().contains("ios")) {
            isTest = true;
            if (inputMethod.equals(inputMethods[0])) {
                try {
                    Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
                    String inputText = (String) clipboard.getData(DataFlavor.stringFlavor);
                    String[] inputLines = inputText.split("\n");
                    Scanner scanner = new Scanner(new java.io.ByteArrayInputStream(inputText.getBytes()));
                    System.setIn(new java.io.ByteArrayInputStream(inputText.getBytes()));
                } catch (Exception e) {
                }
            } else if (inputMethod.equals(inputMethods[1])) {
                try {
                    System.setIn(new java.io.FileInputStream(new File("inputFile.txt")));
                } catch (FileNotFoundException e) {
                }
            }
        }

        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        int ret = main(s);
        if (ret != -1) {
            System.out.println(ret);
        }
    }

    public static int main(String s) {
        int pmin = 1000;
        int mmin = 0;
        s = "0" + s;
        for (int i = s.length() - 1; i >= 0; i--) {
            int v = Character.getNumericValue(s.charAt(i));
            int npmin = Math.min(pmin + 10 - (v + 1), mmin + 10 - v);
            int nmmin = Math.min(pmin + v + 1, mmin + v);
            pmin = npmin;
            mmin = nmmin;
        }
        return Math.min(pmin, mmin);
    }

    public static void main_b(String s) {
        int pp = 0;
        int na = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            int cc = na + Character.getNumericValue(s.charAt(i));
            na = 0;
            if (cc <= 4) {
                pp += cc;
            } else {
                na = 1;
                if (i == s.length() - 1) {
                    pp += 1;
                }
                pp += 10 - cc;
            }
        }
        System.out.println(pp);
    }

    public static void pa(Object v, boolean isTest) {
        if (isTest) {
            System.out.println(v);
        }
    }
}

