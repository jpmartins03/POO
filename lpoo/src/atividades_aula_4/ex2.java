package atividades_aula_4;
import java.util.Scanner;

public class ex2 {
	
	public static void main (String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int[] array;
		array = new int[10];
		int i;
		for(i = 0; i<6; i++)
		{
			System.out.printf("Digite um numero: ");
			array[i] = sc.nextInt();
		}
		for(i = 5; i>-1; i--)
		{
			System.out.printf("Numero da posicao %d: %d\n", i, array[i]);
		}
			
	}

}
