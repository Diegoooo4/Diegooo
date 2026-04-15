package WalletWise.Persistencia.DAO;

import WalletWise.Modelo.Transaccion;

import java.util.List;

public interface TransaccionDAO {
    void almacenar(Transaccion transaccion);
    List<Transaccion>TRANSACCION_LIST();
}
