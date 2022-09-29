import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		for (int i=1; i<=n; i++) {
			
			int linha1 = i;
			int linha2 = i * i;
			int linha3 = i * i * i;

				System.out.printf("%d %d %d%n", linha1, linha2, linha3);
			}

		sc.close();
	}
}