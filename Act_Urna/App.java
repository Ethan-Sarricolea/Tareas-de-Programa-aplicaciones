/*
 * Se requiere calcular el porcentaje de votos que están en una urna
Cada que se saca un boto de la urna, se ingresa el número del candidato
Cuando se terminan los votos se ingresa un cero
 */

import java.util.ArrayList;
import java.util.Scanner;

public class App {
    /**
     * @param args
     */
    public static void main(String[] args){
        System.out.println(" -- Urna de votos precidenciales -- ");

        Candidato cand1 = new Candidato(1, "Pepe");
        Candidato cand2 = new Candidato(2, "Claudia");
        Candidato cand3 = new Candidato(3, "Julian");

        ArrayList<Candidato> lista = new ArrayList<Candidato>();
        lista.add(cand1);
        lista.add(cand2);
        lista.add(cand3);
        Scanner input = new Scanner(System.in);
        int option;
        System.out.println("Coloca el id de Candidato por voto:");
        Urna urna = new Urna();
        boolean continuar = true;
        boolean votacion = false;
        while(continuar){
            option = input.nextInt();
            for (int i = 0; i < lista.size(); i++) {
                if (option == lista.get(i).id){
                    votacion = true;
                    lista.get(i).addVoto();
                    break;
                } else if (option == 0){
                    votacion = false;
                    continuar = false;
                    break;
                } else {
                    
                    votacion = false;
                    continue;
                }
            }
            if (votacion){
                urna.sumVoto();
            } else {
                if (continuar)
                System.out.println("--Voto no valido--");
            }
        }
        System.out.println(urna.toString());
        System.out.println("id - Candidato - Cantidad de votos - Porcentaje");
        float porcent;
        for (Candidato candidato : lista) {
            porcent = ((float)
            candidato.getVotos() / (float)urna.getVotos());
            // System.out.println(candidato.getVotos() + " / " + urna.getVotos() + " * " + 100);
            // System.out.println(porcent);
            System.out.println(candidato.toString() + ((float)porcent*100) + "%");
        }
    }
}
