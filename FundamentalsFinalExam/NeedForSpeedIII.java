package FundamentalsFinalExam;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class NeedForSpeedIII {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        Map<String, Integer> carAndMileage = new LinkedHashMap<>();
        Map<String, Integer> carAndFuel = new LinkedHashMap<>();
        for (int i = 1; i <= n; i++){
            String input = scanner.nextLine();
            String car = input.split("\\|")[0];
            int mileage = Integer.parseInt(input.split("\\|")[1]);
            int fuel = Integer.parseInt(input.split("\\|")[2]);
            carAndMileage.put(car, mileage);
            carAndFuel.put(car, fuel);
        }
        String command = scanner.nextLine();
        while (!command.equals("Stop")){
            String commandName = command.split(" : ")[0];
            switch (commandName){
                case ("Drive"):
                    String car = command.split(" : ")[1];
                    int distance = Integer.parseInt(command.split(" : ")[2]);
                    int fuel = Integer.parseInt(command.split(" : ")[3]);
                    if (carAndMileage.containsKey(car) && carAndFuel.containsKey(car)){
                        int newDistance = distance + carAndMileage.get(car);
                        int remainingFuel = carAndFuel.get(car) - fuel;
                        if (newDistance >= 100000){
                            carAndMileage.remove(car);
                            carAndFuel.remove(car);
                            System.out.printf("Time to sell the %s!%n", car);
                        } else {
                            if (fuel <= carAndFuel.get(car)){
                                carAndFuel.replace(car, remainingFuel);
                            } else {
                                System.out.printf("Not enough fuel to make that ride%n");
                            }
                            carAndMileage.replace(car, newDistance);
                        }
                    }
                    break;
                case ("Refuel"):
                    String secondCar = command.split(" : ")[1];
                    int secondFuel = Integer.parseInt(command.split(" : ")[2]);
                    int newFuel = secondFuel + carAndFuel.get(secondCar);
                    if (newFuel > 75) {
                        newFuel = 75;
                        carAndFuel.replace(secondCar, newFuel);
                    }
                    int refilledQuantity = newFuel - carAndFuel.get(secondCar);
                    carAndFuel.put(secondCar, newFuel);
                    System.out.printf("%s refueled with %d liters%n", secondCar, refilledQuantity);
                    break;
                case ("Revert"):
                    String thirdCar = command.split(" : ")[1];
                    int kilometers = Integer.parseInt(command.split(" : ")[2]);
                    int newMileage = carAndMileage.get(thirdCar) - kilometers;
                    if (newMileage < 10000){
                        carAndMileage.replace(thirdCar, 10000);
                    } else {
                        System.out.printf("%s mileage decreased by %d kilometers%n", thirdCar, kilometers);
                    }
                    break;
            }
            command = scanner.nextLine();
        }
        for (Map.Entry<String, Integer> entry : carAndMileage.entrySet()){
            String carName = entry.getKey();
            int mileage = entry.getValue();
            int fuel = carAndFuel.get(carName);
            System.out.printf("%s -> Mileage: %d kms, Fuel in the tank: %d lt.%n", carName, mileage, fuel);
        }
    }
}
