package curso_pob_entradadedados;
import java.util.Scanner;

public class testmath {
	
	public static void main (String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int x, y, z;
		double A, B, C;
		
		System.out.printf("Digite o valor para calcular sua raiz quadrada: ");
		x = sc.nextInt();
		A = Math.sqrt(x);
		System.out.printf("A raiz quadrada de %d é: %.2f\n", x, A);
		System.out.printf("Digite o valor para calcular uma potencia (base depois expoente): ");
		x = sc.nextInt();
		y = sc.nextInt();
		B = Math.pow(x, y);
		System.out.printf("O valor da potencia e: %.2f\n", B);
		System.out.printf("Digite um numero para calcular o valor absoluto dele: ");
		z = sc.nextInt();
		C = Math.abs(z);
		System.out.printf("O valor absoluto de %d é: %f\n", z, C);
		
		sc.close();

	}
}
