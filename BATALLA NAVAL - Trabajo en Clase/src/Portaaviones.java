import java.util.ArrayList;

/**
 * Representa un portaaviones perteneciente a una flota
 */
public class Portaaviones {

    /**
     * "Los tripulantes mínimos que necesitan y los puntajes que otorgan las diferentes elementos de guerra: portaavión, barco y avión.
     * Los puntajes se pueden cambiar durante el juego pero los tripulantes necesarios no."
     */
    public final int tripulantes_minimos = 5;
    private int puntaje;

    private int numero;
    private int capacidad;

    private Posicion ubicacion;

    private ArrayList<Avion> aviones;
    private ArrayList<Marino> marinos;

}