package day18_Review_BranchmentAndLabeledStatements;

public class C05_Counter {
    public static void main(String[] args) {
        // 1 den 1000 e kadar olan sayılar içerisinde 17 ye tam bölünebilen
        // kaç sayı olduğunu bulan bir kod yazınız.
        // cevap : 58

        int counter = 0;

        for (int i = 1; i <= 1000; i++) {
            if (i % 17 == 0){
                counter ++;
            }

        }
        System.out.println("1-1000 arasında 17' ye tam bölünen " + counter + " sayı vardır");

        // while loop

        int index = 0;
        int counter1 = 0;
        while (index <= 1000){
            index ++;
            if (index % 17 == 0 ){
                counter1 ++;
            }
        }
        System.out.println("counter1 = " + counter1);
    }
}
