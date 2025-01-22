package day10_IfStatements;

public class C07_CheckNumbers {
    public static void main(String[] args) {
         /*
         //Bir program yazın 2 tane numara kabul etsin ve büyük olanı versin.
         Sayılar eşit ise eşit yazsın.
         */
        int x= 35 , y=35;

        if (x>y){
            System.out.println(x);
        } else if (y>x) {
            System.out.println(y);
        }else{
            System.out.println("Sayılar eşittir");
        }

    }
}
