package ObjectsAndClasses.RawData;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        List<Car> cars = new ArrayList<>();
        List<Car> pressureUnder1 = new ArrayList<>();
        List<Car> enginePowerOver250 = new ArrayList<>();

        for (int i = 1; i <= n; i++){
            String information = scanner.nextLine();

            String model = information.split(" ")[0];
            int engineSpeed = Integer.parseInt(information.split(" ")[1]);
            int enginePower = Integer.parseInt(information.split(" ")[2]);
            int cargoWeight = Integer.parseInt(information.split(" ")[3]);
            String cargoType = information.split(" ")[4];
            double tire1Pressure = Double.parseDouble(information.split(" ")[5]);
            int tire1Age = Integer.parseInt(information.split(" ")[6]);
            double tire2Pressure = Double.parseDouble(information.split(" ")[7]);
            int tire2Age = Integer.parseInt(information.split(" ")[8]);
            double tire3Pressure = Double.parseDouble(information.split(" ")[9]);
            int tire3Age = Integer.parseInt(information.split(" ")[10]);
            double tire4Pressure = Double.parseDouble(information.split(" ")[11]);
            int tire4Age = Integer.parseInt(information.split(" ")[12]);

            Engine engine = new Engine(engineSpeed, enginePower);
            Cargo cargo = new Cargo(cargoWeight, cargoType);
            Tire tire = new Tire(tire1Pressure, tire1Age, tire2Pressure, tire2Age, tire3Pressure, tire3Age, tire4Pressure, tire4Age);
            Car car = new Car(model, engine, cargo, tire);

            if (tire1Pressure < 1 || tire2Pressure < 1|| tire3Pressure < 1|| tire4Pressure < 1){
                pressureUnder1.add(car);
            }

            if (enginePower > 250){
                enginePowerOver250.add(car);
            }

            cars.add(car);
        }

        String command = scanner.nextLine();
        switch (command){
            case "fragile":
                for (Car car : pressureUnder1){
                    System.out.printf("%s%n", car.getModel());
                }
                break;
            case "flamable":
                for (Car car : enginePowerOver250){
                    System.out.printf("%s%n", car.getModel());
                }
                break;
        }
    }
}
