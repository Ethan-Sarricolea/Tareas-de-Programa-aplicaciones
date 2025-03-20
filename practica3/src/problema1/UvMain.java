package problema1;

import java.io.File;

public class UvMain {
    public static void main(String[] args) {
        FileAdmin admin = new FileAdmin();
        File file = new File(args[0]);

        if (admin.isCompatible(file) == false){
            System.exit(1);
        }

        admin.deleteString(args[0], args[1]);
    }
}
