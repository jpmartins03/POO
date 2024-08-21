package curso_exercicios_modulo1;
import java.util.Scanner;
/*
 * Fazer um programa para ler quatro valores inteiros A, B, C e D. A seguir, calcule e mostre a diferença do produto 
de A e B pelo produto de C e D segundo a fórmula: DIFERENCA = (A * B - C * D)
 */
public class ex3 {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int A, B, C, D, X;
		System.out.printf("Digite quatro inteiros: ");
		A = sc.nextInt();
		B = sc.nextInt();
		C = sc.nextInt();
		D = sc.nextInt();
		X = (A*B-C*D);
		System.out.printf("O resultado é: %d\n", X);
		sc.close();
		
	}
}
