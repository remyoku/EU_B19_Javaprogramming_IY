package day29_Memory_GarbageCollection;

public class C03_StackOverFlow {
    /*
    public static void birMethod(){
        System.out.println("DENEME");
    }*/

    public static void recusiveMethod(int sayı){
        System.out.println("sayı = " + sayı);
        recusiveMethod(sayı+1);
    }

    public static void recusiveMethod2(int sayı , int count){
        System.out.println(sayı);

        if (sayı >=count){
            return;
        }

        recusiveMethod2(sayı+1,count);
    }

    public static void main(String[] args) {
        /*for (int i = 0; i <100_000_000 ; i++) {
            birMethod(); // her seferinde  method işini bitireceğinden dolayı stackten
            // atılacak ve stackOverFlow vermeyecek
        }*/

        //recusiveMethod(1); //StackOverflowError hatası verir --- Method bitirilmediği için

        recusiveMethod2(1,60000); // count parametresinin değerine göre stack alanına sığacak
        // kadar method çağrısı yapılırsa hata oluşabilir.
    }
}
