package biblioteca;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Biblioteca {
	//Atributos
	private List <Livro> livros;
	private ArrayList <Livro> emprestados;
	
	public ArrayList<Livro> getEmprestados() {
		return emprestados;
	}

	//Construtor
	public Biblioteca() {
		this.livros = new ArrayList<Livro>();
		this.emprestados = new ArrayList<Livro>();
	}
	
	void adicionarLivro(Livro novoLivro){
		livros.add(novoLivro);
	} 
	
	void emprestarLivro(Livro livro){
		System.out.println("==========================================================================================================================");
		for (int i = 0; i < livros.size(); i++) { //percorre lista de livros
			if(livro == livros.get(i)) { //procura o livro que quero emprestar
				for(int j = 0; j < emprestados.size(); j++) { //percorre a lista de emprestados
					if(livros.get(i) == emprestados.get(j)) {  //checa se o livro ja esta emprestado
						System.out.println("Livro ja emprestado");
						System.out.println("==========================================================================================================================");
						return;
					}
				}
				
				emprestados.add(livro);
				System.out.println("Voce pegou um livro emprestado");
				System.out.println("==========================================================================================================================");
				return;
			}	
		}
		System.out.println("Livro nao existe");
		System.out.println("==========================================================================================================================");
		return;
	}
	
	void devolverLivro(Livro livro) {
		System.out.println("==========================================================================================================================");
		for(int i = 0; i < emprestados.size(); i++) {//percorre lista de emprestados
			if(livro == emprestados.get(i)) {//procura o livro que quero devolver
				System.out.println("Livro Devolvido");
				emprestados.remove(i);//remove o livro dos emprestados
				return;
			}
		}
		System.out.println("Este livro nao esta sendo emprestado");
		System.out.println("==========================================================================================================================");
		return;
	}
	
	void imprimirLivros() {
		Collections.sort(livros);
		System.out.println("Estoque da Biblioteca");
		for(int i = 0; i < livros.size(); i++) { //percorre a lista de livros para imprimir cada um
			System.out.println("---------------------------------------------------------------------------------------------------------------------------");
			System.out.println(livros.get(i));
		}
	}
	
	void imprimirEmprestados() {
		System.out.println("Lista de livros emprestados: ");
		System.out.println("---------------------------------------------------------------------------------------------------------------------------");
		Collections.sort(emprestados);
		if(emprestados.size() == 0) {//se nao houver emprestados
			System.out.println("No momento nao há livros emprestados");
			System.out.println("---------------------------------------------------------------------------------------------------------------------------");
			return;
		}
		for(int i = 0; i < emprestados.size(); i++) {//se houver emprestados, percorre a lista
			System.out.println(emprestados.get(i));//imprime os emprestados
			System.out.println("---------------------------------------------------------------------------------------------------------------------------");
		}
	}
	
	void removerLivro(Livro livro) {
		livros.remove(livro);
	}
	public int compareTo(Livro livro){
		return livro.getTitulo().compareTo(livro.getTitulo()); //ordena pelo titulo
	}

	public List<Livro> getLivros() {
		return livros;
	}
}

/*Classe Biblioteca
• atributos privados ArrayList<Livro> livros, ArrayList<Livro> emprestados
• 1 construtor sem parâmetros que instancia os dois ArrayLists
• Método:
a) adicionarLivro()
permite adicionar livros no ArrayList livros
b) emprestarLivro(Livro livro)
Se o livro a ser emprestado existe no ArrayList livros e o livro ainda não foi adicionado
ao ArrayList emprestados, então adicione o livro no ArrayList emprestados.
c) devolverLivro(Livro livro)
Se o livro a ser devolvido existe no ArrayList emprestados, então remova o livro do ArrayList emprestados.
d) imprimirLivros()
imprime todos os livros em ordem alfabética por título existentes na Biblioteca
*/