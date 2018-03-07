package device_management;

import behaviours.IInput;

public class Keyboard extends InputDevice implements IInput {

    private String layout;

    public Keyboard(String make, String model, String layout) {
        super(make, model);
        this.layout = layout;
    }

    public String getLayout() {
        return this.layout;
    }

    public String type() {
        return "typing";
    }

    @Override
    public String sendData(String data) {
        return "key being pressed: " + data;
    }
}
