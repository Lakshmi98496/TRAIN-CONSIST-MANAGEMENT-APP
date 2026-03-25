import java.util.ArrayList;
import java.util.List;

public class UseCase2TrainConsistMgmt {

    public static void main(String[] args) {

        System.out.println("====================================");
        System.out.println("UC2 - Add Passenger Bogies to Train");
        System.out.println("====================================\n");

        // Create ArrayList
        List<String> passengerBogies = new ArrayList<>();

        // ---- CREATE (Add bogies) ----
        passengerBogies.add("B1");
        passengerBogies.add("B2");
        passengerBogies.add("B3");

        System.out.println("After Adding Bogies: " + passengerBogies);

        // ---- DELETE (Remove bogie) ----
        passengerBogies.remove("B2");

        System.out.println("After Removing B2: " + passengerBogies);

        // ---- SEARCH (Check availability) ----
        String searchBogie = "B1";

        if (passengerBogies.contains(searchBogie)) {
            System.out.println(searchBogie + " is available in the train.");
        } else {
            System.out.println(searchBogie + " is NOT available.");
        }

        // ---- DISPLAY FINAL CONSIST ----
        System.out.println("\nFinal Train Consist:");
        for (String bogie : passengerBogies) {
            System.out.println(bogie);
        }
    }
}