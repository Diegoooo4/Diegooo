package Examen3.Domain.Exception;

public class PersistenciaException extends RuntimeException {
    public PersistenciaException(String message) {
        super(message);
    }
}
