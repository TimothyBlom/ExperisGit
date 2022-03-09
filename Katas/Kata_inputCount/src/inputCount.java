public class inputCount {
    public static void main(String[] args) {

    String sentence = "Hello class, my name is megatron";
    int sentLength = sentence.replace(" ", "").length();
    String stars = "*".repeat(sentence.replace(" ", "").length());

    System.out.println(sentence);
    System.out.println(sentLength);
    System.out.println(stars);

    }
}
