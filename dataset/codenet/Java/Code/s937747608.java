import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();
		if(a*b >= c*d) {
			System.out.println(a*b);
		}else if(a*b <= c*d) {
			System.out.println(c*d);
		}
	}
}