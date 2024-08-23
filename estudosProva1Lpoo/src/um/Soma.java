package um;

public class Soma {
	
	//constructor
	public Soma(int[][] matriz) {
	}

	public int SomaAcimaPrincipal(int[][]M) {
		int i, j, sum = 0, aux = 0;
		for(i = 0; i < 4; i++) {
			aux ++;
			for(j = aux; j < 4; j++) {
				sum += M[i][j];
			}
		}
		for(i = 0; i < 4; i++) {
			for(j = 0; j < 4; j++) {
				System.out.printf("    %d", M[i][j]);
			}
			System.out.printf("\n");
		}
		return sum;
	}
	public int SomaAbaixoPrincipal(int[][]M) {
		int i, j, sum = 0, aux = 0;			
		for(i = 1; i < 4; i++) {
			aux ++;
			for(j = 0; j < aux; j++) {
				sum += M[i][j];
				}
		}
		for(i = 0; i < 4; i++) {
			for(j = 0; j < 4; j++) {
				System.out.printf("    %d", M[i][j]);
			}
			System.out.printf("\n");
		}
		return sum;
	}
	public int SomaAbaixoSecundaria(int[][]M) {
		int i, j, sum = 0, aux = 4;
		for(i = 1; i < 4; i++) {
			aux --;
			for(j = aux; j < 4; j++)
			{
				sum += M[i][j];
			}
		}
		for(i = 0; i < 4; i++) {
			for(j = 0; j < 4; j++) {
				System.out.printf("    %d", M[i][j]);
			}
			System.out.printf("\n");
		}
		return sum;
	}
	public int SomaAcimaSecundaria(int[][]M) {
		int i, j, sum = 0, aux = 4;
		for(i = 0; i < 4; i++) {
			aux --;
			for(j = 0; j < aux; j++)
			{
				sum += M[i][j];
			}
		}
		for(i = 0; i < 4; i++) {
			for(j = 0; j < 4; j++) {
				System.out.printf("    %d", M[i][j]);
			}
			System.out.printf("\n");
		}
		return sum;
	}
	
}
