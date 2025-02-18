package day26_StringClass01;

public class C02_StringMethods {
    public static void main(String[] args) {

        String programlamaDili = "Java"; // Heap -- String Pool içerisinde bir obje oluştu.
        System.out.println("programlamaDili.length() = " + programlamaDili.length());//4
        //length bana int verir yani metnin uzunluğunu "Java"=4

        programlamaDili = "Phyton";
        System.out.println("programlamaDili.length() = " + programlamaDili.length());//6

        System.out.println("-----------------------------------------------");

        //toLowerCase() ve toUpperCase()
        //büyük harfe çeviren  küçük harfe çeviren

        System.out.println("programlamaDili.toLowerCase() = " + programlamaDili.toLowerCase()); //phyton yazar küçük
        System.out.println("programlamaDili.toUpperCase() = " + programlamaDili.toUpperCase());//PHYTON yazar büyük
        System.out.println("programlamaDili = " + programlamaDili);//Phyton
        // biz bu methodları kullanırken atama yapmıyoruz atamadığımız sürece

        programlamaDili =programlamaDili.toUpperCase(); //PHYTON
        System.out.println("programlamaDili = " + programlamaDili);//PHYTON

        System.out.println("-----------------------------------------------");

        //charAt()  PHYTON
        System.out.println("programlamaDili.charAt(1) = " + programlamaDili.charAt(1)); //H
        // charAt methodu bize index verir 0 1 2 3 4 5
        //                                 P H Y T O N
        System.out.println("programlamaDili.charAt(5) = " + programlamaDili.charAt(5));//N


        System.out.println("programlamaDili.charAt(programlamaDili.length()-1) = " + programlamaDili.charAt(programlamaDili.length() - 1));

        // hiç rakam kullanmadan da bu şekilde verebilirim.

        programlamaDili = "Phyton Programming";
        System.out.println("programlamaDili = " + programlamaDili); // boşlukları da sayar.
        System.out.println("programlamaDili.charAt(6) = " + programlamaDili.charAt(6));

        programlamaDili = "PHYTON";
        //System.out.println("programlamaDili.charAt(8) = " + programlamaDili.charAt(8)); // eğer limit dışı verirsen;
                                                                                   //StringIndexOutOfBoundsException

        System.out.println("-----------------------------------------------");

        //concat()
        System.out.println("programlamaDili = " + programlamaDili);
        System.out.println(programlamaDili + " Programlama Dili");
        System.out.println("programlamaDili.concat(\" Programlama Dili\") = " + programlamaDili.concat(" Programlama Dili"));

        String dil = " Programlama Dili";
        System.out.println("programlamaDili.concat(dil) = " + programlamaDili.concat(dil));

        // biz normlade + ile concat yapıyorduk ama şimdi .concat() yapıp içine yazıp bitiriyorz.
        // veya yazmak istediğimizi bir stringe atayıp yine onu concatın içine yazabiliriz.Yukarıda ki örn gibi.

        System.out.println("-----------------------------------------------");

        //PHYTON
        // contains() --- boolean değer döndürür. metin içerinde bu var mı?
        System.out.println("programlamaDili = " + programlamaDili);
        System.out.println("programlamaDili.contains(\"HY\") = " + programlamaDili.contains("HY"));//true
        System.out.println("programlamaDili.contains(\"YH\") = " + programlamaDili.contains("YH"));//false
        System.out.println("programlamaDili.contains(\"hy\") = " + programlamaDili.contains("hy"));//false // küçük büyük durumuna bakar.

        programlamaDili = "      Phyton Programlama Dili       ";
        System.out.println("programlamaDili.contains(\"phyton\") = " + programlamaDili.contains("phyton"));//false
        System.out.println("programlamaDili.contains(\"n Prog\") = " + programlamaDili.contains("n Prog"));//true

        System.out.println("-----------------------------------------------");

        //trim()  -- baştaki ve sondaki boşlukları atar.

        System.out.println("programlamaDili = " + programlamaDili);
        System.out.println("programlamaDili.trim() = " + programlamaDili.trim());
        System.out.println("programlamaDili = " + programlamaDili);

        System.out.println("-----------------------------------------------");

        //replace() -- değiştir

        System.out.println("programlamaDili = " + programlamaDili);
        System.out.println("programlamaDili.replace(\" \",\"\") = " + programlamaDili.replace(" ", ""));
        // dedim ki boşluları al ve boşlukları boşluksuzla değiştir.
        System.out.println("programlamaDili.replace(\"P\",\"a\") = " + programlamaDili.replace("P", "a"));
        //P ler aldı a ile değiştirdi. böyleydi :       Phyton Programlama Dili
                                    // böyle yaptı:       ahyton arogramlama Dili

        programlamaDili = programlamaDili.replace(" ",""); // burda atama yaptım.
        System.out.println("programlamaDili = " + programlamaDili);
        System.out.println("programlamaDili.replace(\"Phyton\",\"Java\") = " + programlamaDili.replace("Phyton", "Java"));

        System.out.println("-----------------------------------------------");

        //indexOf() , lastIndexOf()

        System.out.println("programlamaDili = " + programlamaDili);

        System.out.println("programlamaDili.indexOf('a') = " + programlamaDili.indexOf('a'));
        // ilk a harfinin index numarasını verir. int olan ama  ---> indexOf

        System.out.println("programlamaDili.indexOf(\"Programlama\") = " + programlamaDili.indexOf("Programlama"));
        // ilk bu kelimeyi yakaladığı index i verir ---> indexOf

        System.out.println("programlamaDili.lastIndexOf('a') = " + programlamaDili.lastIndexOf('a'));
        // metin içinde ki son index a yı almak istersek. int bu da ---> lastIndexOf()

        System.out.println("-----------------------------------------------");

        System.out.println("programlamaDili = " + programlamaDili);
        System.out.println(programlamaDili.indexOf(programlamaDili.charAt(programlamaDili.length() / 2)));
        System.out.println("-----------------------------------------------");

        //equals()
        String str1 = "hello";
        String str2 = "hello";

        String str3 = new String("Hello");
        String str4 = new String("Hello");

        System.out.println((str1 == str2));

        System.out.println((str1.equals(str2)));
        System.out.println((str1.equals(str3)));
        System.out.println((str1.equals(str4)));

        System.out.println("-----------------------------------------------");

        //egualsIgnorecase() --- harflerin büyüklüğü küçüklüğünü göz ardı et

        System.out.println((str1.equalsIgnoreCase(str4)));

        System.out.println(str1.toLowerCase().equals(str4.toLowerCase()));


    }
}
