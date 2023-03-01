package exception;


import java.util.Scanner;



public class Main {
    public static void main(String[] args) {





        Scanner in = new Scanner(System.in);



        for (int i = 0; i < 2; i++) {

            System.out.print("Введите имя сотрудника: ");

            String name = in.next();

            System.out.print("Введите должность: ");
            String position = in.next();

            System.out.print("Введите год начала работы сотрудника: ");

            try {

                int year = in.nextInt();
                Worker worker = new Worker(year, name, position);
                Worker.workers.add(i, worker);


            }
            catch (Exception e){
                System.out.println("Вы ввели год в неправильном формате");
            }





            System.out.println(Worker.workers.toString());











        }


    }
}
