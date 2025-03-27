package day48_AbstracClass.Cake;

public class CakeTest {
    public static void main(String[] args) {
        VanilyalıKek vanilyalıKek = new VanilyalıKek(2,300,150,1,200,200);
        vanilyalıKek.setVanilya(2);
        vanilyalıKek.karistir();

        CikolatalıKek cikolatalıKek = new CikolatalıKek(2,300,150,1,200,200);
        cikolatalıKek.setCikolata(100);
        cikolatalıKek.karistir();
    }
}
