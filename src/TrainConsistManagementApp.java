import java.util.LinkedHashSet;
import java.util.Set;

public class TrainConsistManagementApp {

    public static void main(String[] args) {

        System.out.println("====================================");
        System.out.println("UC5 - Preserve Insertion Order of Bogies");
        System.out.println("====================================\n");

        // LinkedHashSet maintains order + uniqueness
        Set<String> formation = new LinkedHashSet<>();

        // ---- ADD bogies (including duplicates) ----
        formation.add("BG101");
        formation.add("BG102");
        formation.add("BG103");
        formation.add("BG104");

        // Duplicate entries (ignored)
        formation.add("BG102");
        formation.add("BG101");

        // ---- DISPLAY FINAL TRAIN FORMATION ----
        System.out.println("Final Train Formation:");
        for (String bogie : formation) {
            System.out.println(bogie);
        }
    }
}
import java.util.HashMap;
import java.util.Map;

public class UseCase6TrainConsistMgmt {

    public static void main(String[] args) {

        System.out.println("====================================");
        System.out.println("UC6 - Map Bogie to Capacity (HashMap)");
        System.out.println("====================================\n");

        // Create HashMap (Key = Bogie ID, Value = Capacity)
        Map<String, Integer> capacityMap = new HashMap<>();

        // ---- INSERT bogie capacities ----
        capacityMap.put("BG101", 72);
        capacityMap.put("BG102", 80);
        capacityMap.put("BG103", 65);
        capacityMap.put("BG104", 90);

        // ---- DISPLAY ALL ENTRIES ----
        System.out.println("Bogie Capacity Details:");
        for (Map.Entry<String, Integer> entry : capacityMap.entrySet()) {
            System.out.println("Bogie: " + entry.getKey() +
                    " -> Capacity: " + entry.getValue());
        }

        // ---- ACCESS specific bogie ----
        String search = "BG102";
        if (capacityMap.containsKey(search)) {
            System.out.println("\nCapacity of " + search + " is: " + capacityMap.get(search));
        }
    }
}