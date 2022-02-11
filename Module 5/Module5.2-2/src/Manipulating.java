public class Manipulating {
    public static void main(String[] args) {

        String a = "Hello";
        String b = "World";
        String c = a.concat(b);

        System.out.println(c);

        String d = "welcome planet";

        String[] e = d.split(" ");

        System.out.println("I dont know wtf is happening here " + e);

        System.out.println(d.toUpperCase());

        System.out.println(d.replaceFirst("welcome", "goodby"));

        System.out.println(d.replaceAll("e", "a"));
    }
}
