package Methods;

import java.util.Scanner;

public class VowelsCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        printVowels(input);


    }

    public static void printVowels (String input){
        String newString = input.toLowerCase();
        int countVowels = 0;
        for (char letter : newString.toCharArray()){
            if (letter == 'a' || letter == 'e' || letter == 'u' || letter == 'o' || letter == 'i') {
                countVowels++;
            }
        }
        System.out.println(countVowels);
    }
}
