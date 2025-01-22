package day05_Veriables_cont;

public class C03_StringConcatenation {
    public static void main(String[] args) {

        String name = "Irem";

        String surname = "Yokus";

        System.out.println(name + surname);  //IremYokus
        System.out.println(name + 3); // Irem3
        System.out.println(3 + name); //3Irem

        System.out.println(3 + name + 3); //3Irem3
        System.out.println(3 + 3 + name); //6Irem

    }
}
