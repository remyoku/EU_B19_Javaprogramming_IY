package day20_CustomMethods;

public class C06_PracticeWithReturn {
    public static void main(String[] args) {

        System.out.println(oddNumber());

        System.out.println(isEligibleToBuyAlcohol(14));



    }
    /**
     * this method returns to the odd numbers btw 1-100
     *
     * @return
     */

    public static String oddNumber(){
        String result = "";
        for (int i = 1; i <=100 ; i+=2) {
            result +=i + " ";
        }

        return result;
    }
    /**
     * this method returns to the even numbers btw 1-100
     *
     * @return
     */


    // create a method that can check if a person is eligible to buy alcohol

    public static boolean isEligibleToBuyAlcohol(int age){
        boolean isEligible ;

        if (21<= age){
            isEligible=true;
        }else {
            isEligible=false;
        }

        return isEligible;
    }
}
