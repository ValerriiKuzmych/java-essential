package arraylist;

import java.util.ArrayList;
import java.util.ListIterator;

public class Main {
    public static void main(String[] args) {

        ArrayList<Integer> arrayListInt = new ArrayList<>();

        for (int i = 0; i < 15; i++) {
            arrayListInt.add(i);

        }

        System.out.println(arrayListInt.toString());

       ListIterator<Integer> listIterator = arrayListInt.listIterator();

        while (listIterator.hasNext()){

            Integer integer = listIterator.next();
            listIterator.set(integer +1);


        }
        System.out.println(arrayListInt.toString());

    }

}
