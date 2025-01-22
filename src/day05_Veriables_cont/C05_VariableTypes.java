package day05_Veriables_cont;

public class C05_VariableTypes {
    public static void main(String[] args) {

        int i = 9/2;
        System.out.println("i = " + i);

        int i1 = 49/10;
        System.out.println("i1 = " + i1);

        // eğer int a atanan değerin ondalık kısmı varsa bu kısım atılır. yuvarlama olmaz

        byte b = 8/5;
        System.out.println("b = " + b);

        char ch = 'A';

        String str ="Ahmet";

        char ch1 = 88; //X
        System.out.println("ch1 = " + ch1);
        //Char a değer verirsek bize ascii tablosunda bu sayıya karşılık geleni yazdırır.

        char ch2 = 10 + 39;
        System.out.println("ch2 = " + ch2);

        char rose1 = '\uD83C';
        char rose2 = '\uDF39';
        System.out.println("Gül : " + rose1 + rose2);

    }
}
