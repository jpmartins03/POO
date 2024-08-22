package curso_pob_entradadedados;

import java.util.Locale;
import java.util.Scanner;

public class Main 
{
	public static void main (String[] args)
	{
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		String x;
		int y;
		double z;
		char carac;
		
		
		x = sc.next();
		y = sc.nextInt();
		z = sc.nextDouble();
		carac = sc.next().charAt(0);
		System.out.printf("voce digitou o texto: %s\n", x);
		System.out.printf("voce digitou o numero inteiro: %d\n", y);
		System.out.printf("voce digitou o numero double: %.2f\n", z);
		System.out.printf("voce digitou o caractere: %c\n", carac);
		sc.close();
	}
}
