
import java.util.Scanner;
public class s592421258 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next() + sc.next();
        System.out.println(sc.next().equals(s.substring(0, s.length()/2)) || sc.next().equals(s.substring(s.length()/2)) ? "Yes" : "No");
    }
}

