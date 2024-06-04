package Methods;

import java.util.Scanner;

public class NxNMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());

        printMatrix(number);
    }

    public static void printMatrix (int number){
        for (int i = 1; i <= number; i++){
            for (int k = 1; k <= number; k++){
                System.out.print(number + " ");
            }
            System.out.println();
        }
    }
}
