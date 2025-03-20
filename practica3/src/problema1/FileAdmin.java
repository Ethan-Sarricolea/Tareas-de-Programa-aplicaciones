package problema1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.ArrayList;

public class FileAdmin {
    private File file;
    private Scanner input;
    private ArrayList<String> lineas = new ArrayList<>();
    
    /**
     * Verificar la compatibilidad
     *      - El archivo debe existir
     *      - El archivo debe tener contenido
     *      - El archivo debe poder leerse y escribirse
     */
    public boolean isCompatible(File file){
        boolean state = true;
        try {
            if (!file.exists()){
                FileNotFoundException f;
                f = new FileNotFoundException("El archivo no ha sido encontrado");
                System.out.println(f);
                state = false;
            } else if (file.isHidden()){
                IndexOutOfBoundsException index;
                index = new IndexOutOfBoundsException("El archivo no tiene contenido");
                System.out.println(index);
                state = false;
            } else if (!(file.canRead() && file.canWrite())){
                Exception e;
                e = new Exception("No se puede leer ni escribir en el archivo");
                System.out.println(e);
                state = false;
            }
        } catch (Exception e){
            System.out.println(e);
            state = false;
        }
        return (state);
    }

    public void deleteString(String path, String text){
        file = new File(path);
        try {
            input = new Scanner(file);

            // Leer las lineas del archivo
            while (input.hasNext()) {
                String linea = input.nextLine();

                // Eliminar el texto y/o guardar la linea
                if (linea.contains(text)){
                    String newLine = linea.replace(text, "");
                    lineas.add(newLine);
                } else {
                    lineas.add(linea);
                }
            }

            writeLines(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    /**
     * Reescribir el documento
     */
    public void writeLines(File file){
        try (PrintWriter writer = new PrintWriter(file);){
            for (String string : lineas) {
                writer.println(string);
            }
            writer.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}

/**
 * Sarricolea Cortés Ethan Yahel
 * LIS 401
 */