public class Yate extends  Embarcacion{
    private int cantidadCamarotes;
    private int vecesAlquilado;

    public Yate(Capitan capitan, double precioBase, double valorAdicional, int anoFabricacion, double eslora, int cantidadCamarotes, int vecesAlquilado) {
        super(capitan, precioBase, valorAdicional, anoFabricacion, eslora);
        this.cantidadCamarotes = cantidadCamarotes;
        this.vecesAlquilado = vecesAlquilado;
    }

    @Override
    public double calcularMontoAlquilerEspecifico() {
        return super.calcularMontoAlquiler();
    }

    @Override
    public boolean esDeTipoEspecial() {
        return cantidadCamarotes > 5 || cantidadCamarotes > 8;
    }

    public double calcularPrecioCompra() {
        double precioCompra = precioBase;
        if (vecesAlquilado > 50) {
            precioCompra *= 0.8;
        } else if (vecesAlquilado > 20) {
            precioCompra *= 0.9;
        }

        if (cantidadCamarotes > 5 && vecesAlquilado > 50) {
            precioCompra *= 0.9;
        } else if (cantidadCamarotes > 8 && vecesAlquilado > 80) {
            precioCompra *= 0.95;
        }

        return precioCompra;
    }
}
