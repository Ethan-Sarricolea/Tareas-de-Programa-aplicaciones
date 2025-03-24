import java.io.File;
import java.io.IOException;

public class Main {
    
        public static void main2() throws IOException, Exception {
            try {
                Filer filer = new Filer("src/pacoElChato.txt");
                filer.isDirectory();
            } catch (FileNotFound e) {
                e.printStackTrace();
            } catch (DirNotFound e) {
                e.printStackTrace();
            }
        }
	public static void main(String[] args) throws IOException, Exception {
		try {
            // Exception ex;
            // throw ex = new Exception("Un error");
            File file = new File("src/pacoElChato.txt");
            FileNotFound e;

            if (file.exists() == false){   // Paso 4
                // e = new FileNotFound("El archivo no existe");
                e = null;
                throw e;

            } else  if (!file.exists()){    // Paso 1
                System.out.println("");

            }else{
                DirNotFound ed;
                ed = null;
                throw ed;
            }

        } catch(FileNotFound e){
            e.printStackTrace();

        // Paso 2
        } catch (Exception ex){
            System.out.println(ex);
            ex.printStackTrace();
        }finally {
            System.out.println("Final del codigo");
        }

        // main2();
	}
}