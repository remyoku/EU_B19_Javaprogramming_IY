package day30_Arrays01;

public class C07_ArrayLoop {
    public static void main(String[] args) {

        int [] myList = {15,23,34,76,36,90,12};

        System.out.println("myList [0] = " + myList[0]);//15
        System.out.println("myList [1] = " + myList[1]);//23
        System.out.println("myList [2] = " + myList[2]);//34
        System.out.println("myList [3] = " + myList[3]);//76
        System.out.println("myList [4] = " + myList[4]);//36
        System.out.println("myList [5] = " + myList[5]);//90
        System.out.println("myList [6] = " + myList[6]);//12

        System.out.println("---------------------------------------------");

        for (int i = 0; i < myList.length; i++) {
            System.out.println(myList[i]);


        }
        System.out.println("---------------------------------------------");

        for (int i =  myList.length-1; i >=0; i--) {  // elemanlareı tersten alma yöntemi
            System.out.println(myList[i]);
        }
    }
}
