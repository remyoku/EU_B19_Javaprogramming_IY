package day17_DoWhileLoops;

public class C05_Task_2 {
    public static void main(String[] args) {

       int age = 18;
       int emeklilikYaşı = 67;
       int year = 2025;
       if(age >= 18){
           System.out.println("Sigorta Giriş izini verildi");
       }
       while (age <= emeklilikYaşı){
           System.out.println();
           if (age == emeklilikYaşı) {
               System.out.println("Emekli oldunuz");
               break;
           }
           System.out.println("Yıl :" + year);
           System.out.println("Sigortalının yaşı : " + age);
           System.out.println("Emekliliğine kalan süre : " + (emeklilikYaşı - age));
           age ++;
           year ++;
       }
    }
}
