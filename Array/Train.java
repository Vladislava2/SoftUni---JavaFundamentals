package Array;

import java.util.Scanner;

public class Train {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int [] numberOfPeople = new int [n];
        int sum = 0;

        for (int position = 0; position < n; position++){
            numberOfPeople[position] = Integer.parseInt(scanner.nextLine());
        }
        for (int number : numberOfPeople){
            System.out.print(number + " ");
            sum = sum + number;
        }
        System.out.println();
        System.out.println(sum);
    }
}
