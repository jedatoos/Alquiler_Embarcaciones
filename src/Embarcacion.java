public abstract class Embarcacion {
    protected Capitan capitan;
    protected double precioBase;
    protected double valorAdicional;
    protected int anoFabricacion;
    protected double eslora;
    protected Usuario usuario; // Atributo para almacenar el usuario que alquila la embarcación

    public Embarcacion(Capitan capitan, double precioBase, double valorAdicional, int anoFabricacion, double eslora) {
        this.capitan = capitan;
        this.precioBase = precioBase;
        this.valorAdicional = valorAdicional;
        this.anoFabricacion = anoFabricacion;
        this.eslora = eslora;
    }


    // Métodos para alquilar y liberar la embarcación
    public void alquilar(Usuario usuario) {
        this.usuario = usuario;
    }

    public void liberar() {
        this.usuario = null;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    // Método para calcular el monto de alquiler
    public double calcularMontoAlquiler() {
        double monto = precioBase;
        if (anoFabricacion > 2020) {
            monto += 20000;
        }
        return monto;
    }
    // Métodos abstractos para ser implementados en las subclases
    public abstract double calcularMontoAlquilerEspecifico();
    public abstract boolean esDeTipoEspecial();

}
