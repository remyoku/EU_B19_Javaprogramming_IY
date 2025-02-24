package day27_StringClass2;

public class C10_KarakterSayısı {
    public static void main(String[] args) {

        System.out.println(karakterSay("AnkaraRanar", 'R'));

    }

    public static int karakterSay(String str, char ch){
        int sayac=0;
        String x = ""+ch;

        for (int i = 0; i < str.length(); i++) {
           if(str.substring(i,i+1).equalsIgnoreCase(x)){
               sayac++;
           }
        }

        return sayac;
    }



    }
