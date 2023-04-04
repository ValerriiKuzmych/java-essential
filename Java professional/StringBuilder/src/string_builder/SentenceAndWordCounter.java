package string_builder;


public class SentenceAndWordCounter {

    public static void main(String[] args) {

        String text = "A mutable sequence of characters. This class provides an API compatible with StringBuffer, but with no guarantee of synchronization. This class is designed for use as a drop-in replacement for StringBuffer in places where the string buffer was being used by a single thread (as is generally the case). Where possible, it is recommended that this class be used in preference to StringBuffer as it will be faster under most implementations.";
        StringBuilder txt = new StringBuilder();

        txt.append(text);

        int numberOfSentencesInText = 0;
        int numberOfСharactersInSentence;


        for (char element : text.toCharArray()) {
            if (element == '.' || element == '!' || element == '?') {
                numberOfSentencesInText++;


            }
        }

        for (int i = 0; i < numberOfSentencesInText; i++) {


            numberOfСharactersInSentence = txt.indexOf(".");

            String sentence = txt.substring(0, (numberOfСharactersInSentence + 1));

            System.out.println("Sentence: " + sentence);

            int numberOfWordsInSentence = 0;

            for (char chr : sentence.toCharArray()) {

                if (chr == ' ') {
                    numberOfWordsInSentence++;
                }

            }
            System.out.println("Number of words in the sentence: " + (numberOfWordsInSentence + 1));

            txt.delete(0, numberOfСharactersInSentence + 2);


            System.out.println("Number of characters in the sentence: " + numberOfСharactersInSentence +"\n");



        }
    }


}
