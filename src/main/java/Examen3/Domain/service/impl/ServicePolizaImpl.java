package Examen3.Domain.service.impl;

import Examen3.Domain.Exception.PersistenciaException;
import Examen3.Domain.Utils.Poliza;
import Examen3.Domain.Utils.TipoVehiculo;
import Examen3.Domain.service.ServicePoliza;
import Examen3.Persistance.repository.RepositoryPoliza;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class ServicePolizaImpl implements ServicePoliza {
    private final RepositoryPoliza repositoryPoliza;
    //int idCount = 1 o 0 y cuando lo creas idCount++ si es 0 o ++idCount si es 1

    public ServicePolizaImpl(RepositoryPoliza repositoryPoliza) {
        this.repositoryPoliza = repositoryPoliza;
    }

    @Override
    public void create(int id,String titular, TipoVehiculo vehiculo,double cuotaMensual)throws PersistenciaException {
        if(cuotaMensual<0|| repositoryPoliza.existId(id)){
            throw new PersistenciaException("El id no debe de existir y la cuota debe ser mayor que 0");
        }
        repositoryPoliza.almacenarPoliza(new Poliza(id,titular,vehiculo,cuotaMensual));
        System.out.println("Cliente creado");
    }

    @Override
    public void delete(int id) throws PersistenciaException{
        if (!repositoryPoliza.existId(id)){
            throw new PersistenciaException("La poliza tiene que existir");
        }
        repositoryPoliza.delete(id);
    }

    /*@Override
    public void update(double cuotaMensual) {
        if (repositoryPoliza.existId(){
            throw new PersistenciaException("Teiene que existir");
        }

       if(poliza==null){
           throw new PersistenciaException("La poliza no debe de ser nula");
       }
       if (poliza.getCuotaMensual()<0){
           throw new PersistenciaException("La cuota tiene que ser superior a 0");
       }

       setCuotaMensual(cuotaMensual);
    }*/

    @Override
    public List<Poliza>findByTipoVehiculo(TipoVehiculo vehiculo){
        List<Poliza>polizaList=repositoryPoliza.findByTipoVehiculo(vehiculo);
        if(polizaList.isEmpty())
            throw new PersistenciaException("No hay polizass para ese vehiculo");

        return polizaList;
    }

    @Override
    public double PrimaAnualTotal() {
        return repositoryPoliza.polizaList().stream().mapToDouble(p->p.getCuotaMensual()*12).sum();
    }

    @Override
    public List<Poliza> polizaList() {
        return repositoryPoliza.polizaList();
    }
}
