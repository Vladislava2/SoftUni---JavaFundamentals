package Lists;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Train {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> wagons = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        int maxCapacity = Integer.parseInt(scanner.nextLine());

        String input = scanner.nextLine();

        while (!input.equals("end")){

            if (input.contains("Add")){
                int passenger = Integer.parseInt(input.split(" ")[1]);
                wagons.add(passenger);
            } else {
                int passengerForAdd = Integer.parseInt(input);
                for (int i = 0; i <= wagons.size()-1; i++){
                    int passengerInWagon = wagons.get(i);
                    if (passengerForAdd + passengerInWagon <= maxCapacity){
                        wagons.set(i,passengerForAdd + passengerInWagon);
                        break;
                    }
                }
            }

            input = scanner.nextLine();
        }
        for (Integer wagon : wagons){
            System.out.print(wagon + " ");
        }
    }
}
