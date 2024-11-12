import java.util.HashMap;
import java.util.Map;

public class InventoryManager {
    private Map<String, Integer> inventory = new HashMap<>();

    public void manageInventory(String action, String item, int quantity) {
        if (action.equals("add")) {
            inventory.put(item, inventory.getOrDefault(item, 0) + quantity);
        } else if (action.equals("delete")) {
            inventory.remove(item);
        } else if (action.equals("update")) {
            inventory.put(item, quantity);
        }
    }
    public Map<String, Integer> getInventory() {
        return inventory;
    }
}
