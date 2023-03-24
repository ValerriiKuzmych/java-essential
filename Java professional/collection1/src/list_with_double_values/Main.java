package list_with_double_values;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;


public class Main {

    static ArrayList<String> doubleValues(ArrayList<String> list) {
        ArrayList<String> doubleList = list;

        int doubleListLeSize = doubleList.size();

        for (int i = 0; i < doubleListLeSize; i++) {

            String value = null;

            while (value != doubleList.get(i)) {

                value = doubleList.get(i);


                doubleList.add(value);
                doubleList.add(value);

            }


        }

       for (int i = 0; i < doubleListLeSize; i++) {

           doubleList.remove(0);

       }

       return doubleList;


    }


    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<String> listNames = new ArrayList<>();


        for (int i = 0; i < 5; i++) {

            System.out.println("Enter name: ");

            String name = reader.readLine();

            listNames.add(name);

        }

        for (String temp : listNames
        ) {
            System.out.println(temp);

        }

        System.out.println("------------------");

        ArrayList<String> doubleValues = doubleValues(listNames);


        for (String tmp: doubleValues) {

            System.out.println(tmp);

        }




    }
}