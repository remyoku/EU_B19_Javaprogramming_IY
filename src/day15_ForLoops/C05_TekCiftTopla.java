package day15_ForLoops;

public class C05_TekCiftTopla {
    public static void main(String[] args) {

        //1 den 100 e kadar oloan tek çift sayıların ayrı ayrı tolamı kaçtır?

        int çift = 0;
        int tek = 0;

        for (int i = 0; i <= 100; i++) {
            if (i % 2 == 0) {
                çift += i;
            } else {
                tek += i;
            }
        }
        System.out.println("çift = " + çift);
        System.out.println("tek = " + tek);

        System.out.println("-------------------------------------------------------");

        //ternary
        int çiftSayılar = 0;
        int tekSayılar = 0;

        for (int i = 0; i <= 100; i++) {
            çiftSayılar += (i % 2 == 0) ? i : 0;
           tekSayılar += (i % 2 == 1) ? i : 0;
        }
        System.out.println("çiftSayılar = " + çiftSayılar);
        System.out.println("tekSayılar = " + tekSayılar);
    }
}
