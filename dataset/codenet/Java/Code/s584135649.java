import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int i=0;
		
		for(i=1;i<=5;i++) {
			int n = sc.nextInt();
			if(n==0) {
				break;
			}
		}
		
		System.out.println(i);
	}
}
