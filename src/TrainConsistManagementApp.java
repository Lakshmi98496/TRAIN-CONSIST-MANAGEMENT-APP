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

public class UseCase17TrainConsistMgmt {

    public static void main(String[] args) {

        System.out.println("==============================================");
        System.out.println(" UC17 - Sort Bogie Names Using Arrays.sort() ");
        System.out.println("==============================================\n");

        // Create array of bogie names
        String[] bogieNames = {
                "Sleeper",
                "AC Chair",
                "First Class",
                "General",
                "AC 2 Tier"
        };

        // Display original array
        System.out.println("Original Bogie Names:");
        for (String name : bogieNames) {
            System.out.println(name);
        }

        // -------- SORT USING Arrays.sort() --------
        Arrays.sort(bogieNames);

        // Display sorted array
        System.out.println("\nSorted Bogie Names:");
        for (String name : bogieNames) {
            System.out.println(name);
        }
    }
}