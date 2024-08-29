package atividades_ava;
import java.util.Scanner;

public class ava_1 {
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int x, y, resto;
		String bin = "";
		x = sc.nextInt();
		y = x;
		if(x ==0)
		{
			bin += 0;
		}
		else
		{
			while(x != 0)
			{
				resto = x%2;
				x = x/2;
				bin = resto+bin;
			}
		}
	
		
		System.out.printf("%d = %s\n", y, bin);
		
	}

}
