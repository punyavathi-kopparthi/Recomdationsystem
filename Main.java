import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Movie database (genre-wise)
        Map<String, List<String>> movies = new HashMap<>();

        movies.put("Action", Arrays.asList("Avengers", "Iron Man", "Batman"));
        movies.put("Romance", Arrays.asList("Titanic", "The Notebook"));
        movies.put("Sci-Fi", Arrays.asList("Inception", "Interstellar", "The Matrix"));
        movies.put("Animation", Arrays.asList("Frozen", "Moana"));

        // Input from user
        System.out.println("🎬 Movie Recommendation System");
        System.out.println("Available genres: Action, Romance, Sci-Fi, Animation");

        System.out.print("Enter your preferred genre: ");
        String genre = sc.nextLine();

        // Recommendation logic
        if (movies.containsKey(genre)) {
            System.out.println("\nRecommended movies for " + genre + ":");
            for (String movie : movies.get(genre)) {
                System.out.println("- " + movie);
            }
        } else {
            System.out.println("❌ Genre not found!");
        }

        sc.close();
    }
}