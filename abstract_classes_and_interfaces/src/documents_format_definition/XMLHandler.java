package documents_format_definition;

public class XMLHandler extends AbstractHandler{


    @Override
    void open() {

        System.out.println("XML is open");

    }

    @Override
    void create() {

        System.out.println("XML is create");

    }

    @Override
    void change() {

        System.out.println("XML is change");

    }

    @Override
    void save() {

        System.out.println("XML is save");

    }
}
