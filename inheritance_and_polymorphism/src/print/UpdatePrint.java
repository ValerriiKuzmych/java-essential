package print;

public class UpdatePrint extends Print{

    @Override
    void print(String value) {
        System.out.println("\u001B[36m"+ value +"\u001B[0m");
    }
}
