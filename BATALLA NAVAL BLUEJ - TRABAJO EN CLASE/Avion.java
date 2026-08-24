/**
 * Representa un avión de combate perteneciente a una flota.
 */
public class Avion {

    /**
     * "Los tripulantes mínimos que necesitan y los puntajes que otorgan las diferentes elementos de guerra: portaavión, barco y avión.
     * Los puntajes se pueden cambiar durante el juego pero los tripulantes necesarios no."
     */
    public final int tripulantes_minimos = 2;
    private int puntaje;

    private String placa;
    private boolean enAire;

    private Posicion ubicacion;
    private Marino piloto;
    private Marino copiloto;




    public boolean estaEnAire(){
        return enAire;
    }
    public String getPlaca(){
        return placa;
    }
}


