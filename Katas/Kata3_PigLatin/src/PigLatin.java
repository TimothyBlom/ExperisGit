public class PigLatin {
    public static void main(String[] args) {

        String sentence1 = "piglatin";

        if (    sentence1.startsWith("a") ||
                sentence1.startsWith("e") ||
                sentence1.startsWith("i") ||
                sentence1.startsWith("o") ||
                sentence1.startsWith("u")) {
                    String sentence2 = sentence1.substring(1) + sentence1.substring(0,1) + "way";
                    System.out.println(sentence2);
        } else {
                    String sentence2 = sentence1.substring(1) + sentence1.substring(0,1) + "ay";
                    System.out.println(sentence2);
        }

    }
}
