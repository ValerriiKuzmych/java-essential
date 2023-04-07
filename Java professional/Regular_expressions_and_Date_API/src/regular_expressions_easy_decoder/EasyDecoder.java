package regular_expressions_easy_decoder;


import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EasyDecoder {

    String inputText;
    String outputText;

    Pattern pattern = Pattern.compile("\\b[a-zA-Z]{1,3}\\b");



    EasyDecoder(String text) {

        inputText = text;
    }



    public void ReplacingPrepositions() {

        Matcher matcher = pattern.matcher(inputText);

        while (matcher.find()) {

            System.out.print(matcher.group() +" ");

        }
        outputText = matcher.replaceAll("Java");


        System.out.println("\n*********************************");
        System.out.println(outputText);
    }
}
