package Exercise;


import java.util.Arrays;
import java.util.LinkedHashMap;

import java.util.Scanner;

public class Orders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        LinkedHashMap<String, Double> products = new LinkedHashMap<>();

        String inputLine = "";
       // String name = "";
       // Double price = 0.0;
       // Integer quantity;
        //String[] inputArray;

        while (!"buy".equals(inputLine)){
            inputLine = scanner.nextLine();
            String[] inputArray = Arrays.stream(inputLine.split("\\s+"))
                    .toArray(String[]::new);
            String name = inputArray[0];
            Double price = Double.parseDouble(inputArray[1]);
            Integer quantity = Integer.parseInt(inputArray[2]);
            if (!products.containsKey(name)){
                products.put(name, 0.0);
            }
            products.put(name, products.get(name) + price * quantity);

        }

        products.forEach((key, value) ->
        System.out.println(String.format("%s -> %.2f", key, value)));
    }
}
