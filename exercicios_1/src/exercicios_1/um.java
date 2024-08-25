package exercicios_1;
import java.util.Scanner;
/*
 * Faça um programa para ler dois valores inteiros, e depois mostrar na tela a soma desses números com uma 
mensagem explicativa, conforme exemplos.
 */
public class um {
	
	public static void main (String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int x, y, A;
		
		System.out.printf("Digite dois valores\n");
		x = sc.nextInt();
		y = sc.nextInt();
		A = x + y;
		System.out.printf("A soma desses valores é: %d\n", A);
		sc.close();
		
		
		
	}

}
