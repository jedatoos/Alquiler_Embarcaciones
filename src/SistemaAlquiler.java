import java.util.HashMap;
import java.util.Map;

public class SistemaAlquiler {
    private Map<Embarcacion, Usuario> alquileres;

    public SistemaAlquiler() {
        this.alquileres = new HashMap<>();
    }

    public void alquilarEmbarcacion(Embarcacion embarcacion, Usuario usuario) {
        if (alquileres.containsKey(embarcacion)) {
            System.out.println("La embarcación ya está alquilada.");
        } else {
            alquileres.put(embarcacion, usuario);
            embarcacion.alquilar(usuario);
            System.out.println("Embarcación alquilada por " + usuario.getNombre());
        }
    }

    public void liberarEmbarcacion(Embarcacion embarcacion) {
        if (alquileres.containsKey(embarcacion)) {
            Usuario usuario = alquileres.remove(embarcacion);
            embarcacion.liberar();
            System.out.println("Embarcación liberada por " + usuario.getNombre());
        } else {
            System.out.println("La embarcación no está alquilada.");
        }
    }

    public Usuario obtenerInformacionAlquiler(Embarcacion embarcacion) {
        return alquileres.get(embarcacion);
    }
}
