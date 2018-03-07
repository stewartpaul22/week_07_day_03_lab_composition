package device_management;

public class Mouse extends InputDevice {

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
}
