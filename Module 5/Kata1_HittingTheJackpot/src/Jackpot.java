public class Jackpot {
    public static void main(String[] args) {

        int[] testJackpot = {1, 1, 1, 1};

        for (int result = 0; result < testJackpot.length; ++ result) {
            if (result == testJackpot[1]) {
                break;
            }
            System.out.print("result" + result + " ");
        }

        if (testJackpot[0] == testJackpot[1] && testJackpot[1] == testJackpot[2] && testJackpot[2] == testJackpot[3]){
            System.out.print("true");
        } else {
            System.out.print("false");
        }

    }
}
