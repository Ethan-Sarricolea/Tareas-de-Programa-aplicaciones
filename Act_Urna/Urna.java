/**
 * Clase Urna para almacenar los votos totales
 */
public class Urna{
    private int votos;

    /**
     * Obtener los votos totales
     * @return votos 
     */
    public int getVotos(){
        return votos;
    }

    /**
     * Suma un voto al total de la urna
     */
    public void sumVoto(){
        this.votos+=1;
    }

    /**
     * Sobreescritura de toString
     * @return string (Cadena de informacion de la urna)
     */
    @Override
    public String toString(){
        return ("Votos totales: " + this.votos);
    }
}