
public class s961772658 {
    public static void main(String[] args) {
        String s = System.console().readLine();
        String[] alphabet = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
        for (int i = 0; i < alphabet.length; i++) {
            if (alphabet[i].equals(s)) {
                System.out.println(alphabet[i + 1]);
                break;
            }
        }
    }
}

