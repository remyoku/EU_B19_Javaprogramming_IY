package day26_StringClass01;

public class C05_Substring {
    public static void main(String[] args) {
        String str = "Merhaba Dünya Hava Çok Güzel";
        System.out.println("str.length() = " + str.length());//28

        System.out.println("str.substring(12) = " + str.substring(12));
        // verdiğim indexten sonrasını yazdırıyor.indexi de dahil olarak alıyor.

        System.out.println("str.substring(12,23) = " + str.substring(12, 25));
        // 12 . indexten başlıyor 12 dahil 25. index dahil değil alıyor.

        System.out.println("str.substring(23) = " + str.substring(23));
        System.out.println("str.substring(str.length()-5) = " + str.substring(str.length() - 5));
        //eğer ben son beşi istiyorsam substringin içinden yazıp alcam
        //son beş harf üç harf iki harf bunlar lenght()-5,4,3...
        System.out.println("str.substring(str.length()-3) = " + str.substring(str.length() - 3));

        System.out.println("str.substring(27) = " + str.substring(27));
        System.out.println("str.substring(str.length()-1) = " + str.substring(str.length() - 1));

        System.out.println("str.substring(str.length()-1,str.length()) = " + str.substring(str.length() - 1, str.length()));

        System.out.println("str.substring(0,1) = " + str.substring(0, 1));
        //System.out.println("str.substring(5,3) = " + str.substring(5, 3)); başlangıca büyük yazamayız


        //Bu şekilde sondan 5 harf sonda 3 harf bunu verecek
        // Iphone 14 ProMax 32GB, jdkjfkdfkfjk,1200 USD;
        // Iphone 14 ProMax 32GB, jdkjfkdfkfjk,1220 USD;
        // Iphone 14 ProMax 32GB, jdkjfkdfkfjk,1210 USD;
        // Iphone 14 ProMax 32GB, jdkjfkdfkfjk,1205 USD;
        // Bu şekilde hepsini sayıp bulmak yerine ne yapıyorum son 8 haneyi ver diyip işimi kolay ediyorum.

    }
}
