package ObjectsAndClasses.Vehicles;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        List<Vehicle> vehicles = new ArrayList<>();
        int sum = 0;
        int count = 0;
        double average = 0;
        List<Integer> horsepowerTrucks = new ArrayList<>();
        List<Integer> horsepowerCars = new ArrayList<>();
        String typeOfVehicle = "";
        String model = "";
        String color = "";
        int horsepower = 0;

        while (!input.equals("End")) {
            typeOfVehicle = input.split(" ")[0];
            model = input.split(" ")[1];
            color = input.split(" ")[2];
            horsepower = Integer.parseInt(input.split(" ")[3]);

            Vehicle vehicle = new Vehicle(typeOfVehicle, model, color, horsepower);

            vehicles.add(vehicle);

            input = scanner.nextLine();
        }
        if (input.equals("Close the Catalogue")) {
            for (Vehicle vehicle : vehicles) {
                if (typeOfVehicle.equals("truck")) {
                    horsepowerTrucks.add(horsepower);
                    for (int i = 0; i <= horsepowerTrucks.size() - 1; i++) {
                        count++;
                        int horsepower1 = horsepowerTrucks.indexOf(i);
                        sum += horsepower1;
                        average = sum * 1.0 / count;
                    }
                    System.out.printf("%s have average horsepower of %.2f.", typeOfVehicle, average);
                } else {
                    if (typeOfVehicle.equals("car")) {
                        horsepowerCars.add(horsepower);
                        for (int i = 0; i <= horsepowerCars.size() - 1; i++) {
                            count++;
                            int horsepower2 = horsepowerTrucks.indexOf(i);
                            sum += horsepower2;
                            average = sum * 1.0 / count;
                        }
                    }
                    System.out.printf("%s have average horsepower of %.2f.", typeOfVehicle, average);
                }
            }
        } else {
            for (Vehicle vehicle : vehicles){
                System.out.print(vehicle);

            }
        }
    }
}
