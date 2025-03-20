package problema2;

import java.io.File;
import java.util.Scanner;

public class FileCounter {
    private Scanner input;
    private File file;
    
    public FileCounter(){}

    public FileCounter(File file) {
        this.file = file;
    }

    @Override
    public String toString(){
        return ("El archivo tiene:\n"
        + getCharacters(file) + " caracteres\n"
        + getWords(file) + " palabras\n"
        + getLines(file) + " lineas");
    }

    public int getWords(File file){
        int words = 0;
        try {
            input = new Scanner(file);
            while (input.hasNext()) {
                // Avanzar una palabra
                input.next();
                words ++;
            }
        } catch (Exception e) {
            System.out.println(e);
            return 0;
        }
        return words;
    }

    public int getCharacters(File file){
        int chars = 0;
        try{
            input = new Scanner(file);

            // Obtener linea y contar sus caracteres
            while (input.hasNext()) {
                String linea = input.nextLine();
                linea.length();
                chars += linea.length();
            }

        } catch (Exception e){
            System.out.println(e);
            return 0;
        }
        return chars;
    }

    public int getLines(File file){
        int lineas = 0;
        try {
            input = new Scanner(file);
            while (input.hasNext()) {
                // Avanzar y contar la linea
                input.nextLine();
                lineas++;
            }
        } catch (Exception e) {
            System.out.println(e);
            return 0;
        }
        return lineas;
    }
}

// Sarricolea Cortés Ethan Yahel
