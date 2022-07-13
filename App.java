import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner (System.in);
		
		System.out.println("Digite um numero: ");
		int n = sc.nextInt();
		
		int [][] mat = new int [1][n];
		
		for (int i=1; i<=n;i++) {
			System.out.println();
			for (int j=1; j <= i; j++) {
				System.out.print(j);
				
			}
		}
		sc.close();
    }
}
