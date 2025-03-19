package problema2;

import java.io.File;

public class Main {
    public static void main(String[] args) {
        File file = new File(args[0]);
        FileCounter counter = new FileCounter(file);
        System.out.println(counter.toString());

    }
}
