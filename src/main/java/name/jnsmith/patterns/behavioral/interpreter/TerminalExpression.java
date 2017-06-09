package name.jnsmith.patterns.behavioral.interpreter;


import java.util.Objects;

public class TerminalExpression implements Expression {

    private String data;

    public TerminalExpression(String data) {
        this.data = data;
    }

    @Override
    public boolean interpret(String context) {
        String[] st = context.split("\\s");
        for (String test : st) {
            if (Objects.equals(test, data)) {
                return true;
            }
        }
        return false;
    }
}
