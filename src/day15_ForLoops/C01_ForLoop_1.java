package day15_ForLoops;

public class C01_ForLoop_1 {
    public static void main(String[] args) {

        //5 kere "Hello World" yazdırın.

        //old way
        String message = "Hello World";

        System.out.println(message);
        System.out.println(message);
        System.out.println(message);
        System.out.println(message);
        System.out.println(message);

        System.out.println("----------------------------------------------------------------");
        // new way with loop

       for (int i = 0; i<5; i++){
           System.out.println(message);
       }

      //önce i tanımla sonra condition kontrol et sonra arttır body çalıştır.
        // for (Starting Value ; Ending Condition; Increasing or Decreasing The Value){
        // }   -> Start          ->Stop              -> +          -> -
        // condition true olmalı true olunca body çalışmaya başlar.

        //local variable sadece tanımlı olduğu blokta erişilebilen bir yapıdadır.

        if (message.equals("dd")){

        }




    }
}
