package com.collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Maps {

    public static Map<String, Integer> createInventory(List<String> items) {
        Map<String, Integer> inventory = new HashMap<>();
        for (String item : items) {
            if (!inventory.containsKey(item)) {
                inventory.put(item, 1);
            } else if (inventory.containsKey(item)){
                inventory.replace(item, inventory.get(item) + 1);
            }
        }
        return inventory;
    }

    public static Map<String, Integer> addItems(Map<String, Integer> inventory, List<String> items) {
        for (String item : items) {
            if (inventory.containsKey(item)) {
                inventory.replace(item, inventory.get(item) + 1);
            } else if (!inventory.containsKey(item)) {
                inventory.put(item, 1);
            }
        }
        return inventory;
    }

    public Map<String, Integer> decrementItems(Map<String, Integer> inventory, List<String> items) {
        for (String item : items) {
            if (inventory.get(item) > 0) {
                if (inventory.containsKey(item)) {
                    inventory.replace(item, inventory.get(item) - 1);
                }
            }
        }
        return inventory;
    }

    public Map<String, Integer> removeItem(Map<String, Integer> inventory, String item) {
        if (inventory.containsKey(item)) {
            inventory.remove(item);
        }
        return inventory;
    }

    public List<Map.Entry<String, Integer>> listInventory(Map<String, Integer> inventory) {
        // todo: Implement the logic to create a list containing all (item_name, item_count) pairs in the inventory
        List<Map.Entry<String, Integer>> list = new ArrayList<>();
        for (Map.Entry<String, Integer> entry : inventory.entrySet()) {
            if (entry.getValue() > 0) {
                list.add(entry);
            }
        }
        return list;
    }
}