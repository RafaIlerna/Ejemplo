import java.util.Scanner;
public class ImprimirX {

	public static void main(String[] args) {
		System.out.println("Dame un numero y are una cosita");
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
<<<<<<< Updated upstream
		for( int i = 0; i < n; n-- ) {
			for( int j = n; j > i; j-- )
			System.out.print(n);
			System.out.println();
//			Respuesta
/*		for( int i = 1; i <= n; i++ ) {
			for( int j = 1; j <= i; j++ )
				System.out.print(i);
=======
		for( int i = 1; i <= n; i++ ) {
			for( int j = 1; j <= n - i; j++ )
				System.out.print(" "); 
			for( int j = 1; j <= 2 * i - 1; j++) //Esto creara una piramide
				System.out.print("*");
>>>>>>> Stashed changes
			System.out.println();
		}*/
		}	
	}
}