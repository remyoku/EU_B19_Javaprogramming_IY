package day47_FinalKeyword_VarMethodHiding.VariableHiding;

public class Test {
    public static void main(String[] args) {

        Child child = new Child();
        child.print();
        child.printParent();

        System.out.println();

        Parent parent = new Parent();
        parent.print();

    }
}
