package device_management;

import behaviours.IInput;

public class Mouse extends InputDevice implements IInput {

    private String connectionType;

    public Mouse(String make, String model, String connectionType) {
        super(make, model);
        this.connectionType = connectionType;
    }

    public String getConnectionType() {
        return this.connectionType;
    }

    public String move() {
        return "moving";
    }

    @Override
    public String sendData(String data) {
        return "button being clicked: " + data;
    }
}
