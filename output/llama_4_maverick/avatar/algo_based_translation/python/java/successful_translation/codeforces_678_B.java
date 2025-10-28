
public class codeforces_678_B {
    public static String leapyear(int n) {
        if ((n % 400 == 0) || (n % 4 == 0 && n % 100 != 0)) {
            return "y";
        } else {
            return "n";
        }
    }

    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        int n = scanner.nextInt();
        String d = "f";
        String ans;
        if ((n % 400 == 0) || (n % 4 == 0 && n % 100 != 0)) {
            ans = "ly";
        } else {
            ans = "nly";
        }

        while (true) {
            if ((n % 400 == 0) || (n % 4 == 0 && n % 100 != 0)) {
                switch (d) {
                    case "m":
                        d = "w";
                        n += 1;
                        break;
                    case "t":
                        d = "th";
                        n += 1;
                        break;
                    case "w":
                        d = "f";
                        n += 1;
                        break;
                    case "th":
                        d = "sa";
                        n += 1;
                        break;
                    case "f":
                        d = "s";
                        n += 1;
                        break;
                    case "sa":
                        d = "m";
                        n += 1;
                        break;
                    case "s":
                        d = "t";
                        n += 1;
                        break;
                }
            } else {
                switch (d) {
                    case "m":
                        d = "t";
                        n += 1;
                        break;
                    case "t":
                        d = "w";
                        n += 1;
                        break;
                    case "w":
                        d = "th";
                        n += 1;
                        break;
                    case "th":
                        d = "f";
                        n += 1;
                        break;
                    case "f":
                        d = "sa";
                        n += 1;
                        break;
                    case "sa":
                        d = "s";
                        n += 1;
                        break;
                    case "s":
                        d = "m";
                        n += 1;
                        break;
                }
            }

            if (d.equals("f") && ans.equals("ly") && leapyear(n).equals("y")) {
                break;
            } else if (d.equals("f") && ans.equals("nly") && leapyear(n).equals("n")) {
                break;
            }
        }
        System.out.println(n);
    }
}

