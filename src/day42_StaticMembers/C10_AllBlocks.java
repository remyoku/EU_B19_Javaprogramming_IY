package day42_StaticMembers;

public class C10_AllBlocks {

    static int x;
    int y;
    public C10_AllBlocks(){
        System.out.println("Parametresiz constructor.");
    }
    public C10_AllBlocks(int i){
        System.out.println("Parametreli constructor.");
    }

    static {
        System.out.println("Static blok -1");
       // System.out.println(y);//erişim yok
    }
    {
        System.out.println("Instance blok -1");
    }
    static {
        System.out.println("Static blok -2");
    }
    {
        System.out.println("Instance blok -2");
    }

    public static void main(String[] args) {
        //static blok main methoddan bile önce çalışır.
        System.out.println("Test başladı");
        C10_AllBlocks obj1 = new C10_AllBlocks();
        C10_AllBlocks obj2 = new C10_AllBlocks(2);
    }
}
