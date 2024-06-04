package Array;

import java.util.Scanner;

public class CommonElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String [] firstArr = scanner.nextLine().split(" ");
        String [] secondArr = scanner.nextLine().split(" ");

        for (String elements2 : secondArr){
            for (String elements1 : firstArr){
                if (elements2.equals(elements1)){
                    System.out.print(elements1 + " ");
                }
            }
        }
    }
}
