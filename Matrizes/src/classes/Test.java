package classes;

public class Test {

	public static void main(String[] args) {
		Matriz A = new Matriz("A", 3, 3);
		Matriz B = new Matriz("B", 3, 3);
		A.lerMatriz();
		A.imprimirMatriz();
		A.somarElementosMatriz();
		A.procurarElementos();
		B.lerMatriz();
		B.imprimirMatriz();
		Matriz.somaMatrizes(A.getMat(), B.getMat());
		
		
		
		

	}

}
