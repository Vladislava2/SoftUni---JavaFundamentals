package ObjectsAndClasses;

import java.util.*;

public class RandomizeWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] words = scanner.nextLine().split(" ");
        Random rnd = new Random();

        for (int i = 0; i <= words.length-1; i++){
            int indexX = rnd.nextInt(words.length);
            int indexY = rnd.nextInt(words.length);

            String oldWord = words[indexX];
            words[indexX] = words[indexY];
            words[indexY] = oldWord;

        }
        for (String word : words){
            System.out.println(word);
        }
    }
}
