package WalletWise.Servicio;

import WalletWise.Modelo.Transaccion;

import java.util.List;

public interface TransaccionService {
    void registrar (Transaccion transaccion) throws IllegalAccessException;
    double calcularBalance();
    List<Transaccion>TRANSACCION_LIST();
}
