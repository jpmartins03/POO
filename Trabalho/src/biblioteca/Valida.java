package biblioteca;

public interface Valida {
	boolean validarEmail(String email);
}

/*Este método deverá validar o email sempre que for cadastrar um novo Autor.
Se o valor retornado for false, então deverá solicitar um novo email, que também deverá
ser validado.*/