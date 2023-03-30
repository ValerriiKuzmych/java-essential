package creating_a_file_and_reading_data;

import java.io.*;

public class Main {

    public static void main(String[] args) {

        File txt = new File("C:\\JavaProfessional\\Basic_IO_NIO\\src\\creating_a_file_and_reading_data\\file.txt");

        try (FileWriter writer = new FileWriter(txt, false)) {

            writer.append("Java - it's interesting language!");
            writer.flush();


        } catch (IOException e) {

            throw new RuntimeException(e);

        }

        try (BufferedReader reader = new BufferedReader(new FileReader(txt))) {

            String temp;

            while ((temp = reader.readLine()) != null) {

                System.out.println(temp);
            }


        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
