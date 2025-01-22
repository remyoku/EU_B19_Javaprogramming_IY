package day13_Ternary;

public class C03_TernaryOperators {

    public static void main(String[] args) {

        //if in basit hali
        //(condition) ? code (true) : code (false)

        //sayının çift mi tek mi olduğunu yazdıran kod nedir?

        int number = 15 ;

        //if-else

        if (number % 2 ==0){
            System.out.println(number + " Sayısı Çifttir.");
        }else {
            System.out.println(number + " Sayısı Tektir.");


            //ternary
            System.out.println(number% 2 == 0 ? number + " Sayısı Çifttir." : number + " Sayısı Tektir.");

            String mesaj = number% 2 == 0 ? number + " Sayısı Çifttir." : number + " Sayısı Tektir.";
            System.out.println("mesaj = " + mesaj);

            //eğer ternary sonucunda oluşan değer bir değişkene atanmayacaksa , ? ve : sonraki değerlerin
            // data tipi farklı olabilir.

            System.out.println(number% 2 == 0 ? number + " Sayısı Çifttir." : number *2);
            //int s =  number% 2 == 0 ? number + " Sayısı Çifttir." : number *2 hata verir.

            // ternary operators :  (condition) ? expression1 : expression2 -> bu şu demek
            // değer true ise 1 i false ise 2 yi yazdırcak bir nevi simple if

        }
        //bir şartın gerçekleşmesi durumunda birden fazla kod satırı çalışacaksa mutlaka
        // if-else kullanılmalıdır. Ternary bunun için uygun değil.Ternary de tek statement kullanılır
    }
}
