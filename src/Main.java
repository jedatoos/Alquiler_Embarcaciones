public class Main {
    public static void main(String[] args) {
        // Crear instancias de Capitan
        Capitan capitan1 = new Capitan("Juan", "Perez", "M12345");
        Capitan capitan2 = new Capitan("Ana", "Gomez", "M54321");

        // Crear instancias de Velero y Yate
        Velero velero1 = new Velero(capitan1, 50000, 10000, 2021, 10.5, 5);
        Yate yate1 = new Yate(capitan2, 200000, 50000, 2019, 20, 6, 30);

        // Crear instancias de Usuario
        Usuario usuario1 = new Usuario("U001", "Carlos", "123 Calle Principal", "555-1234");
        Usuario usuario2 = new Usuario("U002", "Laura", "456 Calle Secundaria", "555-5678");

        // Crear instancia de SistemaAlquiler
        SistemaAlquiler sistemaAlquiler = new SistemaAlquiler();

        // Alquilar embarcaciones
        sistemaAlquiler.alquilarEmbarcacion(velero1, usuario1);
        sistemaAlquiler.alquilarEmbarcacion(yate1, usuario2);

        // Obtener información de alquiler
        Usuario alquiladorVelero1 = sistemaAlquiler.obtenerInformacionAlquiler(velero1);
        Usuario alquiladorYate1 = sistemaAlquiler.obtenerInformacionAlquiler(yate1);

        // Imprimir información de alquiler
        System.out.println("El velero 1 está alquilado por: " + alquiladorVelero1.getNombre());
        System.out.println("El yate 1 está alquilado por: " + alquiladorYate1.getNombre());

        // Calcular monto de alquiler
        double montoAlquilerVelero1 = velero1.calcularMontoAlquilerEspecifico();
        double montoAlquilerYate1 = yate1.calcularMontoAlquilerEspecifico();

        // Imprimir montos de alquiler
        System.out.println("Monto de alquiler del velero 1: " + montoAlquilerVelero1);
        System.out.println("Monto de alquiler del yate 1: " + montoAlquilerYate1);

        // Calcular precio de compra del yate
        double precioCompraYate1 = yate1.calcularPrecioCompra();
        System.out.println("Precio de compra del yate 1: " + precioCompraYate1);

        // Liberar embarcaciones
        sistemaAlquiler.liberarEmbarcacion(velero1);
        sistemaAlquiler.liberarEmbarcacion(yate1);
    }
}

