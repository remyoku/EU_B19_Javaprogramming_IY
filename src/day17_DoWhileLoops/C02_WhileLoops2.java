package day17_DoWhileLoops;

public class C02_WhileLoops2 {
    public static void main(String[] args) {

        for (int i = 1; i <= 5 ; i++) {
            System.out.print(i + " ");

        }
        System.out.println("\n----------------------------------------------------------");

        int i=1;
        for(; i<=5;){
            System.out.print(i + " ");
            i++;
        }
        System.out.println("\n----------------------------------------------------------");
        System.out.println("While");
        int j=1;
        while (j<=5) {
            System.out.print(j + " ");
            j++;
        }
    }
}
