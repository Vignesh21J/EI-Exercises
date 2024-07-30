public class exercise4 {
    private String orientation;
    private boolean solarPanelsActive;
    private int dataCollected;

    public exercise4() {
        this.orientation = "Unknown";
        this.solarPanelsActive = false;
        this.dataCollected = 0;
    }

    public void rotate(String direction) {
        if (direction.equalsIgnoreCase("North") || direction.equalsIgnoreCase("South")
            || direction.equalsIgnoreCase("East") || direction.equalsIgnoreCase("West")) {
            this.orientation = direction;
            System.out.println("Satellite rotated to: " + direction);
        } else {
            System.out.println("Invalid direction. Please specify North, South, East, or West.");
        }
    }

    public void activatePanels() {
        this.solarPanelsActive = true;
        System.out.println("Solar panels activated.");
    }

    public void deactivatePanels() {
        this.solarPanelsActive = false;
        System.out.println("Solar panels deactivated.");
    }

    public void collectData() {
        if (this.solarPanelsActive) {
            this.dataCollected += 10;
            System.out.println("Data collected. Total data: " + this.dataCollected + " units.");
        } else {
            System.out.println("Solar panels are not active. Cannot collect data.");
        }
    }

    public String getOrientation() {
        return orientation;
    }

    public boolean isSolarPanelsActive() {
        return solarPanelsActive;
    }

    public int getDataCollected() {
        return dataCollected;
    }

    public static void main(String[] args) {
        exercise4 satellite = new exercise4();
        
        satellite.rotate("North");
        satellite.activatePanels();
        satellite.collectData();
        satellite.deactivatePanels();
        satellite.collectData();
        satellite.rotate("East");
        satellite.collectData();
        satellite.activatePanels();
        satellite.collectData();
    }
}
