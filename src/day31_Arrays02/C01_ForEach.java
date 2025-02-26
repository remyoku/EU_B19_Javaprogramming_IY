package day31_Arrays02;

public class C01_ForEach {
    public static void main(String[] args) {
        /*
        for (dataType VariableName : array ){

        }*/

        int [] sayilar = new int[3];

        sayilar [0]= 1;
        sayilar [1]= 2;
        sayilar [2]= 3;

        for (int sayi:sayilar){  //arrayın içindeki bütün elemanları dolaşır sayının içine atar.
            System.out.println(sayi);
        }

        System.out.println("----------------------------------------");

        double [] ondalikSayilar =new double[5];

        ondalikSayilar [0] = 20.5;
        ondalikSayilar [1] =45.5;
        ondalikSayilar [2] = 23.5;
        ondalikSayilar [3] = 34.5;
        ondalikSayilar [4] = 12.5;

        for (double ondalıkSayı  :ondalikSayilar ) { //double ın karşındaki bir değişken ismi, istediğimizi verebiliriz.
            System.out.println(ondalıkSayı);
        }

    }
}
