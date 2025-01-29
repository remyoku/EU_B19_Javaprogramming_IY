package day16_NestedForLoops;

public class C02_Task2 {
    public static void main(String[] args) {

        /**
         * 1 2 3 4 5
         * 1 2 3 3 4
         * 1 2 3 4 5
         *
         *
         * 1 2 3 4 5
         * 1 2 3 4
         * 1 2 3
         * 1 2
         * 1
         *
         *                x x x x x
         *                x x x x
         *                x x x
         *                x x
         *                x
         *
         *                x
         *                x x
         *                x x x
         *                x x
         *                x
         */

        for (int i = 1; i < 4; i++) {
            for (int j = 1; j < 6; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

        System.out.println("--------------------------------------------------------");

        for (int i = 5; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
        System.out.println("--------------------------------------------------------");

        for (int i = 5; i>=1; i--){
            for (int j = 1 ; j<= i; j++){
                System.out.print("x ");
            }
            System.out.println();
        }
    }
}
