package day36_Review;

import java.util.*;

public class C02_ArrayListReview {
    public static void main(String[] args) {

        ArrayList<Integer> numberList = new ArrayList<>();

        numberList.add(10);
        numberList.add(20);
        numberList.add(30);
        numberList.add(40);
        numberList.add(50);

        //yazdırma
        System.out.println("numberList = " + numberList);//numberList = [10, 20, 30, 40, 50]

        //elemenet sayısı
        System.out.println("numberList.size() = " + numberList.size());//5

        //boş mu?

        System.out.println("numberList.isEmpty() = " + numberList.isEmpty());//false

        //fori ile yazdırrma

        System.out.println("---- fori----");
        for (int i = 0; i <numberList.size() ; i++) {
            System.out.print(numberList.get(i) + " ");
        }
        System.out.println();
        System.out.println("----forEach----");
        for (Integer number  : numberList ) {
            System.out.println("number = " + number);
        }

        System.out.println("------------------------");
        //belirli indexe element ekleme

        numberList.add(4,45);//numberList = [10, 20, 30, 40, 45, 50]
        System.out.println("numberList = " + numberList);

        //belirli bir indexteki elementin değerini değiştirme
        numberList.set(2,300);
        System.out.println("numberList = " + numberList);//numberList = [10, 20, 300, 40, 50]

        //belli indextekini silelim
        numberList.remove(4);
        System.out.println("numberList = " + numberList);//numberList = [10, 20, 30, 40, 50]

        //değeri 10 olan elementi silmek istersek
        System.out.println("numberList.remove(Integer.valueOf(10)) = " + numberList.remove(Integer.valueOf(10)));
        //true döner ve elemenı siler
        System.out.println("numberList = " + numberList);
        System.out.println("numberList.remove(Integer.valueOf(70)) = " + numberList.remove(Integer.valueOf(70)));
        //false döner ve silme işlemi yapmaz hata da vermez

        //contains() --> içeriyor mu?
        System.out.println("numberList.contains(40) = " + numberList.contains(40));//true
        System.out.println("numberList.contains(1000) = " + numberList.contains(1000));//false

        //ArrayListi tamamen silme  clear()

        numberList.clear();
        System.out.println("numberList = " + numberList);//numberList = []

        System.out.println("---------Bir ArrayListe element ekleme yolları---------");

        //1.yol add()
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(2);
        numbers.add(22);
        numbers.add(-78);
        numbers.add(200);

        System.out.println("numbers = " + numbers);//numbers = [2, 22, -78, 200]

        //2.yol
        //Collection addAll(); methodu ile

        Collections.addAll(numbers,32,36,98,-10);
        System.out.println("numbers = " + numbers);//numbers = [2, 22, -78, 200, 32, 36, 98, -10]

        //3.yol List.of(); methodu ile

        ArrayList<String>names = new ArrayList<>(List.of("İrem","Eslem","Hacer"));
        System.out.println("names = " + names);//names = [İrem, Eslem, Hacer]
        names.add("Homi");
        System.out.println("names = " + names);//names = [İrem, Eslem, Hacer, Homi]


        //4.yol Arrays.asList() methodu ile

        ArrayList<String> isimler = new ArrayList<>(Arrays.asList("Harun","Hacer","İkbal"));
        System.out.println("isimler = " + isimler);//isimler = [Harun, Hacer, İkbal]
        isimler.add("Ömer");
        System.out.println("isimler = " + isimler);//isimler = [Harun, Hacer, İkbal, Ömer]

        Integer[] sayılar = {2,29,-89,65};

        ArrayList<Integer> sayılarList = new ArrayList<>(Arrays.asList(sayılar));
        System.out.println("sayılarList = " + sayılarList);//sayılarList = [2, 29, -89, 65]

        //5.yol çift süslü parantez ile g

        ArrayList<String> adlar = new ArrayList<>(){{
            add("İrem");
            add("Eslem");
            add("Homi");
        }};
        System.out.println("adlar = " + adlar);//adlar = [İrem, Eslem, Homi]

        //ArrayList sıralama
        Collections.sort(adlar);
        System.out.println("adlar = " + adlar);//adlar = [Eslem, Homi, İrem]
        adlar.sort(Comparator.reverseOrder());// tersten sıralar
        System.out.println("adlar = " + adlar);//adlar = [İrem, Homi, Eslem]
        adlar.sort(Comparator.naturalOrder()); // natural sıralar
        System.out.println("adlar = " + adlar);//adlar = [Eslem, Homi, İrem]

        //ArrayListi Arraye çevirme
        //1.yol for döngüsü ile

        String [] adlarArray = new String[adlar.size()];

        for (int i = 0; i < adlar.size(); i++) {
            adlarArray[i] = adlar.get(i);

        }
        System.out.println("Arrays.toString(adlarArray) = " + Arrays.toString(adlarArray));// [Eslem, Homi, İrem]

        //2.yol
        //toArray() methodu ile

        String[] adlarArray2 = adlar.toArray(new String[0]);//0 vermemizin sebebi hepsini içinene al demek
        System.out.println("Arrays.toString(adlarArray2) = " + Arrays.toString(adlarArray2));

    }
}
