package device_management;

public abstract class InputDevice {

    private String make;
    private String model;

    public InputDevice(String make, String model) {
        this.make = make;
        this.model = model;
    }

    public String getMake() {
        return this.make;
    }

    public String getModel() {
        return this.model;
    }
}
