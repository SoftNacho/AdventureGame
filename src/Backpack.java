
import java.util.LinkedList;
/**
 * Backpack creates the backpack of the player for the adventure game
 * 
 * @author      Lisa Gentil
 * @version     CSC 2232 Spring 2015 April 9th
 */
public class Backpack {

	LinkedList <Item> backpackLisa = new LinkedList <Item> ();
	
	//for Dr.Henderson's Tester
	private LinkedList <String> backpack = new LinkedList <String> ();
	
	/**
	 * addItem method adds an object to the backpack
	 * 
	 * @param newItem
	 */
	public void addItemLisa (Item newItem){
		
		backpackLisa.add(newItem);
	}//end addItem
	
	/**
	 * removeItem method removes an object from the backpack
	 * 
	 * @param I
	 * @return
	 */
	public void removeItemLisa (Item I){
		
		if (backpackLisa.size() > 0){
		
		Item holder = I;
		backpackLisa.remove(I);
		System.out.println("You removed this object from the backpack: " + holder.getItemName());
		System.out.println();
		}//end if 
		
		else 
			System.out.println("There is no object in the backpack");
			System.out.println();
	}//end removeItem
	
	/**
	 * inventory prints out the objects that are currently in the backpack
	 * 
	 */
	public void inventoryLisa(){
		
		for (Item o : backpackLisa)
			System.out.println("Object in my backpack: " + o.getItemName());
	
	}//end inventory
	
	//add/remove/inventory for Dr. Henderson's tester
	/**
	 * addItem method adds an object to the backpack
	 * 
	 * @param newItem
	 */
	public void addItem (String newItem){
		
		backpack.add(newItem);
	}//end addItem
	
	/**
	 * removeItem method removes an object from the backpack
	 * 
	 * @param Item
	 * @return
	 */
	public void removeItem (String Item){
		
		if (backpack.size() > 0){
		
		String holder = Item;
		backpack.remove(Item);
		System.out.println("You removed this object from the backpack: " + holder);
		System.out.println();
		}//end if 
		
		else 
			System.out.println("There is no object in the backpack");
			System.out.println();
	}//end removeItem
	
	/**
	 * inventory prints out the objects that are currently in the backpack
	 * 
	 */
	public void inventory(){
		
		for (String o : backpack)
			System.out.println("Object in my backpack: " + o);
	
	}//end inventory
}//end Backpack
