package day48_AbstracClass.Cake;

public abstract class BaseCake {

    private int yumurta;
    private int un;
    private int seker;
    private int kabartmaTozu;
    private int sut;
    private int yağ;

    public BaseCake(int yumurta, int un, int seker, int kabartmaTozu, int sut, int yağ) {
        this.yumurta = yumurta;
        this.un = un;
        this.seker = seker;
        this.kabartmaTozu = kabartmaTozu;
        this.sut = sut;
        this.yağ = yağ;
    }

    public int getYumurta() {
        return yumurta;
    }

    public void setYumurta(int yumurta) {
        this.yumurta = yumurta;
    }

    public int getUn() {
        return un;
    }

    public void setUn(int un) {
        this.un = un;
    }

    public int getSeker() {
        return seker;
    }

    public void setSeker(int seker) {
        this.seker = seker;
    }

    public int getKabartmaTozu() {
        return kabartmaTozu;
    }

    public void setKabartmaTozu(int kabartmaTozu) {
        this.kabartmaTozu = kabartmaTozu;
    }

    public int getSut() {
        return sut;
    }

    public void setSut(int sut) {
        this.sut = sut;
    }

    public int getYağ() {
        return yağ;
    }

    public void setYağ(int yağ) {
        this.yağ = yağ;
    }

    @Override
    public String toString() {
        return "BaseCake{" +
                "yumurta=" + yumurta +
                ", un=" + un +
                ", seker=" + seker +
                ", kabartmaTozu=" + kabartmaTozu +
                ", sut=" + sut +
                ", yağ=" + yağ +
                '}';
    }
    public abstract void karistir();
    public abstract void pisir();
}
