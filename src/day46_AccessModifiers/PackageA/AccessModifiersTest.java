package day46_AccessModifiers.PackageA;

public class AccessModifiersTest {
    public static void main(String[] args) {
        AccessModifiers accessModifiers = new AccessModifiers();

        accessModifiers.protectedMethod();
        accessModifiers.defaultMethod();
        accessModifiers.publicMethod();
        //accessModifiers.privateMethod(); -- farklı class içinde ulaşılamaz.

        System.out.println(accessModifiers.publicStr);
        System.out.println(accessModifiers.protectedStr);
        System.out.println(accessModifiers.defaultStr);
       // System.out.println(accessModifiers.privateStr); -- farklı class içinde ulaşılamaz.
    }


}
