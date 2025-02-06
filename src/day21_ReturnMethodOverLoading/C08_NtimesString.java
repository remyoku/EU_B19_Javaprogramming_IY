package day21_ReturnMethodOverLoading;

public class C08_NtimesString {
    public static void main(String[] args) {

        stringNtimes("İrem",5);
        System.out.println(stringtimes("Yokuş", 3));

    }
    public static void stringNtimes(String str , int num){

        for (int i = 0; i < num; i++) {
            System.out.print(str);
        }

    }
    public static String stringtimes(String str, int num){
        String result = "";

        for (int i = 0; i < num; i++) {
            result+=str;
        }
        return result;
    }
}
