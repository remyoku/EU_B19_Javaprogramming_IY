package day39_Encapsulation01;

public class SimpleGetterAndSetter {
    /**
     * Encapsulation
     * ben bir clas oluşturduğumda bazı dataların kolay kolay erişilebilir olmasını istemiyorum.
     * private yapıyorum. diğer classlardan erişeme kapatıyorum
     * peki ihtiyacım olunca ne yapıcam
     * get ve set methodu ile
     * evet bunlarla yapıyorum ama bunları da şarta bağlıyorum bu bu şartları sağlarsan sana bu bilgiyi getirirm diyorum.
     * erişimi belirli şartlara bağlıyoruz.
     * <p>
     * <p>
     * public access modifiers --> Bütün proje altında ben bu public olan dataya ulaşabilirim demek.
     * private access modifiers--> Sadece içinde bulunduğu classdan ulaşılabilir.Classa ait değişkene obje üzerinden ulaşamam.
     */
    // private - sınırlı erişim vardır.Aynı class üzerinden ulaşılabilir.

    private int number;

    //constructor
    public SimpleGetterAndSetter() {
        //this.number = 0;
        setNumber(0);
    }

    public SimpleGetterAndSetter(int number) {
        setNumber(number);

        /*if (number>0){
            this.number = number;
        }else {
            System.out.println("number değişkeni sıfırdan küçük olamaz.");
            this.number=0;
        }*/

    }
/*
    public void numberDeğerAta(int number) {
        if (number > 0) {
            this.number = number;
        } else {
            System.out.println("number değişkeni sıfırdan küçük olamaz.");
            this.number = 0;
        }
    }*/

    //getter method -- return tipi vardır.
    public int getNumber() {
        return number;
    }

    //setter veya mutator method -- data set etmeye yarar
    public void setNumber(int number) {
        if (number > 0) {
            this.number = number;
        } else {
            System.out.println("number değişkeni sıfırdan küçük olamaz.");
            this.number = 0;
        }

    }

    @Override
    public String toString() {
        return "SimpleGetterAndSetter{" +
                "number=" + number +
                '}';
    }
}