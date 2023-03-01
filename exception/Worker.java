package exception;

import java.util.ArrayList;
import java.util.Collections;

public  class Worker {

    String name, position;
    int year;

    final static int YEAR = 2023;
    final static int stage = 5;

    static ArrayList<Worker> workers = new ArrayList<Worker>(5);






     Worker(){}
     Worker(int year, String name, String position) {
        this.year = year;
        this.name = name;
        this.position = position;
    }



    @Override
     public String toString() {

             return "Worker: " + name + " position: " + position +
                     " year start: " + year;



    }


}











