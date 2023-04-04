package string_builder;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class TextSorter implements Comparable<TextSorter> {


    static final String SENTENCE_ENDS = ".!?";
    static final String WORDS_SEPARATORS = " \\t\\n\\\\,-_+*/@%#";

    private String text;
    private int words;


    public TextSorter(String text) {

        this.text = text;
        words = (text.split("[" + WORDS_SEPARATORS + SENTENCE_ENDS + "]")).length;

    }

    public static TextSorter[] toSentencesArray(String inputText) {
        StringBuilder stringBuilder = new StringBuilder();
        List<TextSorter> list = new LinkedList<>();

        for (char symbol : inputText.toCharArray()) {

            stringBuilder.append(symbol);

            if (SENTENCE_ENDS.indexOf(symbol) > -1) {
                list.add(new TextSorter(stringBuilder.toString().trim()));
                stringBuilder = new StringBuilder();

            }


        }

        return list.toArray(new TextSorter[list.size()]);
    }



    public static void main(String[] args) {

        String text = "A mutable sequence of characters. This class provides an API compatible with StringBuffer, but with no guarantee of synchronization. This class is designed for use as a drop-in replacement for StringBuffer in places where the string buffer was being used by a single thread (as is generally the case). Where possible, it is recommended that this class be used in preference to StringBuffer as it will be faster under most implementations.";

        System.out.println("Unsorted text: \n" + text);

        TextSorter[] sortedText = TextSorter.toSentencesArray(text);

        Arrays.sort(sortedText, Collections.reverseOrder());



        System.out.println("Sorted text: ");

        for (TextSorter txt: sortedText) {

            System.out.println(txt);

        }


    }

    @Override
    public int compareTo(TextSorter o) {
        return o.words - words;
    }

    @Override
    public String toString() {
        return text;
    }
}
