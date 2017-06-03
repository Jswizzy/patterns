package name.jnsmith.patterns.structure.decorator;

import java.io.*;

public class Everyday {

    /**
        composition = has-a
        inheritance = is-a

        inheritance base
        alternative to subclassing
        constructor requires instance from hierarchy
     */

    public static void main(String[] args) throws IOException {

        File file = new File("./output.txt");
        file.createNewFile();

        OutputStream outputStream = new FileOutputStream(file);

        DataOutputStream dataOutputStream = new DataOutputStream(outputStream);
        dataOutputStream.writeChars("text");

        dataOutputStream.close();
        outputStream.close();
    }
}
