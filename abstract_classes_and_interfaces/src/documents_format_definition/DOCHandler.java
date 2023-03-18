package documents_format_definition;

public class DOCHandler extends AbstractHandler{

    @Override
    void open() {

        System.out.println("DOC is open");

    }

    @Override
    void create() {

        System.out.println("DOC is create");

    }

    @Override
    void change() {

        System.out.println("DOC is change");

    }

    @Override
    void save() {

        System.out.println("DOC is save");

    }
}
