import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        // miPrimerExcepcion();
        combinarExcepciones();
    }

    public static void combinarExcepciones(){
        String lectura = "";
        String auxiliar = null;
        int conversion;

        Scanner input = new Scanner(System.in);
        System.out.println("Ingreasa un dato");
        lectura = input.nextLine();

        if (lectura.length() > 5) {
            auxiliar = "UV";
        }
        try {
            int longitud = auxiliar.length(); // Error null pointer
            conversion = Integer.parseInt(auxiliar);
        } catch (NullPointerException e) {
            System.out.println("Error: Valor nulo");
        } catch (NumberFormatException e){
            System.out.println("Error: No se puede convertir");
        }
    }

    public static void miPrimerExcepcion() {
        String dato = "";
        int conversion = 0;

        Scanner in = new Scanner(System.in);

        System.out.print("Coloca un numero: ");

        dato = in.nextLine();

        try {
            conversion = Integer.parseInt(dato);
            System.out.println(conversion);
        } catch (Exception e) {
            System.out.println("El dato no es un numero");
        } finally {
            System.out.println("Detección exitosa");
            in.close();
        }
        System.out.println(conversion != 0 ?
                            conversion + " x 2 = " + (conversion*2)
                            : "No se puede realizar la operación");
    }

}