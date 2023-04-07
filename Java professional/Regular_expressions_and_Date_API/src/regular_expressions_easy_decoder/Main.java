package regular_expressions_easy_decoder;


import java.io.*;


public class Main {

    public static void main(String[] args) {


        File textFile = new File("C:\\JavaProfessional\\Regular_expressions_and_Date_API\\src\\regular_expressions_easy_decoder\\text.txt");

        BufferedReader buffReader;
        BufferedWriter buffWriter;

        StringBuilder stringBuilder;

        EasyDecoder easyDecoder;

        String text;


        try {
            buffReader = new BufferedReader(new FileReader(textFile));

            stringBuilder = new StringBuilder();

            String line = buffReader.readLine();


            while (line != null) {

                stringBuilder.append(line);
                stringBuilder.append(System.lineSeparator());
                line = buffReader.readLine();

            }

            text = stringBuilder.toString();
            System.out.println(text);
            System.out.println("*********************************");


            easyDecoder = new EasyDecoder(text);

            easyDecoder.ReplacingPrepositions();
            buffReader.close();


            buffWriter = new BufferedWriter(new FileWriter(textFile));


            buffWriter.write(easyDecoder.outputText);

            buffWriter.flush();
            buffWriter.close();


        } catch
        (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);

        }


    }
}
