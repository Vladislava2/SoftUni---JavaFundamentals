package FundamentalsFinalExam;

import java.util.*;

public class PlantDiscovery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        Map<String, Integer> plants = new LinkedHashMap<>();
        Map<String, List<Integer>> plantNameAndRate = new LinkedHashMap<>();
        double sum;
        for (int i = 1; i <= n; i++){
            String plantInformation = scanner.nextLine();

            String plant = plantInformation.split("<->")[0];
            int rarity = Integer.parseInt(plantInformation.split("<->")[1]);

            plants.put(plant, rarity);
            plantNameAndRate.put(plant, new ArrayList<>());
        }
        String command = scanner.nextLine();
        while (!command.equals("Exhibition")){
            String commandName = command.split(": ")[0];
            switch (commandName){
                case ("Rate"):
                    String plantName = command.split(" - ")[0];
                    int rating = Integer.parseInt(command.split(" - ")[1]);
                    if (!plantNameAndRate.containsKey(plantName)){
                        plantNameAndRate.put(plantName, new ArrayList<>());
                        plantNameAndRate.get(plantName).add(rating);
                    } else {
                        System.out.println("error");
                    }
                    break;
                case ("Update"):
                    String secondPlantName = command.split(" - ")[0];
                    int rarity = Integer.parseInt(command.split(" - ")[1]);
                    if (!plants.containsKey(secondPlantName)){
                        plants.put(secondPlantName, rarity);
                    } else {
                        System.out.println("error");
                    }
                    break;
                case ("Reset"):
                    String thirdPlantName = command.split(": ")[1];
                    if (!plantNameAndRate.containsKey(thirdPlantName)){
                        plantNameAndRate.get(thirdPlantName).clear();
                    } else {
                        System.out.println("error");
                    }
                    break;
            }
            command = scanner.nextLine();
        }
        System.out.println("Plants for the exhibition:");
        for (Map.Entry<String, List<Integer>> entry : plantNameAndRate.entrySet()){
            String plantName = entry.getKey();
            int rarity = plants.get(plantName);
            if (rarity == 0) {
                System.out.println("error");
                continue; // Move to the next iteration of the loop
            }
            List<Integer> ratings = entry.getValue();

            sum = 0;

            for (int rate : ratings){
                sum += rate;
            }
            double averageGrade = ratings.isEmpty() ? 0 : sum/ratings.size();
            System.out.printf("- %s; Rarity: %d; Rating: %.2f%n", plantName, rarity, averageGrade);
        }
    }
}
