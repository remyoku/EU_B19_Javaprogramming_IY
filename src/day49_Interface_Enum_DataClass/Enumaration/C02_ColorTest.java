package day49_Interface_Enum_DataClass.Enumaration;

public class C02_ColorTest {
    public static void main(String[] args) {
        C01_Colors colors;
        colors = C01_Colors.GREEN;
        System.out.println(colors);

        C04_Araba araba = new C04_Araba(C01_Colors.BLACK,C03_Brands.MG,2023);
        System.out.println(araba);
    }
}
