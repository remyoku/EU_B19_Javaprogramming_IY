package day47_FinalKeyword_VarMethodHiding.FinalKeyword;

public final class FinalClass {

    public void Test(){
        System.out.println("Test");
    }
}
/*
class Child extends FinalClass{

}                          //final class inheritace edilemez yani parent child yapamazsınız

class Test{
    public static void main(String[] args) {

        Child child = new Child();
    }
}
*/
