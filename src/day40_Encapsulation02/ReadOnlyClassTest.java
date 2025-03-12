package day40_Encapsulation02;

import java.util.ArrayList;

public class ReadOnlyClassTest {
    public static void main(String[] args) {

        ReadOnlyClass sehir1 = new ReadOnlyClass(34,"İstanbul");
        ReadOnlyClass sehir2 = new ReadOnlyClass(6,"Ankara");


        System.out.println("sehir1.getIlAdi() = " + sehir1.getIlAdi());

        System.out.println("sehir1.getIller() = " + sehir1.getIller());



        ArrayList<String> benimIllerim= sehir1.getIller();
        benimIllerim.remove(1);//bu şekilde data sildik ve bu sıkıntı

        benimIllerim.add("1900 - London");
        System.out.println("sehir1.getIller() = " + sehir1.getIller());

        System.out.println("sehir1.getIllerV1() = " + sehir1.getIllerV1());

        ArrayList<String> benimIller2 = sehir2.getIllerV1();
        benimIller2.add("2000 - Berlin");
        System.out.println("benimIller2 = " + benimIller2);

        System.out.println("sehir2.getIller() = " + sehir2.getIller());

    }
}
