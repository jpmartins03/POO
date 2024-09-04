package biblioteca;

import java.util.ArrayList;

public abstract class Livro implements Comparable <Livro>{
	//Atributos
	protected String titulo;
	protected String isbn;
	protected ArrayList <Autor> autores;
	
	//Construtor
	public Livro(String titulo, String isbn) {
		this.titulo = titulo;
		this.isbn = isbn;
		this.autores = new ArrayList<Autor>();
	}
	
	void adicionarAutor(Autor autor){
		autores.add(autor);
	}
	
	abstract double getPreco();
	
	public String getTitulo() {
		return this.titulo;
	}
}
/*lasse Livro (Abstrata)
• atributos protected String titulo, String isbn, ArrayList<Autor> autores
• 1 construtor com os parâmetros (String titulo, String isbn)
no construtor será instanciado o ArrayList<>() autores;
• Método:
a) void adicionarAutor(Autor autor)
adiciona o autor aor arryList autores
b) abstract double getPreco();*/