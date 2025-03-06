package day35_ArrayList;

import java.util.ArrayList;

public class C01_ArrayListIntro {
    /**
     * İçerisinde birden fazla nesne barındıran ve gerektiğinde nesne ekleme ve silme yapılabilen başka bir Nesnedir.
     * List = Kendisine verilen elemanları sıralı şekilde tutar.Tekraralanan elemanları barındırabilir.
     * Array List = yeniden boyutlandırılabilir array demek. Dinamik array
     * içerisine istediğimiz kadar eleman ekleyip çıkabiliyoruuz
     * Array ve Array listi karıştırma biri sabittir değiştirilemez, ama diğeri değiştirilir.
     * Array statik yapıdadır, Array list dinamik yapıdadır.
     * Array liste primitive atamazsın nesne atman lazım.
     * Biz Array liste primitive bir type atmak istiyorsam wrapper classa ihtiyaç duyarım.
     * <p>
     * ArrayList nasıl oluşur? Creating ArrayList
     * ArrayList<String> arabalar = new ArrayList<>();
     */
    public static void main(String[] args) {

        //ArrayList nesnesi oluşturma
        ArrayList<String> names = new ArrayList<>(); // new bana bir obje oluşturuyordu.

        //ArrayList<int> numbers = new ArrayList<int>();-->Primitive bir data tipi olmaz.Kabul etmez.

        ArrayList<Integer> numbers = new ArrayList<>();

        //assigning value to an arrayList

        names.add("İrem");
        names.add("Eslem");       // bu şekilde bu arrayListin içine atama yapıyoruz.
        names.add("Hacer");
        names.add("Harun");

        numbers.add(99);
        numbers.add(10);
        numbers.add(56);
        numbers.add(43);
        numbers.add(new Integer(55));
        numbers.add(new Integer("123"));

        //reading value from an ArrayList
        //get()

        System.out.println("names.get(0) = " + names.get(0));
        System.out.println("names.get(1) = " + names.get(1));
        System.out.println("names.get(2) = " + names.get(2));
        System.out.println("names.get(3) = " + names.get(3));

        names.add("İkbal");
        System.out.println("names.get(4) = " + names.get(4));

        //System.out.println("names.get(5) = " + names.get(5)); ---> IndexOutOfBoundsException

        System.out.println("numbers.get(0) = " + numbers.get(0));
        System.out.println("numbers.get(4) = " + numbers.get(4));
        System.out.println("numbers.get(5) = " + numbers.get(5));

        System.out.println("numbers.get(5)+100 = " + (numbers.get(5) + 100));

        System.out.println("names.size() = " + names.size());
        System.out.println("numbers.size() = " + numbers.size()); // burda lenght yok size var.

        System.out.println("names.toString() = " + names.toString());
        System.out.println(numbers);
        //arrayListte toStringle yazdırmak zorunda değilsiniz direkt ismi yazıp .sout ile yazdırabiliriz.

    }
}
