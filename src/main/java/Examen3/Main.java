package Examen3;

import Examen3.Controller.Ioc;
import Examen3.Domain.Utils.Poliza;
import Examen3.Domain.Utils.TipoVehiculo;
import Examen3.Domain.service.ServicePoliza;
import Examen3.Domain.service.impl.ServicePolizaImpl;
import Examen3.Persistance.dao.DaoPoliza;
import Examen3.Persistance.dao.Impl.DaoPilizaImpl;
import Examen3.Persistance.repository.Impl.RepositoryPolizaImpl;
import Examen3.Persistance.repository.RepositoryPoliza;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ServicePoliza servicePoliza = Ioc.createService();
        Scanner sc = new Scanner(System.in);
        int opcion;
        boolean salir= false;
        do {
            try {
                System.out.println("1. Alta de Póliza: Solicitar datos al usuario");
                System.out.println("2. Baja de Póliza: Solicitar ID y proceder a su eliminación.");
                System.out.println("3. Consultar por Vehículo: Solicitar el tipo (ej. Coche) y mostrar todas las pólizas que coincidan.");
                System.out.println("4. Calcular Recaudación Anual: Mostrar el total económico anual de la cartera de clientes.");
                System.out.println("0.Salir");


                opcion = Integer.parseInt(sc.nextLine());


                switch (opcion) {
                    case 1:
                        System.out.println("Id");
                        int id = sc.nextInt();
                        sc.nextLine();
                        System.out.println("Titular:");
                        String titular = sc.nextLine();
                        System.out.println("Elige el tipo de vehiculo");
                        TipoVehiculo vehiculo = null;
                        System.out.println("1.coche");
                        System.out.println("2.moto");
                        System.out.println("3.camion");
                        int opcion2 = sc.nextInt();
                         switch (opcion2) {
                             case 1: vehiculo=TipoVehiculo.COCHE;break;
                             case 2: vehiculo=TipoVehiculo.MOTO;break;
                             case 3: vehiculo=TipoVehiculo.CAMION;break;
                        };
                        System.out.println("Cuota mensual");
                        double coutaMensual = sc.nextDouble();
                        servicePoliza.create(id, titular, vehiculo, coutaMensual);
                        break;
                    case 2:
                        System.out.println("Borrar poliza, poneme el id");
                        int idDelete = sc.nextInt();
                        servicePoliza.delete(idDelete);
                        System.out.println("Lo has borrado correctamente");
                        break;

                    case 3:
                        System.out.println("Dime que tipo de poliza de vehiculo quieres ver");
                        TipoVehiculo vehiculo2=null;
                        System.out.println("1.Coche");
                        System.out.println("2.Moto");
                        System.out.println("3.Camion");
                        int opcion3 = sc.nextInt();
                        switch (opcion3) {
                            case 1 -> vehiculo2=TipoVehiculo.COCHE;
                            case 2 -> vehiculo2=TipoVehiculo.MOTO;
                            case 3 -> vehiculo2=TipoVehiculo.CAMION;
                        };
                        System.out.println("Polizas de vehivulo: "+servicePoliza.findByTipoVehiculo(vehiculo2));
                        break;


                    case 4:
                        System.out.println("Esta es la priam anual de todas las polizas"+servicePoliza.PrimaAnualTotal());

                        break;
                    case 0:
                        salir=true;
                        System.out.println("Has salido del programa");
                        break;
                }
                sc.nextLine();


            } catch (NumberFormatException e) {
                System.out.println("No");
            } catch (InputMismatchException e) {
                System.out.println("no");
            }
        } while (!salir) ;
    }
}
