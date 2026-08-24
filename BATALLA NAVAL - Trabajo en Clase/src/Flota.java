import java.util.ArrayList;

/**
 * Clase que refiere a una flota en el juego o a un participante como tal
 */
public class Flota {

    /**
     * "Un código para identificar las flotas.
     * El código no se puede modificar y puede ser consultado por todos."
     */
    public final String codigo = "";

    private String nombre;
    private Tablero tablero;

    private ArrayList<Avion> aviones;
    private ArrayList<Portaaviones> portaAviones;
    private ArrayList<Barco> barcos;
    private ArrayList<Marino> marinos;

}