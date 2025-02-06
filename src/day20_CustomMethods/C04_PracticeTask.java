package day20_CustomMethods;

public class C04_PracticeTask {
    public static void main(String[] args) {

       double area = areaOfCircle(5);
        System.out.println(area);
        System.out.println(areaOfCircle(4));

        System.out.println(areaOfSquare(5.2));

        System.out.println(perimeterOfSquare(9));


    }
    //dairenin alanını hesaplayan bir method yazınız.

    /**
     * this method calculates the area of circle with given radius
     *
     * @param radius
     * @return
     */

    public static double areaOfCircle(int radius){  //bu dönüş tipi method ve bu methodu yazdırmadan çalıştıramazsın

        double area;
        area = Math.PI*Math.pow(radius,2);

        return area;
    }

    /**
     * method that can calculate the area of a square
     * @param side
     * @return
     */

    public static int areaOfSquare(double side){

        return (int) Math.pow(side,2);

         /*
     public static double areaOfSquare(int side){

        double area;
        area = Math.pow(side,2);

        return area;
     */

        /*
        Şimdi bazı ifadeler double Math gibi diyelim int değişkenine atadık o zaman (int)Math.pow(side,2);
        yapmak bizi hata almaktan kurtarır.
         */
    }
      public static double perimeterOfSquare (int side){
        return 4*side;
      }

}
