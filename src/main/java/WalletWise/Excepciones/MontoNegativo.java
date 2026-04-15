package WalletWise.Excepciones;

public class MontoNegativo extends RuntimeException {
    public MontoNegativo(double monto) {
        super("El monto tiene que ser positivo"+monto);
    }
}
