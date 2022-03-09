public class Validation {
    public static void main(String[] args) {

        String ipv4 = "1-22-3-0";

        String[] first = ipv4.split("-");

        String first1 = first[0];
        String first2 = first[1];

        System.out.println(first1 + first2);

        if (ipv4.endsWith("0")) {
            System.out.println("error, can not end with 0");
        } else {
            System.out.println("no problems found");
        }

    }
}