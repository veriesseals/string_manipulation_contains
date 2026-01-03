public class Main {
    public static void main(String[] args) throws Exception {

        // Program 1:  Create a String that contains a substring "good". Query the String whether it contains the substring "good". If it does, the output should display "You get a gift from Santa". If the substring is not present, the output should display "Next year, please".

        String goodOrBadThisYear = "You have been good!";
        String goodOrBadVerdict = "bad";

        if (goodOrBadThisYear.contains(goodOrBadVerdict)) {
            System.out.println("You get a gift from Santa");
        } else {
            System.out.println("Next year, please");
        }

    }
}
