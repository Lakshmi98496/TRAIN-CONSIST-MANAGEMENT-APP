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
import java.util.*;

public class UseCase7TrainConsistMgmt {

    // Inner class
    static class Bogie {
        String id;
        int capacity;

        Bogie(String id, int capacity) {
            this.id = id;
            this.capacity = capacity;
        }

        @Override
        public String toString() {
            return id + " -> " + capacity;
        }
    }

    public static void main(String[] args) {

        System.out.println("====================================");
        System.out.println("UC7 - Sort Bogies by Capacity");
        System.out.println("====================================\n");

        // Create list
        List<Bogie> bogies = new ArrayList<>();

        // ---- ADD bogies ----
        bogies.add(new Bogie("BG101", 72));
        bogies.add(new Bogie("BG102", 80));
        bogies.add(new Bogie("BG103", 65));
        bogies.add(new Bogie("BG104", 90));

        // ---- DISPLAY UNSORTED ----
        System.out.println("Before Sorting:");
        for (Bogie b : bogies) {
            System.out.println(b);
        }

        // ---- SORT using Comparator ----
        Collections.sort(bogies, new Comparator<Bogie>() {
            public int compare(Bogie b1, Bogie b2) {
                return b1.capacity - b2.capacity; // ascending
            }
        });

        // ---- DISPLAY SORTED ----
        System.out.println("\nAfter Sorting (by capacity):");
        for (Bogie b : bogies) {
            System.out.println(b);
        }
    }
}