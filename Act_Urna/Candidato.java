 /**
  * @author Ethan Yahel Sarricolea Cortés
  * Clase candidato, contiene los datos y votos.
  */

public class Candidato {
    public int id;
    public String name;
    private int votos;
    
    /**
     * Constructor
     * @param id
     * @param name
     */
    Candidato(int id, String name){
        this.id = id;
        this.name = name;
    }

    /**
     * Suma un voto al candidato
     */
    public void addVoto(){
        this.votos+=1;
    }

    /**
     * Obtener votos
     * @return votos (Suma de votos hasta el momento)
     */
    public int getVotos(){
        return votos;
    }

    /**
     * Sobreescritura de toString
     * @return string (cadena con la informacion)
     */
    @Override
    public String toString(){
        return (id + " - " + name + " - Votos: " + this.votos + " - Porcentaje: ");
    }
}