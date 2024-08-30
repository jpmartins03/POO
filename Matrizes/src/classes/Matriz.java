package classes;
import java.util.Scanner;

public class Matriz {
	Scanner sc = new Scanner(System.in);
	private String nome;
	private int[][] mat;
	
	public Matriz(String nome, int linha, int coluna) {
		this.nome = nome;
		mat = new int[linha][coluna];
	}
	
	public int[][] getMat() {
		return this.mat;
	}
 	
	public void lerMatriz() {
		for(int i = 0; i < mat.length; i++) {
			for(int j = 0; j < mat[i].length; j++) {
				System.out.printf("Digite o elemento da linha %d coluna %d da matriz %s: ", i, j, this.nome);
				mat[i][j] = sc.nextInt();
			}
		}
	}
	
	public void imprimirMatriz() {
		System.out.printf("\n");
		for(int i = 0; i < mat.length; i++) {
			for(int j = 0; j < mat[i].length; j++) {
				System.out.printf("%d  ", mat[i][j]);
			}
			System.out.printf("\n");
		}
	}
	
	public void somarElementosMatriz() {
		int soma = 0;
		for(int i = 0; i < mat.length; i++) {
			for(int j = 0; j < mat[i].length; j++) {
				soma += mat[i][j];
			}
		}
		System.out.printf("Soma dos elementos da matriz %s = %d\n", this.nome, soma);
	}
	
	public void procurarElementos() {
		int x, flag = 0;
		System.out.printf("Digite o elemento a ser procurado: ");
		x = sc.nextInt();
		for(int i = 0; i < mat.length; i++) {
			for(int j = 0; j < mat[i].length; j++) {
				if(mat[i][j] == x) {
					flag = 1;
					System.out.printf("Valor %d encontrado na matriz %s linha %d coluna %d\n", x, this.nome, i, j);
					break;
				}
			}
		}
		if(flag == 0) {
			System.out.printf("Elemento nao encontrado\n");
		}
	}
	
	public static void somaMatrizes(int[][] matA, int[][] matB) {
		Matriz C = new Matriz("C", 3, 3);
		if(matA.length == matB.length)
		{
			for(int i = 0; i < matA.length; i++) {
				for(int j = 0; j < matA[i].length; j++) {
					C.mat[i][j] = matA[i][j] + matB[i][j];
				}
			}
			C.imprimirMatriz();
		}
		else {
			System.out.printf("Nao e possivel somar as matrizes\n");
		}
	}
	
}
