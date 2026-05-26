package Examen3.Persistance.repository.Impl;

import Examen3.Domain.Utils.Poliza;
import Examen3.Domain.Utils.TipoVehiculo;
import Examen3.Persistance.dao.DaoPoliza;
import Examen3.Persistance.repository.RepositoryPoliza;

import java.util.List;
import java.util.Optional;

public class RepositoryPolizaImpl implements RepositoryPoliza {
private final DaoPoliza daoPoliza;

    public RepositoryPolizaImpl(DaoPoliza daoPoliza) {
        this.daoPoliza = daoPoliza;
    }

    @Override
    public void almacenarPoliza(Poliza poliza) {
        daoPoliza.almacenarPoliza(poliza);
    }

    @Override
    public void delete(int id) {
        daoPoliza.delete(id);
    }

    @Override
    public Optional<Poliza> findById(int id) {
        return daoPoliza.findById(id);
    }

    @Override
    public List<Poliza> findByTipoVehiculo(TipoVehiculo vehiculo) {
        return daoPoliza.findByTipoVehiculo(vehiculo);
    }

    @Override
    public boolean existId(int id) {
        return daoPoliza.existId(id);
    }

    @Override
    public List<Poliza> polizaList() {
        return daoPoliza.polizaList();
    }
}
