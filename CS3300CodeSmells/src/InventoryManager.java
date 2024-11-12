import java.util.HashMap;
import java.util.Map;

interface InventoryAction {
    void execute(Map<String, Integer> inventory, String item, int quantity);
}

class AddAction implements InventoryAction {
    @Override
    public void execute(Map<String, Integer> inventory, String item, int quantity) {
        inventory.put(item, inventory.getOrDefault(item, 0) + quantity);
    }
}

class DeleteAction implements InventoryAction {
    @Override
    public void execute(Map<String, Integer> inventory, String item, int quantity) {
        inventory.remove(item);
    }
}

class UpdateAction implements InventoryAction {
    @Override
    public void execute(Map<String, Integer> inventory, String item, int quantity) {
        inventory.put(item, quantity);
    }
}

public class InventoryManager {
    private Map<String, Integer> inventory = new HashMap<>();

    public void manageInventory(InventoryAction action, String item, int quantity) {
        action.execute(inventory, item, quantity);
    }

    public Map<String, Integer> getInventory() {
        return inventory;
    }

    public String generateInventoryReport() {
        StringBuilder report = new StringBuilder("Inventory Report:\n");
        for (Map.Entry<String, Integer> entry : inventory.entrySet()) {
            report.append(entry.getKey()).append(": ").append(entry.getValue()).append("\n");
        }
        return report.toString();
    }

}
