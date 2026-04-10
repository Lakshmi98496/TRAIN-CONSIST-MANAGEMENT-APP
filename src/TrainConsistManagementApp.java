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
import java.util.*;
        import java.util.stream.*;

// MAIN CLASS
public class UseCase13TrainConsistMgmt {

    // Bogie model
    static class Bogie {
        String type;
        int capacity;

        Bogie(String type, int capacity) {
            this.type = type;
            this.capacity = capacity;
        }
    }

    public static void main(String[] args) {

        System.out.println("=================================================");
        System.out.println(" UC13 - Performance Comparison (Loops vs Streams) ");
        System.out.println("=================================================\n");

        // Create large dataset
        List<Bogie> bogies = new ArrayList<>();

        for (int i = 0; i < 100000; i++) {
            bogies.add(new Bogie("Type" + (i % 5), i));
        }

        // ---------------- LOOP APPROACH ----------------
        long startLoop = System.nanoTime();

        List<Bogie> loopResult = new ArrayList<>();
        for (Bogie b : bogies) {
            if (b.capacity > 50000) {
                loopResult.add(b);
            }
        }

        long endLoop = System.nanoTime();
        long loopTime = endLoop - startLoop;

        // ---------------- STREAM APPROACH ----------------
        long startStream = System.nanoTime();

        List<Bogie> streamResult = bogies.stream()
                .filter(b -> b.capacity > 50000)
                .collect(Collectors.toList());

        long endStream = System.nanoTime();
        long streamTime = endStream - startStream;

        // ---------------- RESULTS ----------------
        System.out.println("Loop Time   : " + loopTime + " ns");
        System.out.println("Stream Time : " + streamTime + " ns");

        // Optional check
        System.out.println("\nResults Count:");
        System.out.println("Loop Result Size   : " + loopResult.size());
        System.out.println("Stream Result Size : " + streamResult.size());
    }
}
import java.util.*;

// MAIN CLASS
public class UseCase14TrainConsistMgmt {

    // ---- CUSTOM EXCEPTION ----
    static class InvalidCapacityException extends Exception {
        public InvalidCapacityException(String message) {
            super(message);
        }
    }

    // ---- Passenger Bogie Model ----
    static class PassengerBogie {
        String name;
        int capacity;

        PassengerBogie(String name, int capacity) throws InvalidCapacityException {
            if (capacity <= 0) {
                throw new InvalidCapacityException("Invalid capacity for " + name);
            }
            this.name = name;
            this.capacity = capacity;
        }
    }

    public static void main(String[] args) {

        System.out.println("==============================================");
        System.out.println(" UCB14 - Handle Invalid Bogie Capacity ");
        System.out.println("==============================================\n");

        List<PassengerBogie> bogies = new ArrayList<>();

        // Creating bogies with validation
        try {
            bogies.add(new PassengerBogie("Sleeper", 72));
            bogies.add(new PassengerBogie("AC Chair", 56));
            bogies.add(new PassengerBogie("First Class", -10)); // invalid
            bogies.add(new PassengerBogie("General", 90));
        } catch (InvalidCapacityException e) {
            System.out.println("Exception Caught: " + e.getMessage());
        }

        // Display valid bogies
        System.out.println("\nValid Bogies:");
        for (PassengerBogie b : bogies) {
            System.out.println(b.name + " -> " + b.capacity);
        }

        System.out.println("\nProgram continues safely...");
    }
}