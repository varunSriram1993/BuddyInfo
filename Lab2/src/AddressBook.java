import java.util.ArrayList;


public class AddressBook {
private ArrayList<BuddyInfo> buddyList= new ArrayList<BuddyInfo>();	
public AddressBook(){
	
	
}
public void addBuddy(BuddyInfo b){
	
	buddyList.add(b);
	
}
public void removeBuddy(BuddyInfo buddy){
	buddyList.remove(buddy);
	
}
public static void main (String[] arg){
	System.out.println("AddresBook");
	AddressBook book = new AddressBook();
	BuddyInfo add = new BuddyInfo("BOB","123 main St");
	book.addBuddy(add);
	book.removeBuddy(add);
	
}
}



