public class Operators {

    public static void main(String[] args) {

        double first = 1.2;
        double second = 3.6;

        double a = first + second;
        double b = first++;

        System.out.println(first + second + " ");
        System.out.println(first - second + " ");
        System.out.println(first * second + " ");
        System.out.println(first / second + " ");
        System.out.println(first % second + " ");
        System.out.println(a + " ");
        System.out.println(b + "(this does not add 1 to 1.2)");

        int third = 5;
        int forth = 4;

        if (third == forth){
            System.out.println(true);
        } else {
            System.out.println(false);
        }

        if (third != forth){
            System.out.println(true);
        } else {
            System.out.println(false);
        }

        if (third > forth){
            System.out.println(true);
        } else {
            System.out.println(false);
        }

        if (third < forth){
            System.out.println(true);
        } else {
            System.out.println(false);
        }

        if (third >= forth){
            System.out.println(true);
        } else {
            System.out.println(false);
        }

        if (third <= forth){
            System.out.println(true);
        } else {
            System.out.println(false);
        }



    }

}
