package day42_StaticMembers;

public class C02_Count {

    static int instanceCounter = 0;

    public C02_Count() {
        instanceCounter++;

    }

    public int getInstanceCounter() {
        return instanceCounter;
    }
}
