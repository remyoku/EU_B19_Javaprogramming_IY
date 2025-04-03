package day52_Error_Exceptions;

public class C00_Intro {
    /**
     * Hatalar nelerdir?
     * Hatalarla nasıl başa çıkabiliriz?
     *
     * Errors in Java
     *
     * Objeden oluşan Throwable classı var bunun da iki alt başlığı var
     *
     * Error--> Programın sonlanmasına yol açan, kritik bir sorun olan ve çözülemeyen , Javanın handle edemediği sorunlara
     * error diyoruz.
     * Exception--> Programın çalışması sırasında meydana gelen istisnai durumlardır. Kodla kurtarılabilir.
     *
     * Error java koduyla çözülemez
     * Exception istisnadır kodumuzla bunu çözebiliriz.
     *
     * Error üçe ayrılır.
     * Compile-- derlenme esnasında karşılaşılan hata
     * Runtime -- çalıştırma esnasında çıkan hatalar.daha çok dış müdahalelerle olan . internet gitmesi gibi
     * Logical -- mantık , yapısal hatalardan kaynaklı
     *
     * Exception
     * kodunuzda meydana gelen ihtimal dahilinde gerçekleşen ve bunlara kod içinde çözüm sunabilidiğimiz
     * hatalardır.
     *
     * neden bu exceeptionları handle etmemiz lazım?
     * -code da ki devamlılığını sağlamak.
     * bu yüzden diyoruz ki hatadan sonraki testim de devam etdin.
     * 100 test çalıştı 1 çalışmadı
     * hatanın yönetimini sağlamak
     *
     */
}
