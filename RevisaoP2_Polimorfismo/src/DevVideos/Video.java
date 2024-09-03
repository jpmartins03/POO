package DevVideos;


//classe que representa um video qualquer.

public class Video {
	private String nome;
	
	public void play() {
		System.out.println("Play: video qualquer");
		
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Video(String nome) {
		super();
		this.nome = nome;
	}
}
