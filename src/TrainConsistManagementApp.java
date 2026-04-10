import java.util.*;
import java.util.stream.*;

// Reusing Bogie model
class Bogie {
    String name;
    int capacity;

    Bogie(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }
}

public class Main {
    public static void main(String[] args) {

        System.out.println("==========================================");
        System.out.println(" UCB - Filter Passenger Bogies Using Streams ");
        System.out.println("==========================================\n");

        // Create list of bogies
        List<Bogie> bogies = new ArrayList<>();
        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 56));
        bogies.add(new Bogie("First Class", 24));
        bogies.add(new Bogie("General", 90));

        // Display all bogies
        System.out.println("All Bogies:");
        bogies.forEach(b -> System.out.println(b.name + " -> " + b.capacity));

        // Filter bogies with capacity > 60
        List<Bogie> filteredBogies = bogies.stream()
                .filter(b -> b.capacity > 60)
                .collect(Collectors.toList());

        // Display filtered bogies
        System.out.println("\nFiltered Bogies (Capacity > 60):");
        filteredBogies.forEach(b -> System.out.println(b.name + " -> " + b.capacity));

        System.out.println("\nUCB filtering completed...");
    }
}
import java.util.*;

public class UseCase18TrainConsistMgmt {

    public static void main(String[] args) {

        System.out.println("==============================================");
        System.out.println(" UC18 - Linear Search for Bogie ID ");
        System.out.println("==============================================\n");

        // Create array of bogie IDs
        String[] bogieIds = {"BG101", "BG205", "BG309", "BG412", "BG550"};

        // Bogie ID to search
        String searchId = "BG309";

        // Display all bogie IDs
        System.out.println("Available Bogie IDs:");
        for (String id : bogieIds) {
            System.out.println(id);
        }

        // -------- LINEAR SEARCH --------
        boolean found = false;

        for (String id : bogieIds) {
            if (id.equals(searchId)) {
                found = true;
                break; // stop when found
            }
        }

        // Display result
        System.out.println("\nSearch Result:");
        if (found) {
            System.out.println(searchId + " is FOUND ✅");
        } else {
            System.out.println(searchId + " is NOT FOUND ❌");
        }
    }
}