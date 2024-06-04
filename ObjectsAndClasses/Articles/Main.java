package ObjectsAndClasses.Articles;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> article = Arrays.stream(scanner.nextLine().split(", ")).collect(Collectors.toList());
        String title = article.get(0);
        String content = article.get(1);
        String author = article.get(2);
        Article articleObject = new Article(title, content, author);
        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= n; i++){
            String command = scanner.nextLine();
            String commandName = command.split(": ")[0];
            String newValue = command.split(": ")[1];
            switch (commandName){
                case ("Edit"):
                    articleObject.edit(newValue);
                    break;
                case ("ChangeAuthor"):
                    articleObject.changeAuthor(newValue);
                    break;
                case ("Rename"):
                    articleObject.rename(newValue);
                    break;
            }
        }
        System.out.println(articleObject.toString());
    }
}
