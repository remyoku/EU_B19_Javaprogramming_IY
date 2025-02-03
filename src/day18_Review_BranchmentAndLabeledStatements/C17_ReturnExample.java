package day18_Review_BranchmentAndLabeledStatements;

public class C17_ReturnExample {
    public static void main(String[] args) {

        for (int i = 0; i < 100; i++) {
            if ( i== 20){
                return;
            }
            System.out.println(i);
        }
        System.out.println("dddddd");


    }

}
// return komple methodu bitiriyor 19 u yazıp diğer hiç bir şeyi yazdırmıyor komple bitti. dd yazmıyor.