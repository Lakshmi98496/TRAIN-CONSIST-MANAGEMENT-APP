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
import java.util.Scanner;
import java.util.regex.Pattern;

public class UseCase11TrainConsistMgmt {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Accept input
        System.out.print("Enter Train ID (Format: TRN-1234): ");
        String trainId = scanner.nextLine();

        System.out.print("Enter Cargo Code (Format: PET-AB): ");
        String cargoCode = scanner.nextLine();

        // ----- DEFINE REGEX RULES -----

        // TRN-1234 → TRN + hyphen + exactly 4 digits
        String trainRegex = "TRN-\\d{4}";

        // PET-AB → 3 uppercase letters + hyphen + 2 uppercase letters
        String cargoRegex = "[A-Z]{3}-[A-Z]{2}";

        // ----- VALIDATION USING Pattern -----

        boolean isTrainValid = Pattern.matches(trainRegex, trainId);
        boolean isCargoValid = Pattern.matches(cargoRegex, cargoCode);

        // Display results
        System.out.println("\nValidation Results:");

        if (isTrainValid) {
            System.out.println("Train ID is VALID");
        } else {
            System.out.println("Train ID is INVALID");
        }

        if (isCargoValid) {
            System.out.println("Cargo Code is VALID");
        } else {
            System.out.println("Cargo Code is INVALID");
        }

        scanner.close();
    }
}