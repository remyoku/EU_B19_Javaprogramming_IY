package day20_CustomMethods;

public class C05_MethodsTasks {
    public static void main(String[] args) {

        System.out.println(convertDollarToTl(100));

        System.out.println(convertKgToLb(20));

        checkNumber(0);

    }

    /**
     * this method  converts dollar to Tl.
     *
     * @param dollar
     * @return
     */

    public static double convertDollarToTl(double dollar) {

        double rate = 35.98;
        double tl = dollar * rate;

        return tl;
    }

    /**
     * this method  converts kg to lb.
     *
     * @param kg
     * @return
     */
    public static double convertKgToLb(double kg) {

        double lb = kg * 2.2;

        return lb;
    }
    public static void checkNumber (int number){

        if (number < 0){
            System.out.println(number+ " is a negative number.");
        } else if (number > 0) {
            System.out.println(number + " is a positive number.");
        }else {
            System.out.println("The number is zero. ");
        }
    }
}
// 1. create a method that can convert dollar to TL rate:35.98 dönüş tipli
// 2. create a method that can convert kg to lb 2.2 dönüş tipli  kg*2.2=lb
// 3. create a method that can determine if the given integer is positive, negative or zero void