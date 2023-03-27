
public class Main {

    public static void main(String[] args) {


        SimpleHashtable simpleHashtable = new SimpleHashtable();


        simpleHashtable.methodPut("Berlin", "Kuzmych");
        simpleHashtable.methodPut("Monaco", "Gustavo");
        simpleHashtable.methodPut("London", "Poppins");
        simpleHashtable.methodPut("New York", "Kauopulus");


        simpleHashtable.methodGet("Berlin");
        simpleHashtable.methodGet("Monaco");
        simpleHashtable.methodGet("New York");
        simpleHashtable.methodGet("London");

        simpleHashtable.substitution("Berlin", "Flintstones");
        simpleHashtable.methodRemove("New York");

        System.out.println("-------------------------");
        
        simpleHashtable.methodGet("Berlin");
        simpleHashtable.methodGet("Monaco");
        simpleHashtable.methodGet("New York");
        simpleHashtable.methodGet("London");


    }
}