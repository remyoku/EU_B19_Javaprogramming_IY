package day09_Review;

public class C03_EscapeChars {
    public static void main(String[] args) {

        String name= "Eslem";
        int birthDay = 30;
        String monthOfBirth = "August";
        int birthYear = 1995;

        System.out.println(name+" was born on \""+monthOfBirth+"\\"+birthDay+"\\"+birthYear+"\"");


    }
}
/*
 escape chars
    \n   --> Yeni satır   new line
    \t  ---> bir tab boşluk bırakır
    \b   --> Backspace
    \"   -->  "
    \r   ---> satır başı
    \\ ---> \
 */