package biblioteca;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		Biblioteca biblioteca = new Biblioteca();
        Orcamento orcamento1 = new Orcamento();
        Orcamento orcamento2 = new Orcamento();
        Orcamento orcamento3 = new Orcamento();
        
		Autor autor1 = new Autor("J.K. Rowling", "jkrowling@gmail.com", "USA");
        Autor autor2 = new Autor("George R.R. Martin", "grrmartin@example.com", "USA");
        Autor autor3 = new Autor("J.R.R. Tolkien", "jrrtolkien@example.com", "UK");
        Autor autor4 = new Autor("Agatha Christie", "achristie@example.com", "UK");
        Autor autor5 = new Autor("Stephen King", "sking@example.com", "USA");
        Autor autor6 = new Autor("Isaac Asimov", "iasimov@example.com", "USA");
        Autor autor7 = new Autor("Arthur C. Clarke", "acclarke@example.com", "UK");
        Autor autor8 = new Autor("H.G. Wells", "hg.wells@example.com", "UK");
        Autor autor9 = new Autor("Mary Shelley", "mshelley@example.com", "UK");
        Autor autor10 = new Autor("Edgar Allan Poe", "eapoe@example.com", "USA");
        Autor autor11 = new Autor("Mark Twain", "mtwain@example.com", "USA");
        Autor autor12 = new Autor("F. Scott Fitzgerald", "fscott@example.com", "USA");

        LivroFisico livro1 = new LivroFisico("Harry Potter and the Philosopher's Stone", "123-456-789", 59.90);
        LivroFisico livro2 = new LivroFisico("A Game of Thrones", "987-654-321", 49.90);
        LivroFisico livro3 = new LivroFisico("The Hobbit", "111-222-333", 39.90);
        LivroFisico livro4 = new LivroFisico("Murder on the Orient Express", "444-555-666", 29.90);
        LivroFisico livro5 = new LivroFisico("The Shining", "777-888-999", 45.90);
        LivroFisico livro6 = new LivroFisico("Foundation", "000-111-222", 55.90);

        Ebook ebook1 = new Ebook("2001: A Space Odyssey", "333-444-555", 19.90);
        Ebook ebook2 = new Ebook("The War of the Worlds", "666-777-888", 9.90);
        Ebook ebook3 = new Ebook("Frankenstein", "999-000-111", 14.90);
        Ebook ebook4 = new Ebook("The Complete Tales and Poems of Edgar Allan Poe", "222-333-444", 24.90);
        Ebook ebook5 = new Ebook("The Adventures of Tom Sawyer", "555-666-777", 12.90);
        Ebook ebook6 = new Ebook("The Great Gatsby", "888-999-000", 18.90);
        
        // Adicionando autores aos livros
        livro1.adicionarAutor(autor1);
        livro2.adicionarAutor(autor2);
        livro3.adicionarAutor(autor3);
        livro4.adicionarAutor(autor4);
        livro5.adicionarAutor(autor5);
        livro6.adicionarAutor(autor6);
        ebook1.adicionarAutor(autor7);
        ebook2.adicionarAutor(autor8);
        ebook3.adicionarAutor(autor9);
        ebook4.adicionarAutor(autor10);
        ebook5.adicionarAutor(autor11);
        ebook6.adicionarAutor(autor12);
        

        // Adicionando livros à biblioteca
        biblioteca.adicionarLivro(livro1);
        biblioteca.adicionarLivro(livro2);
        biblioteca.adicionarLivro(livro3);
        biblioteca.adicionarLivro(livro4);
        biblioteca.adicionarLivro(livro5);
        biblioteca.adicionarLivro(livro6);
        biblioteca.adicionarLivro(ebook1);
        biblioteca.adicionarLivro(ebook2);
        biblioteca.adicionarLivro(ebook3);
        biblioteca.adicionarLivro(ebook4);
        biblioteca.adicionarLivro(ebook5);
        biblioteca.adicionarLivro(ebook6);

        // Adicionando livros aos pedidos de compras
        orcamento1.adicionarLivro(livro1);
        orcamento1.adicionarLivro(ebook1);
        orcamento2.adicionarLivro(livro2);
        orcamento2.adicionarLivro(ebook2);
        orcamento3.adicionarLivro(livro3);
        orcamento3.adicionarLivro(ebook3);
        
        int option = 0;
        boolean livroEncontrado = false;
        Orcamento orcamentoManual = new Orcamento();
        try {
        	while(option != 9) {
        	
	        	System.out.println("\nSelecione uma opcao:\n");
	        	System.out.println("1 - Lista de livros na biblioteca");
	        	System.out.println("2 - Lista de livros emprestados");
	        	System.out.println("3 - Listar o Pedido de Compra com o valor total");
	        	System.out.println("4 - Adicionar livro ao orcamento");
	        	System.out.println("5 - Emprestar livro");
	        	System.out.println("6 - Devolver livro");
	        	System.out.println("7 - Adicionar livro");
	        	System.out.println("8 - Remover livro");
	        	System.out.println("9 - sair");
	        	System.out.printf("\nDigite a opcao desejada: ");
        	
	        	option = sc.nextInt();
	        	sc.nextLine();
	        	switch(option){
	        		
	        		case 1:
	        			System.out.println("==========================================================================================================================");
	        			biblioteca.imprimirLivros();
	        			System.out.println("==========================================================================================================================");
	        			break;
	        		
	        		case 2:
	        			System.out.println("==========================================================================================================================");
	        			biblioteca.imprimirEmprestados();
	        			System.out.println("==========================================================================================================================");
	        			break;
	        			
	        		case 3:
	        			System.out.println("Selecione um orcamento: ");
	        			System.out.println("1 - Orcamento Predefinido 1");
	        			System.out.println("2 - Orcamento Predefinido 2");
	        			System.out.println("3 - Orcamento Predefinido 3");
	        			System.out.println("4 - Orcamento Manual");
	        			
	        			int selecOrcamento = sc.nextInt();
	        			
	        			if(selecOrcamento == 1) {
	        				orcamento1.listarPedidos();
	        			}
	        			else if(selecOrcamento == 2) {
	        				orcamento2.listarPedidos();
	        			}
	        			else if(selecOrcamento == 3) {
	        				orcamento3.listarPedidos();
	        			}
	        			else if(selecOrcamento == 4) {
	        				orcamentoManual.listarPedidos();
	        			}
	        			else {
	        				System.out.println("Opcao invalida");
	        			}
	        			
	        			break;
	        			
	        		case 4:
	        			System.out.printf("Digite o isbn do livro desejado: ");
	        			String isbn1 = sc.next();
	        			List <Livro> livros = biblioteca.getLivros();
	        			
	        			for(int i = 0; i < livros.size(); i++) {
	        				Livro livroComprado = livros.get(i);
	        				if(isbn1.equals(livroComprado.isbn)) {
	        					orcamentoManual.adicionarLivro(livroComprado);
	        					System.out.println("==========================================================================================================================");
	        					System.out.println("Livro adicionado ao orcamento");
	        					System.out.println("==========================================================================================================================");
	        					livroEncontrado = true;
	        					break;
	        				}
	        			}
	        			if(!livroEncontrado) {
	        				System.out.println("==========================================================================================================================");
	        				System.out.println("Livro nao encontrado");
	        				System.out.println("==========================================================================================================================");
	        			}
	        			break;
	        			
	        		case 5:
	        			System.out.printf("Digite o isbn do livro desejado: ");
	        			String isbn2 = sc.next();
	        			List <Livro> emprestados = biblioteca.getLivros();
	        			
	        			for(int i = 0; i < emprestados.size(); i++) {
	        				Livro livroEmprestado = emprestados.get(i);
	        				if(isbn2.equals(livroEmprestado.isbn)) {
	        					biblioteca.emprestarLivro(livroEmprestado);
	        					livroEncontrado = true;
	        					break;
	        				}
	        			}
	        			if(!livroEncontrado) {
	        				System.out.println("==========================================================================================================================");
	        				System.out.println("Livro nao encontrado");
	        				System.out.println("==========================================================================================================================");
	        			}
	        			break;
	        			
	        		case 6:
	        			System.out.printf("Digite o isbn do livro que deseja devolver: ");
	        			String isbn3 = sc.next();
	        			ArrayList <Livro> devolvidos = biblioteca.getEmprestados();
						System.out.println("==========================================================================================================================");
	
	        			
	        			for(int i = 0; i < devolvidos.size(); i++) {
	        				Livro livroEmprestado = devolvidos.get(i);
	        				if(isbn3.equals(livroEmprestado.isbn)) {
	        					biblioteca.devolverLivro(livroEmprestado);
	        					livroEncontrado = true;
	        					System.out.println("==========================================================================================================================");
	
	        					break;
	        				}
	        			}
	        			if(!livroEncontrado) {
	        				System.out.println("Livro nao encontrado");
	        			}
						System.out.println("==========================================================================================================================");
	
	        			break;
	        			
	        			
	        		case 7:
	        			System.out.println("Digite 1 para livro fisico e 2 para ebook");
	        			int type = sc.nextInt();
	        			sc.nextLine();
						System.out.println("==========================================================================================================================");
	
	        			if(type != 1 && type != 2) {
	        				System.out.println("Opcao invalida");
	    					System.out.println("==========================================================================================================================");
	
	        				break;
	        			}
	        			
	        			
	        			System.out.printf("Digite o titulo: ");
	        			String titulo = sc.nextLine();
	        			
	        			System.out.printf("\nDigite o isbn: ");
	        			String isbn4 = sc.nextLine();
	        			
	        			System.out.printf("Digite o preco: ");
	        			Double preco = sc.nextDouble();
	        			sc.nextLine();
	        			
	        			System.out.printf("\nDigite o nome do autor: ");
	        			String autor = sc.nextLine();
	        			
	        			System.out.printf("\nDigite o email do autor: ");
	        			String email = sc.nextLine();
	        			
	        			System.out.printf("\nDigite a instituicao do autor: ");
	        			String instituicao = sc.nextLine();
	        			
	        			Autor newAutor = new Autor(autor, email, instituicao);
	        			
	        			if(newAutor.getEmail() == null) {
	        				break;
	        			}
	        			
	        			if(type == 1) {
	        				LivroFisico novoLivro = new LivroFisico(titulo, isbn4, preco);
	        				novoLivro.adicionarAutor(newAutor);
	        				biblioteca.adicionarLivro(novoLivro);
	        			}
	        			else{
	        				Ebook novoLivro = new Ebook(titulo, isbn4, preco);
	        				novoLivro.adicionarAutor(newAutor);
	        				biblioteca.adicionarLivro(novoLivro);
	        			}
	        			System.out.println("Livro adicionado ao sistema com sucesso!");
						System.out.println("==========================================================================================================================");
	
	        			break;
	        			
	        		case 8:
	        			System.out.printf("Digite o isbn do livro desejado: ");
	        			String isbn5 = sc.next();
	        			List <Livro> removidos = biblioteca.getLivros();
						System.out.println("==========================================================================================================================");
	
	        			
	        			for(int i = 0; i < removidos.size(); i++) {
	        				Livro livroRemovido = removidos.get(i);
	        				if(isbn5.equals(livroRemovido.isbn)) {
	        					biblioteca.removerLivro(livroRemovido);
	        					System.out.println("Livro removido");
	        					System.out.println("==========================================================================================================================");
	
	        					livroEncontrado = true;
	        					break;
	        				}
	        			}
	        			if(!livroEncontrado) {
	        				System.out.println("Livro nao encontrado");
	    					System.out.println("==========================================================================================================================");
	                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     
	        			}
	        			break;
	        			
	        		case 9:
	        			System.out.println("Good bye!");
	        			break;
	        			
	        		
	        			
	        		default:
	        			System.out.println("Opcao invalida");
	        			break;
	        		}
	    
	        	//colocar comentarios
	        		
        	}
        }catch(Exception erro) {
    		System.out.println("Entrada invalida");
        }
        		
	}

}

/*
Classe Main
• Possui o método main
• Pode deixar algusn objetos já criados(mínimo): 12 Autores, 6 Livros, 6 Ebooks, 3 pedidos de compras
• Usar exceção para tratar entradas inválidas para os valores do tipo numéricos.
• Saídas:
1 Listar todos os livros da Biblioteca
2 Listar todos os livros Emprestados
3 Listar o Pedido de Compra com o valor total
*/