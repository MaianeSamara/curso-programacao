import java.util.Locale;
import java.util.Scanner;

public class Main {


	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int A, B, C, D, diferen�a;
		
		A = sc.nextInt();
		B = sc.nextInt();
		C = sc.nextInt();
		D = sc.nextInt();
		
		diferen�a = A * B - C * D;

		System.out.println("DIFEREN�A = " + diferen�a);

		sc.close();
		
	}
}
