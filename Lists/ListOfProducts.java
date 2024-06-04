package Lists;

import java.util.*;

public class ListOfProducts {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int productsCount = Integer.parseInt(scanner.nextLine());
        List<String> listOfProducts = new ArrayList<>();

        for (int i = 1; i <= productsCount; i++){
            String products = scanner.nextLine();
            listOfProducts.add(products);
        }

        Collections.sort(listOfProducts);

        for (int i = 0; i < listOfProducts.size(); i++){
            System.out.printf("%d.%s%n", i+1, listOfProducts.get(i));
        }

    }
}
