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
        import java.util.stream.*;

// MAIN CLASS
public class UseCase12TrainConsistMgmt {

    // Goods Bogie model
    static class GoodsBogie {
        String type;
        String cargo;

        GoodsBogie(String type, String cargo) {
            this.type = type;
            this.cargo = cargo;
        }
    }

    public static void main(String[] args) {

        System.out.println("==============================================");
        System.out.println(" UCB12 - Safety Compliance Check for Goods Bogies ");
        System.out.println("==============================================\n");

        // Create goods bogie list
        List<GoodsBogie> goodsBogies = new ArrayList<>();

        goodsBogies.add(new GoodsBogie("Closed", "Food"));
        goodsBogies.add(new GoodsBogie("Closed", "Clothes"));
        goodsBogies.add(new GoodsBogie("Closed", "Medicine"));
        goodsBogies.add(new GoodsBogie("Open", "Coal")); // unsafe example

        // Display bogies
        System.out.println("Goods Bogies:");
        for (GoodsBogie g : goodsBogies) {
            System.out.println(g.type + " -> " + g.cargo);
        }

        // SAFETY CHECK using allMatch()
        // Rule: All cargo except "Coal" must be in "Closed" type bogie
        boolean isSafe = goodsBogies.stream()
                .allMatch(g -> g.cargo.equals("Coal") || g.type.equals("Closed"));

        // Display result
        System.out.println("\nSafety Compliance Status:");

        if (isSafe) {
            System.out.println("All goods bogies are SAFE ✅");
        } else {
            System.out.println("Safety violation detected ❌");
        }
    }
}