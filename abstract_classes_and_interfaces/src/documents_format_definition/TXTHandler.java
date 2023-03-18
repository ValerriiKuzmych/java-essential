package documents_format_definition;

public class TXTHandler extends AbstractHandler {


    @Override
    void open() {

        System.out.println("TXT is open");

    }

    @Override
    void create() {

        System.out.println("TXT is create");

    }

    @Override
    void change() {

        System.out.println("TXT is change");

    }

    @Override
    void save() {

        System.out.println("TXT is save");

    }
}
