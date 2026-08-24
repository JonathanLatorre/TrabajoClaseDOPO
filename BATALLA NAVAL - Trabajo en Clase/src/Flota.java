import java.util.ArrayList;

/**
 * Clase que refiere a una flota en el juego o a un participante como tal.
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

<<<<<<< HEAD
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
=======

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
>>>>>>> fb67870eb61ad22c292623c77a074cf861089343
                    }
                }
            }
        }
<<<<<<< HEAD
        // Es buen ataque si destruye algo enemigo y nada propio
        return afectaEnemigo && !afectaPropio;
    }
}



=======
        return placasEnAire;
    }
}
>>>>>>> fb67870eb61ad22c292623c77a074cf861089343
