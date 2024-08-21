package curso_exercicios_modulo1;
import java.util.Scanner;
/*
 * Fazer um programa que leia o número de um funcionário, seu número de horas trabalhadas, o valor que recebe por 
hora e calcula o salário desse funcionário. A seguir, mostre o número e o salário do funcionário, com duas casas 
decimais
 */
public class ex4 {
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int num, hour;
		float salario, totalSalario;
		
		num = sc.nextInt();
		hour = sc.nextInt();
		salario = sc.nextFloat();
		
		totalSalario = hour*salario;
		
		System.out.printf("NUMBER = %d\n", num);
		System.out.printf("SALARY = U$%.2f\n", totalSalario);
		sc.close();
		
	}

}
