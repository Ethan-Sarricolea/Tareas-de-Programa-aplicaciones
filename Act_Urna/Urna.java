public class Urna{
    private int votos;

    public int getVotos(){
        return votos;
    }

    public void sumVoto(){
        this.votos+=1;
    }

    @Override
    public String toString(){
        return ("Votos totales: " + this.votos);
    }
}