package DevVideos;

public class Filme extends Video{
	private String audio;
	private String legenda;
	
	public Filme(String nome) {
		super(nome);
		this.audio = "ing";
		this.legenda = "noone";

	}

	@Override
	public void play() {
		System.out.println("Play: "+toString());
	}
	
	public void play(String audio) {
		this.audio = audio;
		System.out.println("Play: "+toString());
	}
	
	public String toString() {
		String info = String.format("Filme %s (audio %s, legenda %s)",getNome(), audio, legenda);
		return info;
	}
}
