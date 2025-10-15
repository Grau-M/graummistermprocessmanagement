package ca.sheridan.marcus;

public class InventoryTracker {
    private int currentStock = 100;
    private final int LOW_STOCK_THRESHOLD = 20;
    
    public String checkStockLevel() {
        if (currentStock < LOW_STOCK_THRESHOLD) {
            return "LOW: Only " + currentStock + " units left.";
        } else if (currentStock < 50) {
            return "MEDIUM: Stock is stable at " + currentStock + " units.";
        } else {
            return "HIGH: Stock is plentiful at " + currentStock + " units.";
        }
    }
}
