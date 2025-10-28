import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Iterator;

public class atcoder_ABC155_E {
    private static final List<String> inputMethods = List.of("clipboard", "file", "key");
    private static final int usingMethod = 0;
    private static final String inputMethod = inputMethods.get(usingMethod);
    private static final int mod = 1000000007;
    private static boolean isTest = false;

    public static void main(String[] args) {
        if (System.getProperty("os.name").toLowerCase().contains("ios")) {
            if (inputMethod.equals(inputMethods.get(0))) {
                Iterator<String> ic = inputClipboard();
                Scanner scanner = new Scanner(ic);
                System.setIn(scanner.toString().getBytes());
            } else if (inputMethod.equals(inputMethods.get(1))) {
                try {
                    System.setIn(new java.io.FileInputStream("inputFile.txt"));
                } catch (java.io.FileNotFoundException e) {
                    e.printStackTrace();
                }
            }
            isTest = true;
        }

        int ret = mainFunction();
        if (ret != Integer.MAX_VALUE) {
            System.out.println(ret);
        }
    }

    private static void mainB() {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        int pp = 0;
        int na = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            char c = s.charAt(i);
            int cc = na + Character.getNumericValue(c);
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

    private static int mainFunction() {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        int pmin = 1000;
        int mmin = 0;
        s = "0" + s;
        for (int i = s.length() - 1; i >= 0; i--) {
            char c = s.charAt(i);
            int v = Character.getNumericValue(c);
            int npmin = Math.min(pmin + 10 - (v + 1), mmin + 10 - v);
            int nmmin = Math.min(pmin + v + 1, mmin + v);
            pmin = npmin;
            mmin = nmmin;
        }
        return Math.min(pmin, mmin);
    }

    private static void pa(Object v) {
        if (isTest) {
            System.out.println(v);
        }
    }

    private static Iterator<String> inputClipboard() {
        try {
            java.awt.datatransfer.Clipboard clipboard = java.awt.Toolkit.getDefaultToolkit().getSystemClipboard();
            java.awt.datatransfer.Transferable contents = clipboard.getContents(null);
            if (contents != null && contents.isDataFlavorSupported(java.awt.datatransfer.DataFlavor.stringFlavor)) {
                String inputText = (String) contents.getTransferData(java.awt.datatransfer.DataFlavor.stringFlavor);
                List<String> inputL = List.of(inputText.split("\n"));
                return inputL.iterator();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return List.of().iterator();
    }
}
