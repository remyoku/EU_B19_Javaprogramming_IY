package day41_Review.encapsulation;

public class C03_ImmutablePerson {

    private String name;
    private int age;

    private boolean isMahkeme = true;

    public C03_ImmutablePerson(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public void changeAge(int year){
        age = age+year;
    }
    public void changeName(String name){
        if (isMahkeme){
            this.name = name;
        }
    }
}
