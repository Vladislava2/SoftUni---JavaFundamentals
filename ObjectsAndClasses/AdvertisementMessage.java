package ObjectsAndClasses;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class AdvertisementMessage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> phrases = Arrays.asList("Excellent product.", "Such a great product.", "I always use that product.", "Best product of its category.", "Exceptional product.", "I can’t live without this product.");
        List<String> events = Arrays.asList("Now I feel good.", "I have succeeded with this product.", "Makes miracles. I am happy of the results!", "I cannot believe but now I feel awesome.", "Try it yourself, I am very satisfied.", "I feel great!");
        List<String> authors = Arrays.asList("Diana", "Petya", "Elena", "Katya", "Iva", "Annie", "Eva");
        List<String> cities = Arrays.asList("Burgas", "Sofia", "Plovdiv", "Varna", "Ruse");
        int n = Integer.parseInt(scanner.nextLine());
        Random random = new Random();
        for (int i = 0; i < n; i++){
            int phraseIndex = random.nextInt(0, phrases.size());
            int eventIndex = random.nextInt(0, events.size());
            int authorIndex = random.nextInt(0, authors.size());
            int cityIndex = random.nextInt(0, cities.size());

            System.out.print(phrases.get(phraseIndex) + " " + events.get(eventIndex) + " " + authors.get(authorIndex) + " - " + cities.get(cityIndex));
            System.out.println();
        }
    }
}
