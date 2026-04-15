package WalletWise.Servicio.Impl;

import WalletWise.Excepciones.MontoNegativo;
import WalletWise.Excepciones.SaldoInsuficiente;
import WalletWise.Modelo.TipoTransaccion;
import WalletWise.Modelo.Transaccion;
import WalletWise.Persistencia.Repository.TransaccionRepository;
import WalletWise.Servicio.TransaccionService;

import java.util.List;

public class TransaccionServicio implements TransaccionService {
    private TransaccionRepository transaccionRepository;

    public TransaccionServicio(TransaccionRepository transaccionRepository) {
        this.transaccionRepository = transaccionRepository;
    }

    private void validarmonto(double monto){
        if(monto<=0){
            throw new MontoNegativo(monto);
        }
    }

    private void validarSaldo(double monto){
        double balanceReal = calcularBalance();
        if (balanceReal - monto <0){
            throw new SaldoInsuficiente(balanceReal,monto);
        }
    }

    @Override
    public double calcularBalance() {
        return transaccionRepository.TRANSACCION_LIST().stream().mapToDouble(t->t.getTipo() == TipoTransaccion.INGRESO
                                                                    ? t.getMonto()
                                                                    : -t.getMonto()).sum();

    /*
     for (Transaccion t : transacciones) {
            if (t.getTipo() == TipoTransaccion.INGRESO) {
                balance += t.getMonto();
            } else {
                balance -= t.getMonto();
            }
        }
        */

    }
    @Override
    public void registrar (Transaccion transaccion){
        validarmonto(transaccion.getMonto());
        if (transaccion.getTipo() == TipoTransaccion.EGRESO){
            validarSaldo(transaccion.getMonto());
        }
        transaccionRepository.almacenar(transaccion);
    }

    @Override
    public List<Transaccion> TRANSACCION_LIST() {
        return transaccionRepository.TRANSACCION_LIST();
    }


}
