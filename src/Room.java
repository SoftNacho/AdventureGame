import java.util.ArrayList;
import java.util.LinkedList;

/**
 * Room creates rooms and every detail important to the adventure game
 * 
 * @author      Lisa Gentil
 * @version     CSC 2232 Spring 2015 April 9th
 */
public class Room {

	//Creating the instances
	private int roomNumber;
	private int roomToNorth;
	private int roomToSouth;
	private int roomToEast;
	private int roomToWest;
	private String roomShortDescription;
	private String roomLongDescription;
	private ArrayList <Actor> actors = new ArrayList <Actor> ();
	LinkedList <Item> items = new LinkedList <Item> ();
	private int roomPoints;
	
	//For dr. Henderson's tester (project9)
	private LinkedList <String> roomActorsLinkedList = new LinkedList <String> ();
	private LinkedList <String> roomItemsLinkedList = new LinkedList <String> ();
	
	
	//Creating the getters
	/**
	 * getRoomNumber returns the number of the room the explorer is in
	 * 
	 * @return 		roomNumber
	 */
	public int getRoomNumber(){
		
		return roomNumber;
	}//end getRoomNumber
	
	/**
	 * getRoomToNorth returns the room number of the room north to the room the explorer is in
	 * 
	 * @return		roomToNorth
	 */
	public int getRoomToNorth(){
		
		return roomToNorth;
	}//end getRoomToNorth
	
	/**
	 * getRoomToSouth returns the room number of the room south to the room the explorer is in
	 * 
	 * @return		roomToSouth
	 */
	public int getRoomToSouth(){
		
		return roomToSouth;
	}//end getRoomToSouth
	
	/**
	 * getRoomToEast returns the room number of the room east to the room the explorer is in
	 * 
	 * @return		roomToEast
	 */
	public int getRoomToEast(){
		
		return roomToEast;
	}//end getRoomToEast
	
	
	/**
	 * getRoomToWest returns the room number of the room west to the room the explorer is in
	 * 
	 * @return		roomToWest
	 */
	public int getRoomToWest(){
		
		return roomToWest;
	}//end getRoomToWest
	
	/**
	 * getRoomShortDescription returns a short description of the room the explorer is in
	 * 
	 * @return		roomShortDescription
	 */
	public String getRoomShortDescription(){
		
		return roomShortDescription;
	}//end getShortDescription
	
	/**
	 * getRoomLongDescription returns a long description of the room the explorer is in
	 * 
	 * @return		roomLongDescription
	 */
	public String getRoomLongDescription(){
		
		return roomLongDescription;
	}//end getRoomLongDescription
	
	//Creating the setters
	
	/**
	 * getRoomPoints returns the points earned with the room
	 * 
	 * @return		roomPoints
	 */
	public int getRoomPoints(){
		
		return roomPoints;
	}//end getRoomPoints
	
	/**
	 * putRoomNumber assesses a number to the room the explorer is in
	 * 
	 * @param roomNumber
	 */
	public void putRoomNumber(int roomNumber){
		
		this.roomNumber = roomNumber;
	}//end putRoomNumber
	
	/**
	 * putRoomToNorth assesses a number to the room north to the room the explorer is in
	 * 
	 * @param roomToNorth
	 */
	public void putRoomToNorth(int roomToNorth){
		
		this.roomToNorth = roomToNorth;
	}//end putRoomToNorth
	
	/**
	 * putRoomToSouth assesses a number to the room south to the room the explorer is in
	 * 
	 * @param roomToSouth
	 */
	public void putRoomToSouth(int roomToSouth){
		
		this.roomToSouth = roomToSouth;
	}//end putRoomToSouth
	
	/**
	 * putRoomToEast assesses a number to the room east to the room the explorer is in
	 * 
	 * @param roomToEast
	 */
	public void putRoomToEast(int roomToEast){
		
		this.roomToEast = roomToEast;
	}//end putRoomEast
	
	/**
	 * putRoomToWest assesses a number to the room west to the room the explorer is in
	 * 
	 * @param roomToWest
	 */
	public void putRoomToWest(int roomToWest){
		
		this.roomToWest = roomToWest;
	}//end putRoomToWest
	
	/**
	 * putRoomShortDescription assesses a short description of the room the explorer is in
	 * 
	 * @param roomShortDes
	 */
	public void putRoomShortDescription(String roomShortDescription){
		
		this.roomShortDescription = roomShortDescription;
	}//end putRoomShortDescription
	
	/**
	 * putRoomLongDescription assesses a long description of the room the explorer is in
	 * 
	 * @param roomLongDes
	 */
	public void putRoomLongDescription(String roomLongDescription){
		
		this.roomLongDescription = roomLongDescription;
	}//end putRoomLongDescription
	
	/**
	 * putRoomPoints sets the number of points earned with the room
	 * 
	 * @return		roomPoints
	 */
	public void putRoomPoints(int roomPoints){
		
		this.roomPoints = roomPoints;
	}//end putRoomPoints
	
	//Creating the look method
	/**
	 * look method prints out the long description to the console
	 * 
	 */
	public void look(){
		
		System.out.println(roomLongDescription);
	}//end look
	
	/**
	 * shortLook method prints out the short description to the console
	 * 
	 */
	public void shortLook(){
		
		System.out.println(roomShortDescription);
	}//end shortLook
	
	/**
	 * inventoryActors methods prints out the list of the actors present in a room
	 * 
	 */
	public void inventoryActorsLisa(){
		
		for (Actor a : actors)
			System.out.println("Actor: " + a.getActorName());
	}//end inventoryActors
	
	/**
	 * inventoryObject methods prints out the list of the objects present in a room
	 * 
	 */
	public void inventoryItemsLisa(){
		
		for (Item o : items)
			System.out.println("Object: " + o.getItemName());
	}//end inventoryItems
	
	/**
	 * addActor method adds a new actor to a room
	 * 
	 * @param newActor
	 */
	public void addActorLisa(Actor newActor){
		
		actors.add(newActor);
	}//end addActorLisa
	/**
	 * removeActor method removes an actor from a room
	 * 
	 * @param A
	 * @return
	 */
	public void removeActorLisa (Actor A){
		
		if (actors.size() > 0){
		
		Actor holder = A;
		actors.remove(A);
		System.out.println("You removed this actor from the room: " + holder.getActorName());
		System.out.println();
		}//end if 
		
		else 
			System.out.println("There is no actor in the room!");
			System.out.println();
	}//end removeActorLisa
	
	/**
	 * addItem method adds a new object to a room
	 * 
	 * @param newItem
	 */
	public void addItemLisa (Item newItem){
		
		items.add(newItem);
	}//end addItemLisa
	
	/**
	 * removeItem method removes an object from a room
	 * 
	 * @param I
	 * @return
	 */
	public void removeItemLisa (Item I){
		
		if (items.size() > 0){
		
		Item holder2 = I;
		items.remove(I);
		System.out.println("You removed this object from the room: " + holder2.getItemName());
		System.out.println();
		}//end if 
		
		else 
			System.out.println("There is no object in the room!");
			System.out.println();
	}//end removeItemLisa
	
	//add and remove methods for Dr.Henderson's Tester
	/**
	 * addActor method adds a new actor to a room
	 * 
	 * @param newActor
	 */
	public void addActor(String newActor){
		
		roomActorsLinkedList.add(newActor);
	}//end addActor
	/**
	 * removeActor method removes an actor from a room
	 * 
	 * @param Actor
	 * @return
	 */
	public void removeActor (String Actor){
		
		if (roomActorsLinkedList.size() > 0){
		
		String holder = Actor;
		roomActorsLinkedList.remove(Actor);
		System.out.println("You removed this actor from the room: " + holder);
		System.out.println();
		}//end if 
		
		else 
			System.out.println("There is no actor in the room!");
			System.out.println();
	}//end removeActor
	
	/**
	 * addItem method adds a new object to a room
	 * 
	 * @param newItem
	 */
	public void addItem (String newItem){
		
		roomItemsLinkedList.add(newItem);
	}//end addItem
	
	/**
	 * removeItem method removes an object from a room
	 * 
	 * @param Item
	 * @return
	 */
	public void removeItem (String Item){
		
		if (roomItemsLinkedList.size() > 0){
		
		String holder2 = Item;
		roomItemsLinkedList.remove(Item);
		System.out.println("You removed this object from the room: " + holder2);
		System.out.println();
		}//end if 
		
		else 
			System.out.println("There is no object in the room!");
			System.out.println();
	}//end removeItem
	
	/**
	 * inventoryActors methods prints out the list of the actors present in a room
	 * 
	 */
	public void inventoryActors(){
		
		for (String a : roomActorsLinkedList)
			System.out.println("Actor: " + a);
	}//end inventoryActors
	
	/**
	 * inventoryObject methods prints out the list of the objects present in a room
	 * 
	 */
	public void inventoryItems(){
		
		for (String o : roomItemsLinkedList)
			System.out.println("Object: " + o);
	}//end inventoryItems
	
}//end Room