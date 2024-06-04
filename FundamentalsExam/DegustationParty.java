package FundamentalsExam;


import java.util.*;

public class DegustationParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, List<String>> likedMeals = new LinkedHashMap<>();
        Map<String, Integer> unlikedMealsCount = new LinkedHashMap<>();

        String input;
        while (!(input = scanner.nextLine()).equals("Stop")) {
            String[] tokens = input.split("-");
            String command = tokens[0];
            String guest = tokens[1];
            String meal = tokens[2];

            switch (command) {
                case "Like":
                    likedMeals.putIfAbsent(guest, new ArrayList<>());
                    List<String> guestMeals = likedMeals.get(guest);
                    if (!guestMeals.contains(meal)) {
                        guestMeals.add(meal);
                    }
                    break;
                case "Dislike":
                    if (!likedMeals.containsKey(guest)) {
                        System.out.println(guest + " is not at the party.");
                    } else if (!likedMeals.get(guest).contains(meal)) {
                        System.out.println(guest + " doesn't have the " + meal + " in his/her collection.");
                    } else {
                        likedMeals.get(guest).remove(meal);
                        unlikedMealsCount.put(meal, unlikedMealsCount.getOrDefault(meal, 0) + 1);
                        System.out.println(guest + " doesn't like the " + meal + ".");
                    }
                    break;
            }
        }

        likedMeals.forEach((guest, meals) -> {
            System.out.print(guest + ": ");
            System.out.println(String.join(", ", meals));
        });

        System.out.print("Unliked meals: ");
        int totalUnlikedMeals = unlikedMealsCount.values().stream().mapToInt(Integer::intValue).sum();
        System.out.println(totalUnlikedMeals);
    }
}

