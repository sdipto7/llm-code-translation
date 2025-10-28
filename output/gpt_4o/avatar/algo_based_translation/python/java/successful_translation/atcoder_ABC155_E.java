
import java.io.*;
import java.util.*;

public class atcoder_ABC155_E {

    private static final List<String> inputMethods = Arrays.asList("clipboard", "file", "key");
    private static final int usingMethod = 0;
    private static final String inputMethod = inputMethods.get(usingMethod);
    private static final int mod = 1000000007;
    private static boolean isTest = false;

    public static void main(String[] args) {
        if (System.getProperty("os.name").equals("iOS")) {
            if (inputMethod.equals(inputMethods.get(0))) {
                InputStream ic = inputClipboard();
                System.setIn(ic);
            } else if (inputMethod.equals(inputMethods.get(1))) {
                try {
                    System.setIn(new FileInputStream("inputFile.txt"));
                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                }
            }
            isTest = true;
        }

        Integer result = mainFunction();
        if (result != null) {
            System.out.println(result);
        }
    }

    private static Integer mainFunction() {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
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
        scanner.close();
        return Math.min(pmin, mmin);
    }

    private static void pa(int v) {
        if (isTest) {
            System.out.println(v);
        }
    }

    private static InputStream inputClipboard() {
        // Placeholder for clipboard input; Java does not have a standard clipboard library.
        // This function needs to be implemented with a proper clipboard handling library if needed.
        return new ByteArrayInputStream("".getBytes());
    }
}

