package creating_a_file_and_sorting_data_of_file;

import java.io.*;
import java.util.Arrays;


public class Main {

    public static void main(String[] args) {


        try (OutputStream outputStream = new FileOutputStream("C:\\JavaProfessional\\Basic_IO_NIO\\src\\creating_a_file_and_sorting_data_of_file\\file.txt");
             InputStream inputStream = new FileInputStream("C:\\JavaProfessional\\Basic_IO_NIO\\src\\creating_a_file_and_sorting_data_of_file\\file.txt")) {

            byte[] byteArray;
            byteArray = new byte[10];

            for (int i = 0; i < byteArray.length; i++) {

                byteArray[i] = (byte) (Math.random() * 50);

            }

            outputStream.write(byteArray);
            outputStream.flush();

            System.out.println(Arrays.toString(byteArray));


            byteArray = inputStream.readAllBytes();

            Arrays.sort(byteArray);

            outputStream.write(byteArray);
            outputStream.flush();


            byteArray = inputStream.readAllBytes();

            outputStream.close();
            inputStream.close();
            
            System.out.println(Arrays.toString(byteArray));


        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}
