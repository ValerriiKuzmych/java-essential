
import java.util.Hashtable;
import java.util.Map;


public class SimpleHashtable {


    Map<String, String> familiesOfCities = new Hashtable<>();

    SimpleHashtable() {
    }


    public void methodPut(String city, String familyName) {

        familiesOfCities.put(city, familyName);

    }

    public void methodGet(String city) {

        System.out.println(familiesOfCities.get(city));

    }

    public void substitution(String city, String familyName) {

      //  familiesOfCities.remove(city);
        familiesOfCities.put(city, familyName);

    }

    public void methodRemove(String city) {

        familiesOfCities.remove(city);
    }
}




