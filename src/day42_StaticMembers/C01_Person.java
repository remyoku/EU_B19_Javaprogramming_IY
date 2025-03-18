package day42_StaticMembers;

public class C01_Person {
    /**
     *Bir statik değişken obje üretilemeden de kullanılabilir.
     * methodlar ve fieldlar için kullanılır static keywordü
     * hafızanın yönetimi için önemli
     * memoryde heapte saklanır.
     * statice heryerden erişim vardır.
     */

      static  String bossName ="John Doe";

     String name;

    public static void main(String[] args) {

        C01_Person person1= new C01_Person();
        person1.name = "Ali";

        C01_Person person2 = new C01_Person();
        person2.name="Elif";

        System.out.println("person1.name = " + person1.name);
        System.out.println("person2.name = " + person2.name);

        System.out.println("person1.bossName = " + person1.bossName);
        System.out.println("person2.bossName = " + person2.bossName);

        C01_Person.bossName="Jessica Doe";

        System.out.println("person1.name = " + person1.name);
        System.out.println("person2.name = " + person2.name);

        System.out.println("person1.bossName = " + person1.bossName);//Jessica Doe
        System.out.println("person2.bossName = " + person2.bossName);//Jessica Doe

        person1.bossName = "Hasan Doe";
        person1.name = "Veli";

        System.out.println("person1.bossName = " + person1.bossName);//Hasan Doe
        System.out.println("person2.bossName = " + person2.bossName);//Hasan Doe
        System.out.println("person1.name = " + person1.name);//Veli
        System.out.println("person2.name = " + person2.name);//Elif

        C01_Person person3 = new C01_Person();
        C01_Person person4 = new C01_Person();
        C01_Person person5 = new C01_Person();

        System.out.println("person5.bossName = " + person5.bossName);//Hasan Doe
    }

}
