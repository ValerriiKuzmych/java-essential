package documents;

import java.util.Scanner;

public class Main {

    static final int CODE_OF_PRO_VERSION = 12345;
    static final int CODE_OF_EXPERT_VERSION = 54321;
    

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the program version code: ");

        int code = sc.nextInt();


        if (code == CODE_OF_PRO_VERSION) {

            DocumentWorker proDocumentWorker = new ProDocumentWorker();

            System.out.println("Pro version");

            proDocumentWorker.openDocument();
            proDocumentWorker.editDocument();
            proDocumentWorker.saveDocument();


        } else  if (code == CODE_OF_EXPERT_VERSION) {

            DocumentWorker expertDocumentWorker = new ExpertDocumentWorker();

            System.out.println("Expert version");

                expertDocumentWorker.openDocument();
                expertDocumentWorker.editDocument();
                expertDocumentWorker.saveDocument();

        } else {

            DocumentWorker documentWorker = new DocumentWorker();

            System.out.println("Base version");


                    documentWorker.openDocument();
                    documentWorker.editDocument();
                    documentWorker.saveDocument();

        }

    }
}

