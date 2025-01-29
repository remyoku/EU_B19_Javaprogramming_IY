package day15_ForLoops;

public class C02_ForLoop_2 {
    public static void main(String[] args) {

        //döngü sayısı i ile gösterilir ve döngü esnansında kullanılabilir.

        for (int i = 0; i <= 3; i++) {
            System.out.println("i = " + i);
        }
        System.out.println("----------------------------------------------------------------------------------------");
        //döngüyü istediğimiz zamnadan başlatabiliriz...
        //10 ila 20 arasındaki sayıları yazdıralım (dahil)
        for (int i = 10; i <= 20; i++) {
            System.out.println("i = " + i);
        }
        System.out.println("----------------------------------------------------------------------------------------");
        //döngüyü istediğimiz oaranda arttırabiliriz.
        // 0 ile 10 arasında ki çift ssayıları yazdıralım.

        for (int i = 0; i<= 10; i += 2){
            System.out.println("i = " + i);
        }
        System.out.println("----------------------------------------------------------------------------------------");
        //döngülerde, index değeri değiştirilmezse, sonsuz döngüye gireriz.
        // i nin değeri body içerisinde de değiştirilebilir.

        for (int i = 0; i<= 10;){
            System.out.println("i = " + i);
            i +=2;
        }

    }
}
