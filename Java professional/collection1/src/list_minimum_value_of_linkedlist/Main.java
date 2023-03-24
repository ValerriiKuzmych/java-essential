package list_minimum_value_of_linkedlist;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {

        LinkedList<Integer> integerList = getIntegerList();

        System.out.println("Minimal value of integer list " + getMinimum(integerList));
    }

    public static LinkedList<Integer> getIntegerList()  {

        Scanner sc = new Scanner(System.in);

        LinkedList<Integer> integerLinkedList = new LinkedList<>();

        System.out.print("Enter list size: ");

        int listSize = sc.nextInt();

        for (int i = 0; i < listSize; i++) {

            System.out.print("Enter integer value: ");



            integerLinkedList.add(sc.nextInt());

        }

        return integerLinkedList;
    }

    public static int getMinimum(LinkedList<Integer> list){

        Collections.sort(list);

        return list.get(0);
    }
}
