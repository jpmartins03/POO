package curso_exercicios_modulo1;
import java.util.Scanner;
/*
 * Faça um programa para ler o valor do raio de um círculo, e depois mostrar o valor da área deste círculo com quatro 
casas decimais conforme exemplos.
Fórmula da área: area = π . raio2
Considere o valor de π = 3.14159
 */
public class ex2 {
	
	public static void main (String[] args)
	{
		Scanner sc = new Scanner(System.in);
		float r;
		double  area, pi;
		pi = 3.14159;
		System.out.printf("Digite o raio do circulo: ");
		r = sc.nextFloat();
		area = pi * (r*r);
		System.out.printf("A area desse circulo é: %.4f", area);
		sc.close();
	}

}
