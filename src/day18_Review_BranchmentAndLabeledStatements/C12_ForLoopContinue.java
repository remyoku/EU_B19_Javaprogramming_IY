package day18_Review_BranchmentAndLabeledStatements;

public class C12_ForLoopContinue {
    public static void main(String[] args) {

        // 1-100 arasındaki sayıları toplayalım
        //Toplam sonuca 3 'e tam bölünenleri dahil etmeyelim

        int toplam = 0;


        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0){
                continue;
            }
            toplam += i;
        }
        System.out.println("toplam = " + toplam);
    }
}
