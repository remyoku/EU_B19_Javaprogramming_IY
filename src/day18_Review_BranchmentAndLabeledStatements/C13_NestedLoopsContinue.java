package day18_Review_BranchmentAndLabeledStatements;

public class C13_NestedLoopsContinue {
    public static void main(String[] args) {

        for (int i = 1; i < 4; i++) {
            for (int j = 1; j <4 ; j++) {
                if ( i * j > 2) {
                    continue;
                }
                System.out.println(i * j);
            }
            System.out.println(i);
        }
    }
}
