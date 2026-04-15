package WalletWise.Persistencia.DAO.IMPL;

import WalletWise.Modelo.Transaccion;
import WalletWise.Persistencia.DAO.TransaccionDAO;

import java.util.ArrayList;
import java.util.List;

public class TransaccionDaoMemoria implements TransaccionDAO {
    private List<Transaccion>transaccions = new ArrayList<>();

    @Override
    public void almacenar(Transaccion transaccion) {
        transaccions.add(transaccion);
    }

    @Override
    public List<Transaccion> TRANSACCION_LIST() {
        return transaccions;
    }
}
