package day36_Review;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;

public class C08_BigInteger {
    public static void main(String[] args) {


        BigInteger bigInteger = new BigInteger("2222222222222222222222222258946497964454654547854555555");
        //istediğim kadar büyük bir sayı string şeklinde yazabiliriz.
        System.out.println("bigInteger = " + bigInteger);

        BigInteger sonuc = new BigInteger("0");
        sonuc = bigInteger.multiply(bigInteger);
        System.out.println("sonuc = " + sonuc);

        bigInteger = bigInteger.add(new BigInteger("2222222222221111111115555555"));

        System.out.println("bigInteger = " + bigInteger);

        BigDecimal bigDecimal = new BigDecimal("2223335.4564558845687545464878545644654");
        BigDecimal result = bigDecimal.divide(BigDecimal.valueOf(5),25, RoundingMode.UP);
        System.out.println("result = " + result);

        //ikili sayı siytemindeki bir sayının desimal değeri

        BigInteger bg = new BigInteger("1010",2);
        System.out.println("bg = " + bg);

        BigInteger hexBG = new BigInteger("2A",16);
        System.out.println("hexBG = " + hexBG);
    }
}
