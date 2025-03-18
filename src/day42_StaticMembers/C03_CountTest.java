package day42_StaticMembers;

public class C03_CountTest {
    public static void main(String[] args) {

        C02_Count count1 = new C02_Count();
        C02_Count count2 = new C02_Count();
        C02_Count count3 = new C02_Count();

        System.out.println("count1.getInstanceCounter() = " + count1.getInstanceCounter());
        System.out.println("count1.getInstanceCounter() = " + count1.getInstanceCounter());
        System.out.println("count1.getInstanceCounter() = " + count1.getInstanceCounter());

        System.out.println("C02_Count.instanceCounter = " + C02_Count.instanceCounter);
    }
}
