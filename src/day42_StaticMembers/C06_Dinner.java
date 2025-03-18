package day42_StaticMembers;

public class C06_Dinner {

    static int pizzaDilimi = 8;
    String ev ;

    public void dilimAl(){
        if (pizzaDilimi <= 0){
            System.out.println("Pizza Bitti...!!!");
            return;
        }
            pizzaDilimi--;



    }
    public void dilimAl(int istenenDilim){
        if (istenenDilim > pizzaDilimi){
            System.out.println(istenenDilim + " dilim pizza kalmadı. Kalan dilim sayısı : " +pizzaDilimi);
            return;
        }

        pizzaDilimi -= istenenDilim;
    }
}
