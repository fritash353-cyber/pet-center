package exceptions;

public class AnimalSemDonoException extends RuntimeException {
    public AnimalSemDonoException(String mensagem) {
        super(mensagem);
    }
}