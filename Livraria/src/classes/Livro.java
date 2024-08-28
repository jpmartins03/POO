package classes;

public class Livro {
	static final String EDITORA = "Panini";
	private String titulo;
	private  Autor autor;
	private int paginas;
	
	public Livro() {	
	}
	public Livro(String titulo1, Autor autor1, int paginas1) {
		this.titulo = titulo1;
		this.autor = autor1;
		this.paginas = paginas1;
	}
	//setters
	public void setTitulo(String titulo1) {
		this.titulo = titulo1;
	}
	public void setAutor(Autor autor1) {
		this.autor = autor1;
	}
	public void setPaginas(int paginas1) {
		this.paginas = paginas1;
	}
	//getters
	public String getTitulo() {
		return titulo;
	}
	public Autor getAutor() {
		return autor;
	}
	public int getPaginas() {
		return paginas;
	}
	@Override
	public String toString() {
		return "Livro [" + titulo + ", autor=" + autor + ", paginas=" + paginas + "]";
	}

}
