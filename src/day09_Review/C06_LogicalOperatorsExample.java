package day09_Review;

public class C06_LogicalOperatorsExample {
    public static void main(String[] args) {
        // 18+ , Turkish
        // age >= 18

        String name = "Suleyman";
        int age = 34;
        String citizenship = "Turkish";

        boolean isEligibileToVote1= age >= 18 && citizenship.equals("turkish");
        boolean isEligibileToVote= age >= 18 && citizenship.equalsIgnoreCase("turkish");

        System.out.println("isEligibileToVote = " + isEligibileToVote);
        System.out.println("isEligibileToVote1 = " + isEligibileToVote1);

        System.out.println("---------------------------------------");

        // findexScore >1100
        // income >=25000
        // age >=18 age <70m

        String name2 = "Irem";
        int findexScore = 1300;
        int age2 = 29;
        int income = 60000;

        boolean isEligibileLoan = findexScore > 1100 && income >= 25000 && age2 >= 18 && age2 < 70;
        System.out.println(name2+ " için kredi uygun mu? " + isEligibileLoan);

        System.out.println("---------------------------------------------------------------------------------");

        String name3 = "Mike";
        int age3=75;
        char gender = 'E';

        boolean isEligibileeToBuyAlcohol= age3 >= 21 && (gender == 'M' || gender == 'F');
        System.out.println("isEligibileeToBuyAlcohol = " + isEligibileeToBuyAlcohol);

        System.out.println("----------------------------------------------------");

        String studentName = "Eslem";
        double gpa = 3.1;
        int familyIncome = 19000;

        /*
        gpa >= 3.5
        familyIncome < 20000
         */

        boolean isEligibileForScholarship = gpa >= 3.5 ||  familyIncome < 20000;
        System.out.println("Eslem burs almaya uygun mu? " + isEligibileForScholarship);

        System.out.println("------------------------------------------------------------");

        boolean result = true;
        System.out.println("result = " + result);
        System.out.println("!result = " + !result);

        System.out.println("--------------------------------------------------------------");

        int examScore = 55;
        boolean isPassed= examScore >=60;
        boolean isFailed = !isPassed;

        System.out.println("isPassed = " + isPassed);
        System.out.println("isFailed = " + isFailed);


    }
}
