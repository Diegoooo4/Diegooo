package WalletWise.Persistencia.Repository;

import WalletWise.Modelo.Transaccion;

import java.util.List;

public interface TransaccionRepository {
    void almacenar(Transaccion transaccion);
    List<Transaccion>TRANSACCION_LIST();
}
