package day45_Review.BankAccountProject;

public class BankTest {
    public static void main(String[] args) {

        Akbank akbank = new Akbank(1000);
        YapıKredi yapıKredi = new YapıKredi(1000);
        GarantiBankasi garantiBankasi = new GarantiBankasi(1000);

        System.out.println("Interest rate from Akbank : " + akbank.getInterestRate() + " an new balance : " + akbank.calculateInterest());
        System.out.println("Interest rate from YapıKredi : " + yapıKredi.getInterestRate() + " an new balance : " + yapıKredi.calculateInterest());
        System.out.println("Interest rate from Garanti : " + garantiBankasi.getInterestRate() + " an new balance : " + garantiBankasi.calculateInterest());
    }
}
