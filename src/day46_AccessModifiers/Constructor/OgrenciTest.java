package day46_AccessModifiers.Constructor;

public class OgrenciTest {
    public static void main(String[] args) {

       // Ogrenci ogrenci = new Ogrenci(); --private const başka calassdan direkt çağırılamaz.
        Ogrenci ogrenci = new Ogrenci("Ahmet","Çakar");
        Ogrenci ogrenci1 = new Ogrenci("İrem","Yokus",154);
    }
}
