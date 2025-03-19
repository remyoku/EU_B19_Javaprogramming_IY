package day43_Inheritance.MultiLevelInheritance;

public class GrandParent {

    public String name;

    private int evSayisi = 10;

    public GrandParent(String name){
        this.name = name;
    }

    public void display(){
        System.out.println("name : " + name);
    }
    public void miras(){
        System.out.println("Herşeyim sizin");
    }

    public int getEvSayisi() {
        return evSayisi;
    }

    public void setEvSayisi(int evSayisi) {
        this.evSayisi = evSayisi;
    }
}
