package day21_ReturnMethodOverLoading;

public class C10_Homework1 {
    public static void main(String[] args) {

        eligibleToVote(19, "Çin");

        System.out.println("--------------------------------------");

        System.out.println(calculateTheGrade(100));
    }
    //	1. create return  method that can check if a person is eligible to vote
    //  Ex:eligibleToVote(19, "TR");
    // output:You are not eligible to vote!

    public static void eligibleToVote(int age, String country) {


        if (age >= 19 && country.equalsIgnoreCase("Türkiye")) {
            System.out.println("Yaşınız " + age + ". Yaşadığınız Ülke : " + country);
            System.out.println("Oy Kullanabilirsiniz.");

        } else if (age < 19 && country.equalsIgnoreCase("Türkiye")) {
            System.out.println("Yaşınız " + age + ". Yaşadığınız Ülke : " + country);
            System.out.println("Oy Kullanamazsınız. Yaş Şartı Sağlanamadı.");

        } else if (age >= 19 && !country.equalsIgnoreCase("Türkiye")) {
            System.out.println("Yaşınız " + age + ". Yaşadığınız Ülke : " + country);
            System.out.println("Oy Kullanamazsınız. Ülke Şartı Sağlanamadı.");

        } else {
            System.out.println("Oy Kullanamazsınız. Yaş ve Ülke İçin İstenilen Şartlar Sağlanamadı.");
        }


    }
    //	5. create a method that returns calculate the grade of the student based on the score
    // score >= 90 grade 'A'
    // score >= 80 grade 'B'
    // score >= 70 grade 'C'
    // score >= 60 grade 'D'
    // score < 60 grade 'F'

    public static char calculateTheGrade(int score) {

        if (score > 100 || score < 0) {
            return '-';
        } else if (score >= 90) {
            return 'A';
        } else if (score >= 80) {
            return 'B';
        } else if (score >= 70) {
            return 'C';
        } else if (score >= 60) {
            return 'D';
        } else {
            return 'F';
        }
    }
}
