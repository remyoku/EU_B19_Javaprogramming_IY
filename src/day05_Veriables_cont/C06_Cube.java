package day05_Veriables_cont;

public class C06_Cube {
    public static void main(String[] args) {

        /**
         * Create and declare 3 variables for given dimensions
         * Print each of them in the console
         * Print the formula of rectangular
         * volume parallelepiped via using
         * variables (Do not calculate !!)
         * (Volume = Length * Width * Height)
         */

        double length , width , height;

        length = 6;
        width = 3;
        height = 8;

        System.out.println(length + " : "+width+" : "+height);

        double volume = length * width * height;

        System.out.println("Prizmanın hacmi: "+ volume);


    }
}
