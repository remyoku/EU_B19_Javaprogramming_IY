package day49_Interface_Enum_DataClass.Enumaration;

public class C04_Araba {

    private C01_Colors colors;

    private C03_Brands brand;

    private int year;

    public C04_Araba(C01_Colors colors, C03_Brands brand, int year) {
        this.colors = colors;
        this.brand = brand;
        this.year = year;
    }

    public C01_Colors getColors() {
        return colors;
    }

    public void setColors(C01_Colors colors) {
        this.colors = colors;
    }

    public C03_Brands getBrand() {
        return brand;
    }

    public void setBrand(C03_Brands brand) {
        this.brand = brand;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "C04_Araba{" +
                "colors=" + colors +
                ", brand=" + brand +
                ", year=" + year +
                '}';
    }
}
