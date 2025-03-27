package day48_AbstracClass.Cake;

public class CikolatalıKek extends BaseCake {

    private int cikolata;

    public CikolatalıKek(int yumurta, int un, int seker, int kabartmaTozu, int sut, int yağ) {
        super(yumurta, un, seker, kabartmaTozu, sut, yağ);
        this.cikolata = cikolata;
    }

    public int getCikolata() {
        return cikolata;
    }

    public void setCikolata(int cikolata) {
        this.cikolata = cikolata;
    }

    @Override
    public void karistir() {
        System.out.println("Aşşağıdaki malzemeleri karıştırma kabına koy");
        System.out.println("En az 5 dkk karıştır");
        System.out.println("Un = " + getUn());
        System.out.println("KabartmaTozu = " + getKabartmaTozu());
        System.out.println("Şeker = " + getSeker());
        System.out.println("Sut = " + getSut());
        System.out.println("Yağ = " + getYağ());
        System.out.println("Yumurta = " + getYumurta());
        System.out.println("Çikolata = " + getCikolata());

        System.out.println("Bütün malzemeler karıştırıldı.");
    }

    @Override
    public void pisir() {

    }
}
