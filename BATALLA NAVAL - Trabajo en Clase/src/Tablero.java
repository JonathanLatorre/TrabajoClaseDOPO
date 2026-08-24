import java.util.ArrayList;

/**
 * Clase que representa el mundo de juego.
 */
public class Tablero {

    /**
     * "El mundo tablero es cuadrado.
     * La longitudes y las latitudes están en el rango [-100 a 100]."
     */
    public static final int MINIMO = -100;
    public static final int MAXIMO = 100;

    private ArrayList<Flota> flotas;


    public Tablero() {
        this.flotas = new ArrayList<>();
    }




    public ArrayList<Flota> getFlotas() {
        return flotas;
    }

    public void adicionarFlota(Flota flota) {
        flotas.add(flota);
        flota.setTablero(this);
    }
}