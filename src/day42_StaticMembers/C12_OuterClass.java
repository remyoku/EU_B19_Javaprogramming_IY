package day42_StaticMembers;

public class C12_OuterClass {

    public static String outerStaticDeğişken = "Outer Static değişkenim";
    public String outerNormalDeğişken = "Outer normal değişkenim";


    public static class Inner {

        void mesaj(){
            System.out.println(outerStaticDeğişken);
            //System.out.println(outerNormalDeğişken);
        }
    }
    public class NormalInner{
        void mesaj(){
            System.out.println(outerStaticDeğişken);
            System.out.println(outerNormalDeğişken);
            System.out.println("Normal inner class");
        }
    }
}
