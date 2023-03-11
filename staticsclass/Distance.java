package staticsclass;

import java.util.Scanner;

public class Distance {

    double distance;

    Distance(double meters){

        distance = meters;

        methodDistancePrint();
    }



    public void methodDistancePrint(){

        System.out.println("Distance: "+ distance + " meters.");

        Converter.methodConverterMetersToKillometers(distance);

}
    public static class Converter{


        static void methodConverterMetersToKillometers(double meters){

            double killometers = meters / 1000;

            System.out.println("Converter meters to killometers: " +killometers + " killometers");

            methodConverterKillometersToMiles(killometers);


        }
      static void methodConverterKillometersToMiles(double killometers){

            double miles = killometers / 1.609344;

          System.out.println("Converter killometers to miles: " + miles + " miles" );

          methodConverterMilesToMeters(miles);

        }

       static void methodConverterMilesToMeters(double miles){

            double meters = miles * 1609.344;

           System.out.println("Converter miles to meters: " + meters + " meters");

        }

    }

}

class MainDistacne{

    public static void main(String[] args) {

        double meters;

        Scanner in = new Scanner(System.in);

        System.out.println("Input distance meters: ");

         meters = in.nextDouble();

        Distance distance = new Distance(meters);




    }
}


