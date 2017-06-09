package name.jnsmith.patterns.behavioral.command;

import java.util.ArrayList;
import java.util.List;

//client
public class Demo {

    public static void main(String[] args) {
        Light bedroomlight = new Light();
        Light kitchenlight = new Light();
        Switch lightSwitch = new Switch();

/*        Command onCommand = new OnCommand(bedroomlight);
        lightSwitch.storeAndExecute(onCommand);

        Command toggleCommand = new ToggleCommand(kitchenlight);
        lightSwitch.storeAndExecute(toggleCommand);
        lightSwitch.storeAndExecute(toggleCommand);
        lightSwitch.storeAndExecute(toggleCommand);*/

        List<Light> lights = new ArrayList<>();
        lights.add(bedroomlight);
        lights.add(kitchenlight);
        Command allLightsCommand = new AllLightsCommand(lights);
        lightSwitch.storeAndExecute(allLightsCommand);
    }
}
