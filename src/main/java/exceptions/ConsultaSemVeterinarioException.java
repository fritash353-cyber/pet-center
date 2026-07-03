package exceptions;

public class ConsultaSemVeterinarioException extends RuntimeException {
    public ConsultaSemVeterinarioException(String mensagem) {
        super(mensagem);
    }
}