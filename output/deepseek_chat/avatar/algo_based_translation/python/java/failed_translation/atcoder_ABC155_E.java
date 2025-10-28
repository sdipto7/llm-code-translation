
import java.util.*;
import java.io.*;

public class atcoder_ABC155_E {
    static String[] input_methods = {"clipboard", "file", "key"};
    static int using_method = 0;
    static String input_method = input_methods[using_method];
    static final int mod = 1000000007;
    static boolean isTest = false;
    static BufferedReader reader;
    static StringTokenizer tokenizer;
    static List<String> clipboardLines;
    static int clipboardIndex = 0;
    
    static int[] IN() throws IOException {
        String line = nextLine();
        String[] parts = line.split(" ");
        int[] result = new int[parts.length];
        for (int i = 0; i < parts.length; i++) {
            result[i] = Integer.parseInt(parts[i]);
        }
        return result;
    }
    
    static void main_b() throws IOException {
        String s = nextLine();
        int pp = 0;
        int na = 0;
        String reversed = new StringBuilder(s).reverse().toString();
        for (int i = 0; i < reversed.length(); i++) {
            char c = reversed.charAt(i);
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
    
    static int main() throws IOException {
        String s = nextLine();
        int pmin = 1000;
        int mmin = 0;
        s = "0" + s;
        String reversed = new StringBuilder(s).reverse().toString();
        for (int i = 0; i < reversed.length(); i++) {
            char c = reversed.charAt(i);
            int v = Character.getNumericValue(c);
            int npmin = Math.min(pmin + 10 - (v + 1), mmin + 10 - v);
            int nmmin = Math.min(pmin + v + 1, mmin + v);
            pmin = npmin;
            mmin = nmmin;
        }
        return Math.min(pmin, mmin);
    }
    
    static void pa(Object v) {
        if (isTest) {
            System.out.println(v);
        }
    }
    
    static void input_clipboard() {
        try {
            String inputText = getClipboardContents();
            clipboardLines = Arrays.asList(inputText.split("\n"));
        } catch (Exception e) {
            clipboardLines = new ArrayList<>();
        }
    }
    
    static String getClipboardContents() throws Exception {
        return new String(java.awt.Toolkit.getDefaultToolkit().getSystemClipboard().getData(java.awt.datatransfer.DataFlavor.stringFlavor));
    }
    
    static String nextLine() throws IOException {
        if (input_method.equals("clipboard") && clipboardLines != null) {
            if (clipboardIndex < clipboardLines.size()) {
                return clipboardLines.get(clipboardIndex++);
            }
        }
        return reader.readLine();
    }
    
    public static void main(String[] args) throws IOException {
        String os = System.getProperty("os.name").toLowerCase();
        if (os.contains("ios") || os.contains("mac")) {
            if (input_method.equals(input_methods[0])) {
                input_clipboard();
            } else if (input_method.equals(input_methods[1])) {
                reader = new BufferedReader(new FileReader("inputFile.txt"));
            } else {
                reader = new BufferedReader(new InputStreamReader(System.in));
            }
            isTest = true;
        } else {
            reader = new BufferedReader(new InputStreamReader(System.in));
        }
        
        int ret = main();
        if (ret != 0) {
            System.out.println(ret);
        }
    }
}

