package device_management;

public class Keyboard extends InputDevice {

    private String layout;

    public Keyboard(String make, String model, String layout) {
        super(make, model);
        this.layout = layout;
    }

    public String getLayout() {
        return this.layout;
    }
}
