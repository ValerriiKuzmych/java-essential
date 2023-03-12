package computer;

public class Computer {

    int numberComputer;

   static Computer[] computers = new Computer[5];

    public Computer(int numberComputer) {
        this.numberComputer = numberComputer;
    }


    public static void main(String[] args) {

        for (int i = 0; i < computers.length; i++) {
            computers[i] = new Computer(i+1);

        }

        for (int i = 0; i <computers.length; i++) {
            System.out.println(computers[i].numberComputer);

        }
    }
}
