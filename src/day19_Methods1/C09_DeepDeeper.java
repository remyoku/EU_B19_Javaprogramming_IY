package day19_Methods1;

public class C09_DeepDeeper {
    public static void main(String[] args) {

        System.out.println("Start");
        deep();
        deep();
        deeper();
       // C07_Amazon.amazonLogin();
        System.out.println("Deeper");

    }
    public static void deep(){
        System.out.println("Deep methodunun içi");
        deeper();
        System.out.println("Hala deep methodundayız");
    }
    public static void deeper(){
        System.out.println("Deeper methodunun içi");

    }
}
