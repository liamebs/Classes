import java.util.Scanner;
public class Thermostat2 {
    public static void main(String[] args) {
        Thermostat thermostat = new Thermostat();

        thermostat.switchOn();
        System.out.println("The thermostat is now switched on.");
        Scanner reader = new Scanner(System.in);
        System.out.print("What is the current temperature in Celsius? "); // future: method
        thermostat.currentTemp = Double.parseDouble(reader.nextLine());
        System.out.print("What is your desired temperature in Celsius? "); // future: method
        thermostat.targetTemp = Double.parseDouble(reader.nextLine());

        // simulate temperature changes;
        while (thermostat.currentTemp != thermostat.targetTemp) {
            thermostat.checkTemp();
            thermostat.adjustTemp();
            System.out.println("Current temperature: " + thermostat.currentTemp + "degrees C");
            System.out.println("Heating: " + thermostat.isHeating);
            System.out.println("Cooling: " + thermostat.isCooling);
        }

        // future: loop through with changes in temperature
        thermostat.switchOff();
    }
}
