package EveryFirstTaskFromMidTest;
import java.util.Scanner;
public class GuineaPig {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        double foodQuantity = Double.parseDouble(scanner.nextLine());
        double hayQuantity = Double.parseDouble(scanner.nextLine());
        double coverQuantity = Double.parseDouble(scanner.nextLine());
        double guineaWeight = Double.parseDouble(scanner.nextLine());

        for (int i = 1; i <= 30; i ++){
            foodQuantity = foodQuantity - 0.3;
            if (foodQuantity <= 0){
                System.out.println("Merry must go to the pet store!");
                return;
            }
            if (i % 2 == 0){
                double hay = foodQuantity * 0.05;
                hayQuantity -= hay;
                if (hayQuantity <= 0){
                    System.out.println("Merry must go to the pet store!");
                    return;
                }
            }
            if (i % 3 == 0){
                double cover = guineaWeight / 3.0;
                coverQuantity -= cover;
                if (coverQuantity <= 0){
                    System.out.println("Merry must go to the pet store!");
                    return;
                }
            }
        }
        System.out.printf("Everything is fine! Puppy is happy! Food: %.2f, Hay: %.2f, Cover: %.2f.", foodQuantity, hayQuantity, coverQuantity);

    }
}
