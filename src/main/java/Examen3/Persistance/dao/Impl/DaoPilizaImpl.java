package Examen3.Persistance.dao.Impl;

import Examen3.Domain.Utils.Poliza;
import Examen3.Domain.Utils.TipoVehiculo;
import Examen3.Persistance.dao.DaoPoliza;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class DaoPilizaImpl implements DaoPoliza {
    List<Poliza>polizas= new ArrayList<>();

    @Override
    public void almacenarPoliza(Poliza poliza) {
    polizas.add(poliza);
    }

    @Override
    public void delete(int id) {
        polizas.remove(id);
    }

    @Override
    public Optional<Poliza> findById(int id) {
    return polizas.stream().filter(poliza -> poliza.getId()==id).findFirst();
    }

    @Override
    public boolean existId(int id) {
        return polizas.stream().anyMatch(poliza -> poliza.getId()==id);
    }

    @Override
    public List<Poliza> findByTipoVehiculo(TipoVehiculo vehiculo) {
        return polizas.stream().filter(poliza -> poliza.getTipoVehiculo()==vehiculo).toList();
    }

    @Override
    public List<Poliza> polizaList() {
        return polizas;
    }

    @Override
    public void save() {

    }
}
