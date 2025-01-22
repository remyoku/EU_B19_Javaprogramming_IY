package day09_Review;

import java.util.Scanner;

public class C03_ClassTask2 {
    public static void main(String[] args) {

         /*
hava sıcaklığı isminde bir değişken declere edin ve değer atayın
sıcaklık 20 derece üzerinde ise hava sıcak yazsın
sıcaklık 20 derece ve altında ise hava soğuk yazsın
*/

        double havaSıcaklığı = 2.0;

        if (havaSıcaklığı > 20 ){
            System.out.println("Hava Sıcak");
        }else{
            System.out.println("Hava Soğuk");
        }
        System.out.println("Program Bitti");
        System.out.println("---------------------------------------------------");

        /*
Class Task 2
kullanıcıdan bir tam sayı alın
ekrana tek mi çift mi olduğunu yazdırın
 */

        Scanner input = new Scanner(System.in);
        System.out.println("Bir tam sayı giriniz: ");
        int number = input.nextInt();

        boolean result =(number%2==1);

        if (result){
            System.out.println("Sayı tektir");
        }else {
            System.out.println("Sayı çiftir");
        }
        System.out.println("Program bitti");
    }
}
