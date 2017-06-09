package name.jnsmith.patterns.behavioral.command;

//receiver
public class Light {

    private boolean isOn = false;

    public void on() {
        System.out.println("Light switch on.");
    }

    public void off() {
        System.out.println("Light switch off.");
    }

    public void toggle() {
        if (isOn) {
            off();
            isOn = false;
        } else {
            on();
            isOn = true;
        }
    }

    public boolean isOn() {
        return isOn;
    }
}
