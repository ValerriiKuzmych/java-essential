public class Animal implements Comparable {
    String breed;
    int weight;
    int speed;
    int price;

    Animal(String breed, int weight, int speed, int price) {
        this.breed = breed;
        this.weight = weight;
        this.speed = speed;
        this.price = price;
    }


    @Override
    public int compareTo(Object o) {


        int tmp = this.speed - ((Animal) o).speed;

        if (tmp == 0) {

            tmp = this.weight - ((Animal) o).weight;

        }
        if (tmp == 0) {

            tmp = this.price - ((Animal) o).price;

        }
        if (tmp == 0) {

            return this.breed.compareTo(((Animal) o).breed);
        } else {
            return tmp;
        }
    }


    public String toString() {

        return this.breed + " " + this.weight + " " + this.speed + " " + this.price;
    }


}