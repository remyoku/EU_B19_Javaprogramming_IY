package day27_StringClass2;

public class C05_EmailDomain {
    public static void main(String[] args) {

        String email = "İrem.Yokus@gmail.com";
        String email2 = "Eslem.Seher@hotmail.com";

        System.out.println("email.indexOf(\"@\") = " + email.indexOf("@")); // "@" bunun index numarasını buluyorum

        email = email.substring(email.indexOf("@")+1,email.lastIndexOf("."));
        email2 = email2.substring(email2.indexOf("@")+1,email2.lastIndexOf("."));
        System.out.println("email = " + email);
        System.out.println("email2 = " + email2);


    }
}
