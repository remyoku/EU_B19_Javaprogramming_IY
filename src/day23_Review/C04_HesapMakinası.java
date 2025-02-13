package day23_Review;

public class C04_HesapMakinası {
    public static void main(String[] args) {
        double islemSonucu;
        islemSonucu=hesapMakinası(10,2,'+');
        System.out.println("islemSonucu = " + islemSonucu);

        islemSonucu=hesapMakinası(10,2,'-');
        System.out.println("islemSonucu = " + islemSonucu);

        islemSonucu=hesapMakinası(10,2,'*');
        System.out.println("islemSonucu = " + islemSonucu);

        islemSonucu=hesapMakinası(10,2,'/');
        System.out.println("islemSonucu = " + islemSonucu);

        islemSonucu=hesapMakinası(10,2,'&');
        System.out.println("islemSonucu = " + islemSonucu);



    }

    public static double hesapMakinası(int num1 , int num2, char islem){

        double sonuc = 0;
        switch (islem) {
            case '+':
              sonuc=num1 + num2;
              break;
            case '-':
                sonuc = num1 - num2;
                break;
            case '*':
                sonuc = num1 * num2;
                break;
            case '/':
                sonuc = num1 / num2;
                break;
            default:
                sonuc=-1000;
        }
        return sonuc;
    }
}
