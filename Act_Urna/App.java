/*
 * Se requiere calcular el porcentaje de votos que están en una urna

    Cada que se saca un boto de la urna, se ingresa el número del candidato

    Cuando se terminan los votos se ingresa un cero
 */

import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(){
        System.out.println("Urna");

        Candidato cand1 = new Candidato(1, "Pepe");
        Candidato cand2 = new Candidato(2, "Claudia");
        Candidato cand3 = new Candidato(3, "Julian");

        ArrayList<Candidato> lista = new ArrayList<Candidato>();
        lista.add(cand1);
        lista.add(cand2);
        lista.add(cand3);

        System.out.println("¿Cuantos votos han sido realizados?");
        Scanner input = new Scanner(System.in);
        int option = input.nextInt();
        int cant = option;
        System.out.println("Coloca el id de Candidato por voto:");
        Urna urna = new Urna(option);
        while(cant>0){
            option = input.nextInt();
            for (int i = 0; i < lista.size(); i++) {
                // Aqui se agrega el voto al candidato 
                if (option == 0){
                    break;
                }
            }
        }
        System.out.println("Candidatos - Votos - Porcentaje");
        System.out.println(); // Aqui se muestra cada candidato

    }
}

public class Urna{
    private int votos;

    Urna(int votos){
        this.votos = votos;
    }
}

class Candidato {
    private int id;
    private String name;
    private int votos;
    
    Candidato(int id, String name){
        this.id = id;
        this.name = name;
    }

    public void addVoto(){
        this.votos+=1;
    }
}