package animais;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//construtor vazio da classe Cachorro nomeado de doguinho
		Cachorro doguinho = new Cachorro("Theo");
		//doguinho possui todas as informações contidas em um objeto Cachorro e em sua classe super
		doguinho.comer();
		doguinho.beber();
		doguinho.latir();
		doguinho.lamber();
		doguinho.setOssosComidos(7);
		System.out.printf("%s comeu %d ossos\n", doguinho.getNome(), doguinho.getOssosComidos());
		
		
		Gato gatinho = new Gato("Garfield");
		gatinho.miar();
		
		Dragao draco = new Dragao("Banguela");
		draco.cuspirFogo();
		draco.voar();
		draco.setRaca("Night Fury");
		System.out.printf("%s é um dragao da raca %s\n", draco.getNome(), draco.getRaca());
		
		Pombo pombinha = new Pombo("Paola");
		pombinha.voar();
		pombinha.fazerPruPru();
		pombinha.enviarCarta();
		pombinha.enviarCarta();
		
		System.out.printf("%s ja entregou %d cartas!\n", pombinha.getNome(), pombinha.getCards());
		
		pombinha.enviarCarta();
		pombinha.enviarCarta();
		
		System.out.printf("%s ja entregou %d cartas!\n", pombinha.getNome(), pombinha.getCards());
	}

}
