package Methods;

import java.util.Scanner;

public class PrintingTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i <= n; i++){
            printTriangle(1, i);
        }

        for (int i = n - 1; i >= 1; i--){
            printTriangle(1, i);
        }
    }
    public static void printTriangle(int start, int end){
        for (int i = start; i <= end; i++){
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
