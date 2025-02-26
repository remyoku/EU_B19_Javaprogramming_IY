package day31_Arrays02;

public class C08_VarArgs {
    public static void main(String[] args) {

        int [] x = {1,2,3,4,5,6};

        toplam(x);
        System.out.println("--------------------------");
        toplam1(x);
        System.out.println("--------------------------");

        toplam1(1,2,3,4,5,6,7);// her zaman array vermek zorunda değilim böyle istediğimiz sayıları da girebilirz.
        //ikiside aynı yapı ama ben ... ile rakam string verebiliyorum.

        System.out.println("--------------------------");

        concat("Ahmet","Mehmet","Ayşe","Fatma");
        String[] cars = {"Honda", "Toyota", "Opel", "Mercedes", "Audi"};
        concat(cars);


    }

    public static void toplam(int[] arr){
        int sum=0;

        for (int a  :arr ) {
            sum+=a;
        }
        System.out.println("sum = " + sum);
    }
    public static void toplam1(int... arr){//üç nokta koydum bu da aslında bir array
        int sum=0;

        for (int a  :arr ) {
            sum+=a;
        }
        System.out.println("sum = " + sum);
    }

    public static void concat(String...str){
        String result = "";

        for (String a  :str ) {
        		    result+=a;
        		}
        System.out.println("result = " + result);
    }
}
