package day17_DoWhileLoops;

public class C04_DoWhileLoops {
    public static void main(String[] args) {

        /**
         * Do-While Loops
         *
         * do {
         * //En az bir kez çalıştırılıyor
         * }while(koşul)
         */

        do {
            //1.step code
        }while (false); // 2.step koşul kontrol ediliyor ve doğru ise kod çalıştırılmaya devam ediyor.

        int input = 5;
        do {

            if(input ==8){
                System.out.println("Sayı 8 olduğu için program sonlanacak");
                break;
            }
            if (input == 7){
                System.out.println("Sayı 7 olduğu için continue çalışacak.");
                input++;
                continue;
            }
            System.out.println("Girilen Sayı " + input);
            input++;
        }while (input<10);
    }
}
