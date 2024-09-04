package biblioteca;

public class Ebook extends Livro{
	//Atributos
	private double preco;

	//Construtor
	public Ebook(String titulo, String isbn, double preco) {
		super(titulo, isbn);
		this.preco = preco;
	}
	
	protected double getPreco() {
		return this.preco;
	}
	
	@Override
	public String toString() {
		return "Ebook\nTitulo = " + titulo + "\nPreco = " + preco +"\nisbn = " + isbn + "\nAutores = " + autores;
	}
	@Override
	public int compareTo(Livro o) {
		return this.titulo.compareTo(o.titulo);
	}
}

/*Classe Ebook
• Estende a classe Livro e tem como atributo privado double preco
• 1 construtor com os parâmetros (String titulo, String isbn, double preco)
• Métodos:
a) protected double getPreco() que retorna o preco;
b) @Override
compareTo que retorna a comparação dos ebooks pelo titulo
c) @Override
public String toString()
retorna uma String com os atributos do Ebook*/