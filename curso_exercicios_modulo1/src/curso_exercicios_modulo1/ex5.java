package curso_exercicios_modulo1;
import java.util.Scanner;
import java.util.Locale;
/*
 * Fazer um programa para ler o código de uma peça 1, o número de peças 1, o valor unitário de cada peça 1, o 
código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2. Calcule e mostre o valor a ser pago.
 */
public class ex5 {
	
	public static void main(String[] args)
	{
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int cod1, qtd1, cod2, qtd2;
		float price1, price2, totalvalue;
		cod1 = sc.nextInt();
		qtd1 = sc.nextInt();
		price1 = sc.nextFloat();
		cod2 = sc.nextInt();
		qtd2 = sc.nextInt();
		price2 = sc.nextFloat();
		totalvalue = (qtd1 * price1) + (qtd2 * price2);
		System.out.printf("VALOR A PAGAR: R$ %.2f", totalvalue);
		sc.close();
		
		
	}

}
