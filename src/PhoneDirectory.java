//PhoneDirectory.java
public class PhoneDirectory{
    //instance variables
    private int numRecords;
    private PhoneRecord[] data = new PhoneRecord[100];

    //Constructor
    public PhoneDirectory(){
        numRecords = 0;
        PhoneRecord[] data = new PhoneRecord[100];
    }

    //Methods

    ////////////////////////////////////////////////////////////////
    //Function: enterPhoneRecords
    //Behavior: store a new phone record in the database
    //Parameter: String name - name
    //           String number - number
    //Returns: None
    ////////////////////////////////////////////////////////////////
    public void enterPhoneRecords(String name, String number){
        data[numRecords] = new PhoneRecord(name, number);
        numRecords++;
    }
    ////////////////////////////////////////////////////////////////
    //Function: findPhoneRecord
    //Behavior: search the database for records whose names begin with the search key
    //          The users doesn't need to enter an entire name. This method will display
    //          all names that begin with the characters entered by the user.
    //          The case of the input does not matter. If the customer number in not in the array,
    //          the program will print that "the record does not exist.
    //Parameter: key - String key
    //Returns: None
    public void findPhoneRecord(String key){
        for (int i = 0; i < numRecords; i++) {
            String name = data[i].getName().toLowerCase();
            //find the match
            if (name.startsWith(key))
                System.out.print(data[i].getName() + " " + data[i].getNumber() + "\n");
        }
        }
    }

