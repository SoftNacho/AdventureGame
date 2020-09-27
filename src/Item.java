/**
 * Item creates objects and every detail important to the adventure game
 * 
 * @author      Lisa Gentil
 * @version     CSC 2232 Spring 2015 April 9th
 */
public class Item {

	//Creating instances
	private String itemName;
	private String itemDescription;
	private int itemLocation;
	private int itemPoints;
	private int itemNumber;
	private int itemDeposLocation;
	
	/**
	 * getItemName returns the name of the object
	 * 
	 * @return		itemName
	 */
	public String getItemName(){
		
		return itemName;
	}//end getItemName
	
	/**
	 * getItemDescription returns the description of the object
	 * 
	 * @return		itemDescription
	 */
	public String getItemDescription(){
		
		return itemDescription;
	}//end getItenDescription
	
	/**
	 * getItemLocation returns the location of the object
	 * 
	 * @return		itemLocation
	 */
	public int getItemLocation(){
		
		return itemLocation;
	}//end getItemLocation
	
	/**
	 * getItemPoints returns the points earned with the object
	 * 
	 * @return		itemPoints
	 */
	public int getItemPoints(){
		
		return itemPoints;
	}//end getItemPoints
	
	/**
	 * getItemNumber returns the number of the object
	 * 
	 * @return		itemNumber
	 */
	public int getItemNumber(){
		
		return itemNumber;
	}//end getItemNumber
	
	/**
	 * getItemDeposLocation returns the room number for the final location the object
	 * 
	 * @return		itemDeposLocation
	 */
	public int getItemDeposLocation(){
		
		return itemDeposLocation;
	}//end getItemDeposLocation
	
	/**
	 * putItemName assesses a name to the object
	 * 
	 * @param itemName
	 */
	public void putItemName(String itemName){
		
		this.itemName = itemName;
	}//end putItemName
	
	/**
	 * putItemDescription assesses a description to the object
	 * 
	 * @param itemDescription
	 */
	public void putItemDescription(String itemDescription){
		
		this.itemDescription = itemDescription;
	}//end putItemDes
	
	/**
	 * putItemLocation assesses a location to the object
	 * 
	 * @param itemLocation
	 */
	public void putItemLocation(int itemLocation){
		
		this.itemLocation = itemLocation;
	}//end putItemLocation
	
	/**
	 * putItemPoints sets the number of points earned with the object
	 * 
	 * @param		itemPoints
	 */
	public void putItemPoints(int itemPoints){
		
		this.itemPoints = itemPoints;
	}//end putItemPoints
	
	/**
	 * putItemNumber sets the number of the object
	 * 
	 * @param		itemNumber
	 */
	public void putItemNumber(int itemNumber){
		
		this.itemNumber = itemNumber;
	}//end putItemNumber
	
	/**
	 * putItemDeposLocation sets the room number of the final location of the object
	 * 
	 * @param		itemDeposLocation
	 */
	public void putItemDeposLocation(int itemDeposLocation){
		
		this.itemDeposLocation = itemDeposLocation;
	}//end putItemDeposLocation
	
	/**
	 * identify prints out the description of the object
	 * 
	 */
	public void identify(){
		
		System.out.println(itemDescription);
	}//end identify
	
}//end Item