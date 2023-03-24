package list_and_keyboard_input;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {

        List<String> names = new ArrayList<>();

        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("To quit, enter: end");

        while (true) {




            System.out.print("Enter name: " );


            String name = input.readLine();



            if (name.equals("end")) {

                for (String temp : names) {

                    System.out.println(temp);
                }

                return;

            } else {

                names.add(name);
            }

        }


    }
}
