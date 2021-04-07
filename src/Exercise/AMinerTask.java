package Exercise;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedHashMap;


public class AMinerTask {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));


        LinkedHashMap<String, Integer> resources = new LinkedHashMap<>();

        String input = "";

        while (!"stop".equals(input = reader.readLine())){
            String resource = input;
            int quantity = Integer.parseInt(reader.readLine());

            if (!resources.containsKey(resource)){
                resources.put(resource, quantity);
            }else {
                resources.put(resource, resources.get(resource) + quantity);
            }
        }

        resources.forEach((key, value) ->
                System.out.println(String.format("%s -> %d", key, value)));
    }
}
