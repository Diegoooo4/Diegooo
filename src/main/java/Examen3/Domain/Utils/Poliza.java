package Examen3.Domain.Utils;

public class Poliza {
    private int id;
    private String titular;
    private TipoVehiculo tipoVehiculo;
    private  double cuotaMensual;

    public void setTipoVehiculo(TipoVehiculo tipoVehiculo) {
        this.tipoVehiculo = tipoVehiculo;
    }

    public void setCuotaMensual(double cuotaMensual) {
        this.cuotaMensual = cuotaMensual;
    }

    public Poliza(int id, String titular, TipoVehiculo tipoVehiculo, double cuotaMensual) {
        this.id = id;
        this.titular = titular;
        this.tipoVehiculo = tipoVehiculo;
        this.cuotaMensual = cuotaMensual;
    }


    @Override
    public String toString() {
        return "Poliza{" +
                "id=" + id +
                ", titular='" + titular + '\'' +
                ", tipoVehiculo='" + tipoVehiculo + '\'' +
                ", cuotaMensual=" + cuotaMensual +
                '}';
    }

    public int getId() {
        return id;
    }

    public String getTitular() {
        return titular;
    }



    public double getCuotaMensual() {
        return cuotaMensual;
    }

    public TipoVehiculo getTipoVehiculo() {
        return tipoVehiculo;
    }
}
