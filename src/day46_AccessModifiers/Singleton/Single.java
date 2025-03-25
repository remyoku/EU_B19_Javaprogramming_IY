package day46_AccessModifiers.Singleton;

public class Single {

    private static Single singleInstance = null;
    private  static int maxNumberOfInstance;
    private static int numberOfInstance;

    public Single() {
        numberOfInstance++;
    }
    public static  Single getInstance(){
        System.out.println("GetInstance Method Called");

        if (singleInstance == null || numberOfInstance < maxNumberOfInstance) {
            System.out.println("Instance Created");
            singleInstance=new Single();
        }
        return singleInstance;
    }

    public static void setMaxInstance(int instance){
        maxNumberOfInstance  = instance;
    }

    public  int getMaxNumberOfInstance() {
        return numberOfInstance;
    }
}
