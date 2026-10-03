public class SolarDetails {
    public static void main(String[] args) {
        // Variable declaration and initialization
        int panelId = 10045;
        double energyGenerated = 14.50; // in kWh
        int numberOfPanels = 12;
        char systemStatus = 'A'; // 'A' for Active, 'I' for Inactive, etc.

        // Displaying the details
        System.out.println("--- Rooftop Solar System Details ---");
        System.out.println("Panel ID: " + panelId);
        System.out.println("Energy Generated: " + energyGenerated + " kWh");
        System.out.println("Number of Solar Panels: " + numberOfPanels);
        System.out.println("System Status: " + systemStatus);
    }
}
