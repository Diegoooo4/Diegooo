package WalletWise.Persistencia.Repository.IMPL;

import WalletWise.Modelo.Transaccion;
import WalletWise.Persistencia.DAO.TransaccionDAO;
import WalletWise.Persistencia.Repository.TransaccionRepository;

import java.util.List;

public class TransaccionRepositoryImpl implements TransaccionRepository {
    private TransaccionDAO transaccionDAO;

    public TransaccionRepositoryImpl(TransaccionDAO transaccionDAO) {
        this.transaccionDAO = transaccionDAO;
    }

    @Override
    public void almacenar(Transaccion transaccion) {
        transaccionDAO.almacenar(transaccion);
    }

    @Override
    public List<Transaccion> TRANSACCION_LIST() {
        return transaccionDAO.TRANSACCION_LIST();
    }
}
