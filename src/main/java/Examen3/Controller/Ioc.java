package Examen3.Controller;

import Examen3.Domain.service.ServicePoliza;
import Examen3.Domain.service.impl.ServicePolizaImpl;
import Examen3.Persistance.dao.DaoPoliza;
import Examen3.Persistance.dao.Impl.DaoPilizaImpl;
import Examen3.Persistance.repository.Impl.RepositoryPolizaImpl;
import Examen3.Persistance.repository.RepositoryPoliza;

public class Ioc {
    private static ServicePoliza service;
    private static RepositoryPoliza repository;
    private static DaoPoliza dao;


    public static ServicePoliza createService(){
        if(service == null){
            RepositoryPoliza repository = createRepository();
            service = new ServicePolizaImpl(repository);
        }
        return service;
    }

    public static RepositoryPoliza createRepository(){
        if (repository==null){
            DaoPoliza daoPoliza = createDao();
            repository = new RepositoryPolizaImpl(dao);
        }
        return repository;
    }
    public static DaoPoliza createDao(){
        if(dao==null){
            dao= new DaoPilizaImpl();
        }
    return dao;

    }




}
