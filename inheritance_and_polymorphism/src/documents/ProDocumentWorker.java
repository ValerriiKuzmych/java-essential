package documents;

public class ProDocumentWorker extends DocumentWorker{

     @Override
    void editDocument(){

        System.out.println("Document edited");

    }
     @Override
    void saveDocument(){

        System.out.println("Document saved in old format. Save documents in new formats possible in version Expert");

    }
}
