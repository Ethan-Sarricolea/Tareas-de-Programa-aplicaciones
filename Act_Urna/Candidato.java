public class Candidato {
    public int id;
    public String name;
    private int votos;
    
    Candidato(int id, String name){
        this.id = id;
        this.name = name;
    }

    public void addVoto(){
        this.votos+=1;
    }

    public int getVotos(){
        return votos;
    }

    @Override
    public String toString(){
        return (id + " - " + name + " - Votos: " + this.votos + " - Porcentaje: ");
    }
}