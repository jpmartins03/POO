package atividades_aula_4;
import java.util.Scanner;


public class ex6 {
	
	public static void main (String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		int i, j = 0, x, y;
		int[][] array;
		
		System.out.printf("Digite um numero: ");
		
		x = sc.nextInt();
		int maxDigits = Integer.toString(x * x).length();
		y = 1;
		array = new int[x][x];
		
		for(i = 0; i < x; i++)
		{
			for(j = 0; j < x; j ++)
			{
				array[i][j] = y;
				y++;
			}
		}	
	
		for(i = 0; i < x; i++)
		{
			for(j = 0; j < x; j ++)
			{
				System.out.printf("%" + maxDigits + "d   ", array[i][j]);
			}
			System.out.printf("\n");
		}
	
	}
}
