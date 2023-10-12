import java.util.*;

public class TruthAndDareGame {

    public static void main(String[] args) {
        List<String> truthQuestions = new ArrayList<>();
        List<String> dareTasks = new ArrayList<>();


        truthQuestions.add("Have you ever cheated on a test?");
        truthQuestions.add("What is your biggest fear?");
        truthQuestions.add("Have you ever lied to your parents?");


        dareTasks.add("Sing a song loudly in public.");
        dareTasks.add("Do 10 push-ups right now.");
        dareTasks.add("Call a random number and tell them a joke.");

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to Truth and Dare Game!");
        System.out.println("--------------------------------");

        while (true) {
            System.out.println("Choose an option:");
            System.out.println("1. Truth");
            System.out.println("2. Dare");
            System.out.println("3. Quit");

            int choice = scanner.nextInt();

            if (choice == 1) {
                // Truth
                int randomIndex = random.nextInt(truthQuestions.size());
                String truthQuestion = truthQuestions.get(randomIndex);
                System.out.println("Truth question: " + truthQuestion);
                scanner.nextLine(); // Consume newline character
                scanner.nextLine(); // Wait for user to press enter
            } else if (choice == 2) {
                // Dare
                int randomIndex = random.nextInt(dareTasks.size());
                String dareTask = dareTasks.get(randomIndex);
                System.out.println("Dare task: " + dareTask);
                scanner.nextLine(); // Consume newline character
                scanner.nextLine(); // Wait for user to press enter
            } else if (choice == 3) {
                // Quit the game
                break;
            } else {
                System.out.println("Invalid choice. Please try again.");
            }
        }

        System.out.println("Thanks for playing the Truth and Dare Game!");
    }
}
