package WalletWise.Excepciones;

public class SaldoInsuficiente extends RuntimeException {
    public SaldoInsuficiente(double balanceReal, double monto) {
        super("Saldo insuficiente: "+balanceReal+" "+monto);
    }
}
