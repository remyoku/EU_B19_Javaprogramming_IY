package day49_Interface_Enum_DataClass.DataClass;

public record C03_PersonRecord(String firstName, String lastName, String phone,String address) implements Adressable{

    @Override
    public void printAddress() {
        System.out.println("address() = " + address());
    }

    public String generateCode(){
        return firstName.toUpperCase()+lastName.length()+phone.substring(0,2);
    }
}
