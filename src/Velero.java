public class Velero extends Embarcacion{
    private int cantidadMastiles;

    public Velero(Capitan capitan, double precioBase, double valorAdicional, int anoFabricacion, double eslora, int cantidadMastiles) {
        super(capitan, precioBase, valorAdicional, anoFabricacion, eslora);
        this.cantidadMastiles = cantidadMastiles;
    }

    @Override
    public double calcularMontoAlquilerEspecifico() {
        double monto = super.calcularMontoAlquiler();
        if (cantidadMastiles > 4) {
            monto += precioBase * 0.1;
        }
        return monto;
    }

    @Override
    public boolean esDeTipoEspecial() {
        return cantidadMastiles > 4;
    }
}
