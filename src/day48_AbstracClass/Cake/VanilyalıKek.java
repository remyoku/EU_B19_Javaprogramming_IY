package day48_AbstracClass.Cake;

public class VanilyalıKek extends BaseCake{

    private int vanilya;

    public VanilyalıKek(int yumurta, int un, int seker, int kabartmaTozu, int sut, int yağ) {
        super(yumurta, un, seker, kabartmaTozu, sut, yağ);
        this.vanilya = vanilya;
    }

    public int getVanilya() {
        return vanilya;
    }

    public void setVanilya(int vanilya) {
        this.vanilya = vanilya;
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
        System.out.println("Vanilya = " + getVanilya());

        System.out.println("Bütün malzemeler karıştırıldı.");
    }

    @Override
    public void pisir() {

    }
}
