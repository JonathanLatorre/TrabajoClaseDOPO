import java.util.ArrayList;

/**
 * Representa un barco perteneciente a una flota.
 */
public class Barco {

    /**
     * "Los tripulantes mínimos que necesitan y los puntajes que otorgan las diferentes elementos de guerra: portaavión, barco y avión.
     * Los puntajes se pueden cambiar durante el juego pero los tripulantes necesarios no."
     */
    public final int tripulantesMinimos = 4;
    private int puntaje;

    private int numero;

    private Posicion ubicacion;
    private ArrayList<Marino> marinos;

}