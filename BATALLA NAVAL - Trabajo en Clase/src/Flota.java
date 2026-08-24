import java.util.ArrayList;

/**
 * Clase que refiere a una flota en el juego o a un participante como tal..
 */
public class Flota {

    /**
     * "Un código para identificar las flotas.
     * El código no se puede modificar y puede ser consultado por todos."
     */
    public final int codigo;

    private String nombre;
    private Tablero tablero;

    private ArrayList<Avion> aviones;
    private ArrayList<PortaAviones> portaAviones;
    private ArrayList<Barco> barcos;
    private ArrayList<Marino> marinos;


    public Flota(int cod, String nom){
        codigo = cod;
        nombre = nom;

        aviones = new ArrayList<>();
        portaAviones = new ArrayList<>();
        barcos = new ArrayList<>();
        marinos = new ArrayList<>();
    }





    public ArrayList<Avion> getAviones(){
        return aviones;
    }
    public void setTablero(Tablero tablero) {
        this.tablero = tablero;
    }

    public ArrayList<String> enAire() {
        ArrayList<String> placasEnAire = new ArrayList<>();
        if (tablero != null) {
            for (Flota enemiga : tablero.getFlotas()) {
                if (enemiga != this) {
                    for (Avion a : enemiga.getAviones()) {
                        if (a.estaEnAire()) {
                            placasEnAire.add(a.getPlaca());
                        }
                    }
                }
            }
        }
        return placasEnAire;
    }
}