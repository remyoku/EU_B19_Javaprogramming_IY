package day47_FinalKeyword_VarMethodHiding.MethodHiding;

public class Test {
    public static void main(String[] args) {

        Sub sub = new Sub();
        sub.getSuperDesciription();
    }
}
//methodları static yaparsam sub dan superi çağırdığımda true veriyordu ama static
//yapınca superin sonucu olan false u veriyor.