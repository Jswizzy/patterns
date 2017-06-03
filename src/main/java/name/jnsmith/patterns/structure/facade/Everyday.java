package name.jnsmith.patterns.structure.facade;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;

/**
 * refactoring pattern
 *
 * simplify client
 * provide different interface
 *
 * class utilizes composition
 * shouldn't need inheritance
 */

public class Everyday {

    public static void main(String[] args) throws IOException {

        URL url = new URL("http", "www.google.com", 80, "/");

        BufferedReader in = new BufferedReader(new InputStreamReader(url.openStream()));

        String inputLine;

        while ((inputLine = in.readLine()) != null) {
            System.out.println(inputLine);
        }
    }
}
