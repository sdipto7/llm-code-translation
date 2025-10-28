
import java.util.*;
import java.awt.datatransfer.*;
import java.awt.Toolkit;
import java.io.*;

public class atcoder_ABC155_E {
    static String[] input_methods = {"clipboard", "file", "key"};
    static int using_method = 0;
    static String input_method = input_methods[using_method];
    static Scanner sc = new Scanner(System.in);
    static int mod = 1000000007;
    static boolean isTest = false;

    static void pa(Object v) {
        if (isTest) {
            System.out.println(v);
        }
    }

    static class InputClipboard implements Iterator<String> {
        private List<String> lines;
        private int index = 0;

        InputClipboard() {
            try {
                Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
                String inputText = (String) clipboard.getData(DataFlavor.stringFlavor);
                lines = Arrays.asList(inputText.split("\n"));
            } catch (Exception e) {
                lines = new ArrayList<>();
            }
        }

        public boolean hasNext() {
            return index < lines.size();
        }

        public String next() {
            return lines.get(index++);
        }
    }

    static int[] IN() {
        String[] parts = sc.nextLine().split(" ");
        int[] res = new int[parts.length];
        for (int i = 0; i < parts.length; i++) {
            res[i] = Integer.parseInt(parts[i]);
        }
        return res;
    }

    static void main_b() {
        String s = sc.nextLine();
        int pp = 0;
        int na = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(s.length() - 1 - i);
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

    static int main() {
        String s = sc.nextLine();
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

    public static void main(String[] args) throws Exception {
        if (System.getProperty("os.name").toLowerCase().contains("ios")) {
            if (input_method.equals(input_methods[0])) {
                InputClipboard ic = new InputClipboard();
                sc = new Scanner(new IteratorInputStream(ic));
            } else if (input_method.equals(input_methods[1])) {
                sc = new Scanner(new File("inputFile.txt"));
            }
            isTest = true;
        }
        int ret = main();
        if (ret != -1) {
            System.out.println(ret);
        }
    }

    static class IteratorInputStream extends InputStream {
        private Iterator<String> iterator;
        private byte[] buffer;
        private int index = 0;

        IteratorInputStream(Iterator<String> iterator) {
            this.iterator = iterator;
        }

        public int read() {
            if (buffer == null || index >= buffer.length) {
                if (!iterator.hasNext()) {
                    return -1;
                }
                String next = iterator.next();
                buffer = next.getBytes();
                index = 0;
            }
            return buffer[index++];
        }
    }
}

