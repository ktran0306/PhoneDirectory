//PhoneRecord.java
public class PhoneRecord {
    private String name;
    private String number;
    //Constructor
    public PhoneRecord(String personName, String phoneNumber) {
        name = personName;
        number = phoneNumber;
    }
    //Returns the name stored in the record
    public String getName() { return name; }


    //Returns the phone number stored in the record
    public String getNumber() { return number; }


    //Modifies the name stored in the record
    public void setName(String personName) { name = personName; }


    //Modifies the phone number stored in the record
    public void setNumber(String phoneNumber) { number = phoneNumber;}


    //convert the content of the object into String format
    @Override
    public String toString() {
        return "{" +
                "name='" + name + '\'' +
                ", number='" + number + '\'' +
                '}';
    }
}
