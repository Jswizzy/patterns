package name.jnsmith.patterns.behavioral.interpreter;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Everyday {

    public static void main(String[] args) {

        String input = "Lions, and tigers, and bears! Oh, my!"; // build a sentence

        Pattern p =
                Pattern.compile("(lion|cat|dog|wolf|bear|human|tiger|liger)",
                        Pattern.CASE_INSENSITIVE); // establish a grammar

        Matcher m = p.matcher(input); // run

        while (m.find()) {
            System.out.println("Found a " + m.group() + ".");
        }
    }
}
