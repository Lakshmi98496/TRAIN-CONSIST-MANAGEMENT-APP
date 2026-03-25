import java.util.HashSet;
import java.util.Set;

public class UseCase3TrainConsistMgmt {

    public static void main(String[] args) {

        System.out.println("====================================");
        System.out.println("UC3 - Track Unique Bogie IDs");
        System.out.println("====================================\n");

        // Create Set (stores only unique values)
        Set<String> bogies = new HashSet<>();

        // ---- ADD IDs (including duplicates) ----
        bogies.add("BG101");
        bogies.add("BG102");
        bogies.add("BG103");
        bogies.add("BG104");

        // Duplicate entries (will be ignored)
        bogies.add("BG101");
        bogies.add("BG102");

        // ---- DISPLAY UNIQUE BOGIES ----
        System.out.println("Unique Bogie IDs:");
        for (String bogie : bogies) {
            System.out.println(bogie);
        }
    }
}
import java.util.LinkedList;
import java.util.List;

public class UseCase4TrainConsistMgmt {

    public static void main(String[] args) {

        System.out.println("====================================");
        System.out.println("UC4 - Maintain Ordered Bogie Consist");
        System.out.println("====================================\n");

        // Create LinkedList
        List<String> trainConsist = new LinkedList<>();

        // ---- ADD bogies in sequence ----
        trainConsist.add("BG101");
        trainConsist.add("BG102");
        trainConsist.add("BG103");

        System.out.println("Initial Train: " + trainConsist);

        // ---- INSERT at specific position ----
        trainConsist.add(1, "BG105"); // insert at index 1

        System.out.println("After Insertion at position 1: " + trainConsist);

        // ---- REMOVE from front ----
        trainConsist.remove(0);

        System.out.println("After Removing Front: " + trainConsist);

        // ---- REMOVE from rear ----
        trainConsist.remove(trainConsist.size() - 1);

        System.out.println("After Removing Rear: " + trainConsist);

        // ---- FINAL DISPLAY ----
        System.out.println("\nFinal Train Structure:");
        for (String bogie : trainConsist) {
            System.out.println(bogie);
        }
    }
}