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

    /*
        Verficar si el ataque que se va a hacer es el adecuado
        o en otras palabras es que si el ataque destruye al enemigo

        *@param longitud de la explosion
        *@param latitid de la explosion
        *@return true si el ataque destruye al enemigo sin bajas propias
     */
    public boolean esBuenAtaque(int longitud, int latitud) {
        boolean afectaPropio = false;
        boolean afectaEnemigo = false;
        for (Flota flota : tablero.getFlotas()) {
            boolean esPropia = flota.getCodigo().equals(this.codigo);
            // Revisar barcos
            for (Barco barco : flota.getBarcos()) {
                if (coincideUbicacion(barco.getUbicacion(), longitud, latitud)) {
                    if (esPropia) {
                        afectaPropio = true;
                    } else {
                        afectaEnemigo = true;
                    }
                }
            }
            // Revisar portaaviones
            for (Portaaviones porta : flota.getPortaAviones()) {
                if (coincideUbicacion(porta.getUbicacion(), longitud, latitud)) {
                    if (esPropia) {
                        afectaPropio = true;
                    } else {
                        afectaEnemigo = true;
                    }
                }
            }
            // Revisar aviones
            for (Avion avion : flota.getAviones()) {
                if (!avion.isEnAire() && coincideUbicacion(avion.getUbicacion(), longitud, latitud)) {
                    if (esPropia) {
                        afectaPropio = true;
                    } else {
                        afectaEnemigo = true;
                    }
                }
            }
        }
        // Es buen ataque si destruye algo enemigo y nada propio
        return afectaEnemigo && !afectaPropio;
    }
}



