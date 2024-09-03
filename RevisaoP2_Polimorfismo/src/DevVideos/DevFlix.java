package DevVideos;


//polimorfismo --> Metodos com mesmo nome, mas com comportamentos diferentes.
// 1 - Sobreposição
// 2 - Sobrecarga
public class DevFlix {
	public static void main(String[] args) {
		Video video = new Video("devlog");
		video.play();
		Filme filme = new Filme("pixels");
		filme.play();
		filme.play("pt-br");
	}
	
	
}
