import java.util.ArrayList;

class Train {
    private ArrayList<String> bogies;

    // Constructor
    public Train() {
        bogies = new ArrayList<>();
    }

    // Get bogie count
    public int getBogieCount() {
        return bogies.size();
    }

    // Display train state
    public void displayTrain() {
        if (bogies.isEmpty()) {
            System.out.println("Train is empty. No bogies attached.");
        } else {
            System.out.println("Bogies: " + bogies);
        }
    }
}

public class UseCase1TrainConsistMgmt {
    public static void main(String[] args) {

        // Initialize Train
        Train train = new Train();

        // Display initial state
        System.out.println("=== Train Consist Management System ===");
        System.out.println("Initial Bogie Count: " + train.getBogieCount());

        train.displayTrain();
    }
}