package day52_Error_Exceptions;

public class C02_OutOfMemory {
    public static void main(String[] args) {

        String str = "Merhaba Java";

        System.out.println(str);

        int sayac = 0;
        //.OutOfMemoryError
        while (sayac < 30){
            System.out.println(sayac);
            sayac++;
            try {
                str+=str;                    //hatanın kaynaklandığı kod parçası try içine yazılır.

            }catch (OutOfMemoryError e){     // catch içine de yakalanmasını beklediğimiz hata türü belirtilir
                System.out.println("Bir hata oluştu!!!");
                System.out.println("Hata : " + e.getMessage()); // hatanın kaynağını belirten hata mesajını yazdırır.

            } catch (Error e ){
                e.printStackTrace();       // hatanın takibini yapmak için gerekli olan konsol çıktılarını yazdırır.

            }


            System.out.println("Program sona erdi");
        }
    }
}
