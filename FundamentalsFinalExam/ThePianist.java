package FundamentalsFinalExam;

import java.util.*;

public class ThePianist {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        Map<String, String> pieceAndComposer = new LinkedHashMap<>();
        Map<String, String> pieceAndKey = new LinkedHashMap<>();

        for (int i = 1; i <= n; i++){
            String pieces = scanner.nextLine();
            String piece = pieces.split("\\|")[0];
            String composer = pieces.split("\\|")[1];
            String key = pieces.split("\\|")[2];

            pieceAndComposer.put(piece, composer);
            pieceAndKey.put(piece, key);
        }

        String command = scanner.nextLine();
        while (!command.equals("Stop")){
            String commandName = command.split("\\|")[0];

            switch (commandName){
                case ("Add"):
                    String piece = command.split("\\|")[1];
                    String composer = command.split("\\|")[2];
                    String key = command.split("\\|")[3];
                    if (pieceAndComposer.containsKey(piece) && pieceAndKey.containsKey(piece)){
                        System.out.printf("%s is already in the collection!%n", piece);
                    } else if (!pieceAndComposer.containsKey(piece) && !pieceAndKey.containsKey(piece)) {
                        pieceAndComposer.put(piece, composer);
                        pieceAndKey.put(piece, key);
                        System.out.printf("%s by %s in %s added to the collection!%n", piece, composer, key);
                    }
                    break;
                case ("Remove"):
                    String secondPiece = command.split("\\|")[1];
                    if (pieceAndComposer.containsKey(secondPiece) && pieceAndKey.containsKey(secondPiece)){
                        pieceAndComposer.remove(secondPiece);
                        pieceAndKey.remove(secondPiece);
                        System.out.printf("Successfully removed %s!%n", secondPiece);
                    } else if (!pieceAndComposer.containsKey(secondPiece) && !pieceAndKey.containsKey(secondPiece)){
                        System.out.printf("Invalid operation! %s does not exist in the collection.%n", secondPiece);
                    }
                    break;
                case ("ChangeKey"):
                    String thirdPiece = command.split("\\|")[1];
                    String newKey = command.split("\\|")[2];
                    if (pieceAndComposer.containsKey(thirdPiece) && pieceAndKey.containsKey(thirdPiece)){
                        pieceAndKey.replace(thirdPiece, newKey);
                        System.out.printf("Changed the key of %s to %s!%n", thirdPiece, newKey);
                    } else if (!pieceAndComposer.containsKey(thirdPiece) && !pieceAndKey.containsKey(thirdPiece)){
                        System.out.printf("Invalid operation! %s does not exist in the collection.%n",thirdPiece);
                    }
                    break;
            }
            command = scanner.nextLine();
        }
        for (Map.Entry<String, String> entry : pieceAndComposer.entrySet()){
            String key = entry.getKey();
            String value = entry.getValue();
            String secondValue = pieceAndKey.get(key);
            System.out.printf("%s -> Composer: %s, Key: %s%n", key, value, secondValue);
        }
    }
}
