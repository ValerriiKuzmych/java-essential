import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Hashtable;
import java.util.Map;

public class SimpleHashtable {


    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        Map<String, String> map = new Hashtable<>();

        int temp = 1;

        while (true) {

            System.out.println("*enter the exit to exit*");
            System.out.print("Enter city № " + temp + ": ");
            String city = reader.readLine();

            if (city.equals("exit")) {

                break;
            }

            System.out.print("Enter familyname of " + city + ": ");
            String family = reader.readLine();


            if (family.equals("exit")) {

                break;
            }

            map.put(city, family);

            temp++;

        }


        for (Map.Entry<String, String> pair : map.entrySet()) {

            String key = pair.getKey();

            System.out.println(key);
        }

        while (true) {

            System.out.println("*enter the exit to exit*");
            System.out.print("Show the family from city: ");
            String city = reader.readLine();

            if (city.equals("exit")) {

                break;
            }

            if (map.containsKey(city) == true) {

                System.out.println("In " + city + " live family: " + map.get(city));
            } else {
                System.out.println("City " + city + " missing from the list.");
            }
        }

    }
}
