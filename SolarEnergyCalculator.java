import java.util.Scanner;

public class SolarEnergyCalculator {

    // Method to calculate total energy
    public static double calculateTotalEnergy(double morningEnergy, double eveningEnergy) {
        return morningEnergy + eveningEnergy;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Reading input values from the user
        System.out.print("Enter morning energy generation (kWh): ");
        double morning = scanner.nextDouble();

        System.out.print("Enter evening energy generation (kWh): ");
        double evening = scanner.nextDouble();

        // Calling the method and storing the result
        double totalEnergy = calculateTotalEnergy(morning, evening);

        // Displaying the total energy
        System.out.println("Total Energy Generated: " + totalEnergy + " kWh");

        scanner.close();
    }
}
