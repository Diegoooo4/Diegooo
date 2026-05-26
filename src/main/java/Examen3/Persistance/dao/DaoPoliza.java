package Examen3.Persistance.dao;

import Examen3.Domain.Utils.Poliza;
import Examen3.Domain.Utils.TipoVehiculo;

import java.util.List;
import java.util.Optional;

public interface DaoPoliza {
    void almacenarPoliza(Poliza poliza);
    void delete(int id);
    Optional<Poliza> findById(int id);
    boolean existId(int id);
    List<Poliza>findByTipoVehiculo(TipoVehiculo vehiculo);
    List<Poliza>polizaList();
    void save();


}
