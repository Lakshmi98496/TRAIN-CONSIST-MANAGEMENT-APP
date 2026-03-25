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