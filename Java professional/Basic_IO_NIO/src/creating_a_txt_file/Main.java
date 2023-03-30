package creating_a_txt_file;

import java.io.*;


public class Main {

    public static void main(String[] args) throws IOException {

        File txt = new File("C:\\JavaProfessional\\Basic_IO_NIO\\src\\creating_a_txt_file\\file.txt");

        PrintWriter writer = new PrintWriter(new FileWriter(txt));

        writer.println("I'm learning");
        writer.println("It is super!");
        writer.flush();
        writer.close();

       BufferedReader reader = new BufferedReader(new FileReader(txt));

        String temp;

        while ((temp = reader.readLine()) != null) {

            System.out.println(temp);

        }

        reader.close();


    }
}
