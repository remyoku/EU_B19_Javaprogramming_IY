package day49_Interface_Enum_DataClass.Enumaration;

import java.util.Arrays;

public class C06_MyEnumTest {
    public static void main(String[] args) {

        C05_MyEnum.Brands arabaMarka = C05_MyEnum.Brands.VOLVO;

        System.out.println(arabaMarka.ordinal());//ordinal kaçıncı sırada olduğunu söyler.

        System.out.println(arabaMarka.name());

        System.out.println(arabaMarka);

        C05_MyEnum.Days[] values = C05_MyEnum.Days.values();

        System.out.println(Arrays.toString(values));

        C05_MyEnum.Colors colors = C05_MyEnum.Colors.RED;

        System.out.println(colors.ordinal());
        System.out.println(colors.name());

    }
}
