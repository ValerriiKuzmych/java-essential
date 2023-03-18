package documents_format_definition;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        String formatDoc;

        Scanner sc = new Scanner(System.in);



            System.out.print("Enter document format: ");

            formatDoc = sc.next();



            switch (formatDoc) {

                case "txt":

                        TXTHandler txt = new TXTHandler();

                        txt.open();
                        txt.create();
                        txt.change();
                        txt.save();
                        break;

                case "doc":

                        DOCHandler doc = new DOCHandler();

                        doc.open();
                        doc.create();
                        doc.change();
                        doc.save();
                        break;

                case "xml":

                        XMLHandler xml = new XMLHandler();

                        xml.open();
                        xml.create();
                        xml.change();
                        xml.save();
                        break;

                default:
                        System.out.println("wrong format");
                        break;




        }
    }
}