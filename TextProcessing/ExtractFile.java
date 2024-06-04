package TextProcessing;

import java.util.Scanner;

public class ExtractFile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        String fileNameAndExtension = input.split("\\\\")[3];
        String fileName = fileNameAndExtension.split("\\.")[0];
        String extension = fileNameAndExtension.split("\\.")[1];

        //File name: Template
        //File extension: pptx

        System.out.printf("File name: %s%n", fileName);
        System.out.printf("File extension: %s", extension);
    }
}
