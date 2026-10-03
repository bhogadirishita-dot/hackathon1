import java.util.Scanner;

public class SolarMonitor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Reading energy generated from the user
        System.out.print("Enter the energy generated in kWh: ");
        double energy = scanner.nextDouble();

        // Checking the energy generation level
        if (energy >= 10.0) {
            System.out.println("Good Energy Generation");
        } else {
            System.out.println("Low Energy Generation");
        }

        scanner.close();
    }
}
