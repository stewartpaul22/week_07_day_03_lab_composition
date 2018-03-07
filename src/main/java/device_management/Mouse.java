package device_management;

public class Mouse extends InputDevice {

    private String connectionType;

    public Mouse(String make, String model, String connectionType) {
        super(make, model);
        this.connectionType = connectionType;
    }
}
