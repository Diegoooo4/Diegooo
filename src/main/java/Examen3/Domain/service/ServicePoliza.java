package Examen3.Domain.service;

import Examen3.Domain.Utils.Poliza;
import Examen3.Domain.Utils.TipoVehiculo;

import java.util.List;

public interface ServicePoliza {
    void create(int id,String titular, TipoVehiculo vehiculo,double cuotaMensual);
    void delete(int id);
    /*void update(double cuotaMensual);*/
    List<Poliza> findByTipoVehiculo(TipoVehiculo vehiculo);
    double PrimaAnualTotal();
    List<Poliza>polizaList();


}
