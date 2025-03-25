package day46_AccessModifiers.PackageA;

public class AccessModifiers {

    private String privateStr;
    String defaultStr;
    protected String protectedStr;
    public String publicStr;

    //class içinde hepsine ulaşabilirim.

    private void privateMethod(){
        privateStr = "Private";
        defaultStr = "Default";
        protectedStr = "Protected";
        publicStr = "Public";
        System.out.println();
        System.out.println("Private Method called");

    }

    void defaultMethod(){
        privateStr = "Private";
        defaultStr = "Default";
        protectedStr = "Protected";
        publicStr = "Public";
        System.out.println("Default Method called");


    }
    protected void protectedMethod(){
        privateStr = "Private";
        defaultStr = "Default";
        protectedStr = "Protected";
        publicStr = "Public";
        System.out.println("Protected Method called");


    }
    public void publicMethod(){
        privateStr = "Private";
        defaultStr = "Default";
        protectedStr = "Protected";
        publicStr = "Public";
        System.out.println("Public Method called");


    }
}
