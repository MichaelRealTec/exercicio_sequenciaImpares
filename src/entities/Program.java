package entities;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		// sequenciaImpares
		int x;
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o valor de X: ");
		x = sc.nextInt();
		
		for(int i = 1; i <= x; i++) {
			System.out.println(i);
			i = i + 1;
		}
		sc.close();

	}

}
