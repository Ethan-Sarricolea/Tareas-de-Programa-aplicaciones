// Paso 6 : Filer

import java.io.File;

public class Filer {

    File file;

    public Filer(String path){
        file = new File(path);
    }

    public boolean exists() throws FileNotFound{

        if(file.exists()){
            System.out.println("El archivo existe");
            return true;
        }else{
            FileNotFound e;
            throw e = new FileNotFound("El archivo no existe");
        }
        

    }

    public boolean isDirectory() throws FileNotFound, DirNotFound{
        try {
            boolean exist = exists();
            if(file.isDirectory() && exist){
                System.out.println("Es un directorio");
                return true;
            }else{
                DirNotFound e;
                throw e = new DirNotFound("El directorio no existe");
            }
        }catch(FileNotFound e){
            throw e;
        }
    }
}
