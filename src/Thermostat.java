public class Thermostat {
    // attributes
    protected double currentTemp; // represents the current temperature
    protected double targetTemp; // represents the desired temperature
    protected boolean isHeating; // represents whether the thermostat is in a heating STATE
    protected boolean isCooling; // represents whether the thermostat is in a cooling STATE
    private boolean isOn; // represents whether the thermostat STATE is on or off

    // constructor
    public Thermostat() {
        currentTemp = 0.0;
        targetTemp = 0.0;
        isHeating = false;
        isCooling = false;
        isOn = false;
    }

    // methods
    public void switchOn() {
        isOn = true;
    }

    public void switchOff() {
        isOn = false;
        isHeating = false;
        isCooling = false;
    }

    public void setTargetTemp(double temp) {
        targetTemp = temp;
    }

    public void increaseTargetTemp() {
        targetTemp += 1.0;
    }

    public void decreaseTargetTemp() {
        targetTemp -= 1.0;
    }

    public void checkTemp() {
        if (currentTemp < targetTemp) {
            isHeating = true;
            isCooling = false;
        } else if (currentTemp > targetTemp) {
            isHeating = false;
            isCooling = true;
        } else {
            isHeating = false;
            isCooling = false;
        }
    }

    public void adjustTemp() {
        if (isHeating) {
            currentTemp += 0.5;
        } else if (isCooling) {
            currentTemp -= 0.5;
        }
    }

    public void getCurrentTemp(double temp) {
        currentTemp = temp;
    }
}
