package Examen3.Persistance.repository;

import Examen3.Domain.Utils.Poliza;
import Examen3.Domain.Utils.TipoVehiculo;

import java.util.List;
import java.util.Optional;

public interface RepositoryPoliza {
    void almacenarPoliza(Poliza poliza);
    void delete(int id);
    Optional<Poliza> findById(int id);
    List<Poliza>findByTipoVehiculo(TipoVehiculo vehiculo);
    boolean existId(int id);
    List<Poliza>polizaList();
}
