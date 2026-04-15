package WalletWise.Modelo;

public class Transaccion {
    private int id;
    private String descripcion;
    private double monto;
    private TipoTransaccion tipo;
    private String categoria;

    public Transaccion(int id, String descripcion, double monto, TipoTransaccion tipo, String categoria) {
        this.id = id;
        this.descripcion = descripcion;
        this.monto = monto;
        this.tipo = tipo;
        this.categoria = categoria;
    }

    public int getId() {
        return id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public double getMonto() {
        return monto;
    }

    public TipoTransaccion getTipo() {
        return tipo;
    }

    public String getCategoria() {
        return categoria;
    }

    @Override
    public String toString() {
        return "Transaccion" +
                "id=" + id +
                "descripcion='" + descripcion + '\'' +
                "monto=" + monto +
                "tipo=" + tipo +
                "categoria='" + categoria
                ;
    }
}
