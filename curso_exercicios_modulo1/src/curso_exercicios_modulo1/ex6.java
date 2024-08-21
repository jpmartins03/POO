package curso_exercicios_modulo1;
import java.util.Scanner;
import java.util.Locale;
/*
 * Fazer um programa que leia três valores com ponto flutuante de dupla precisão: A, B e C. Em seguida, calcule e 
mostre: 
a) a área do triângulo retângulo que tem A por base e C por altura. 
b) a área do círculo de raio C. (pi = 3.14159) 
c) a área do trapézio que tem A e B por bases e C por altura. 
d) a área do quadrado que tem lado B. 
e) a área do retângulo que tem lados A e B
 */

public class ex6 {
	
	public static void main(String[] args)
	{
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		float A, B, C;
		double pi = 3.14159, cir; 
		float tri, tra, qua, ret;
		A = sc.nextFloat();
		B = sc.nextFloat();
		C = sc.nextFloat();
		tri = (A*C)/2;
		cir = (pi * (C * C));
		tra = ((A + B)*C)/2;
		qua = B * B;
		ret = A * B;
		System.out.printf("TRIANGULO: %.3f\n", tri);
		System.out.printf("CIRCULO: %.3f\n", cir);
		System.out.printf("TRAPEZIO: %.3f\n", tra);
		System.out.printf("QUADRADO: %.3f\n", qua);
		System.out.printf("RETANGULO: %.3f\n", ret);
		sc.close();
				
	}

}
