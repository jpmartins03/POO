package atividades_aula_4;
import java.util.Scanner;

public class ex9 {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int [][] matriz;
		matriz = new int[3][3];
		int i, j, x, xi, xj;
		
		for(i = 0; i < 3; i ++)
		{
			for(j = 0; j < 3; j++)
			{
				System.out.printf("Digite um numero: ");
				matriz[i][j] = sc.nextInt();
			}
		}
		
		System.out.printf("Digite o valor a ser buscado: ");
		x = sc.nextInt();
		xi = -1;
		xj = -1;
		for(i = 0; i < 3; i ++)
		{
			for(j = 0; j < 3; j++)
			{
				if(matriz[i][j] == x)
				{
					xi = i;
					xj = j;
					System.out.printf("Valor encontrado na linha %d e coluna %d\n", xi, xj);
				}
			}
		}
		
		if(xi == -1)
		{
			System.out.printf("Valor nao encontrado\n");
		}
		
	}

}
