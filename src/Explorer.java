import java.util.*;
import java.util.LinkedList;

/**
 * Explorer is part of FSC Adventure Game
 * 
 * @author      Lisa Gentil
 * @version     CSC 2232 Spring 2015 April 23rd
 */
public class Explorer {

	//creating instances
	private Backpack myBackPack = new Backpack();
	private Room myLocation;
	private int score;
	ListIterator <Room> myRoomIterator;
	//private LinkedList <Room> myRoomsLinkedList = new LinkedList<Room>();
	Scanner input = new Scanner(System.in);
	
	
	/**
	 * getLocation returns the location of the explorer
	 * 
	 * @return myLocation
	 */
	public  Room getLocation() {
		return myLocation;
	}//end getLocation
	
	/**
	 * getScore returns the updated score of the explorer
	 * 
	 * @return score
	 */
	public int getScore() {
		return score;
	}//end getScore
	
	/**
	 * getBackPack returns the backpack
	 * 
	 * @return myBackPack
	 */
	public Backpack getBackPack() {
		return myBackPack;
	}//end getBackPack
	
	/**
	 * putLocation sets the location of the explorer
	 * 
	 * @param Location
	 */
	public void putLocation(Room myLocation) {
		this.myLocation = myLocation;
	}//end putLocation
	
	/**
	 * putScpre sets the score of the explorer
	 * @param myScore
	 */
	public void putScore(int myScore){
		this.score = myScore;
	}//end putScore
	
	/**
	 * putBackPack sets the backpack
	 * 
	 * @param myTempBackPack
	 */
	public void putBackPack(Backpack myBackPack){
		this.myBackPack = myBackPack;
	}//end putBackPack
	
	/**
	 * look runs the look method after asking where the explorer is
	 */
	public void look(){
		myLocation.look();
	}//end look
	
	/**
	 * shortLook runs the shortLook method after asking where the explorer is
	 */
	public void shortLook(){
		myLocation.shortLook();
	}//end shortLook
	
	
	
	/**
	 * north makes the explorer move to the room to the north
	 * 
	 * @param myRoomsLinkedList
	 */
	public void north(LinkedList myRoomsLinkedList){
		int newRoomNumber = 0;
		Room newRoom = new Room();
		
		if(myLocation.getRoomToNorth() == -1)
			System.out.println("No room in that direction! ");
	
		else {
			myRoomIterator = myRoomsLinkedList.listIterator();
			newRoomNumber = myLocation.getRoomToNorth();
			for(int i = 0; i<= newRoomNumber; i++)
				newRoom = myRoomIterator.next();
			myLocation = newRoom;
			calculateScore();
			//System.out.println(myLocation.getRoomShortDescription());
		}//end else
		System.out.println();
	}//end north
	
	/**
	 * south makes the explorer move to the room to the south
	 * 
	 * @param myRoomsLinkedList
	 */
	public void south(LinkedList myRoomsLinkedList){
		int newRoomNumber = 0;
		Room newRoom = new Room();
		
		if(myLocation.getRoomToSouth() == -1)
			System.out.println("No room in that direction! ");
	
		else {
			myRoomIterator = myRoomsLinkedList.listIterator();
			newRoomNumber = myLocation.getRoomToSouth();
			for(int i = 0; i<= newRoomNumber; i++)
				newRoom = myRoomIterator.next();
			myLocation = newRoom;
			calculateScore();
			//System.out.println(myLocation.getRoomShortDescription());
		}//end else
		System.out.println();
	}//end south
	
	/**
	 * east makes the explorer move to the room to the east
	 * 
	 * @param myRoomsLinkedList
	 */
	public void east(LinkedList myRoomsLinkedList){
		int newRoomNumber = 0;
		Room newRoom = new Room();
		
		if(myLocation.getRoomToEast() == -1)
			System.out.println("No room in that direction! ");
	
		else {
			myRoomIterator = myRoomsLinkedList.listIterator();
			newRoomNumber = myLocation.getRoomToEast();
			for(int i = 0; i<= newRoomNumber; i++)
				newRoom = myRoomIterator.next();
			myLocation = newRoom;
			calculateScore();
			//System.out.println(myLocation.getRoomShortDescription());
		}//end else
		System.out.println();
	}//end east
	
	/**
	 * west makes the explorer move to the room to the west
	 * 
	 * @param myRoomsLinkedList
	 */
	public void west(LinkedList myRoomsLinkedList){
		int newRoomNumber = 0;
		Room newRoom = new Room();
		
		if(myLocation.getRoomToWest() == -1)
			System.out.println("No room in that direction! ");
	
		else {
			myRoomIterator = myRoomsLinkedList.listIterator();
			newRoomNumber = myLocation.getRoomToWest();
			for(int i = 0; i<= newRoomNumber; i++)
				newRoom = myRoomIterator.next();
			myLocation = newRoom;
			calculateScore();
			//System.out.println(myLocation.getRoomShortDescription());
		}//end else
		System.out.println();
	}//end west
	
	/**
	 * move enables the explorer to move to a direction
	 * @param myRoomsLinkedList
	 */
	public void move(LinkedList myRoomsLinkedList){
		String direction = " ";
		System.out.println("Do you want to move north, south, east or west? ");
		direction = input.nextLine();
		System.out.println();
		if (direction.equalsIgnoreCase("north"))
			north(myRoomsLinkedList);
		else if (direction.equalsIgnoreCase("south"))
			south(myRoomsLinkedList);
		else if (direction.equalsIgnoreCase("east"))
			east(myRoomsLinkedList);
		else if (direction.equalsIgnoreCase("west"))
			west(myRoomsLinkedList);
		else
			System.out.println("unknown command.");
		System.out.println();
	}//end move
	
	/**
	 * go enables the explorer to move to a direction
	 * @param myRoomsLinkedList
	 */
	public void go(LinkedList myRoomsLinkedList){
		String direction;
		System.out.println("Do you want to go north, south, east or west? ");
		direction = input.nextLine();
		System.out.println();
		if (direction.equalsIgnoreCase("north"))
			north(myRoomsLinkedList);
		else if (direction.equalsIgnoreCase("south"))
			south(myRoomsLinkedList);
		else if (direction.equalsIgnoreCase("east"))
			east(myRoomsLinkedList);
		else if (direction.equalsIgnoreCase("west"))
			west(myRoomsLinkedList);
		else
			System.out.println("unknown command.");
		System.out.println();
	}//end go
	
	/**
	 * take allows the user to take items from the room and put them in the backpack
	 * @param items
	 */
	public void take(Item items){
		ListIterator <Item> itemIterator2 = myLocation.items.listIterator();
		Item i;
		List <Item> tempR = new ArrayList <Item> ();
		while (itemIterator2.hasNext()) {
			i = itemIterator2.next();
			tempR.add(i);
		}//end while
		System.out.println("Which item do you want to take? ");
		ListIterator <Item> itemIterator3 = tempR.listIterator();
		Item tempI = new Item();
		String temp = "";
		while (itemIterator3.hasNext()) {
			tempI = itemIterator3.next();
			while ((!temp.equalsIgnoreCase("yes")) && (!temp.equalsIgnoreCase("no"))) {
				System.out.println("Take this item: " + tempI.getItemName() + " yes or no? " );
				temp = input.nextLine();
			}//end while
			if (temp.equalsIgnoreCase("yes")){
				myBackPack.addItemLisa(tempI);
				myLocation.removeItemLisa(tempI);
			}//end if
			temp = "";
		}//end while
		System.out.println();
	}//end take
	
	/**
	 * drop allows the user to take an item off the backpack and leave it in the room they're in
	 */
	public void drop () {
		ListIterator <Item> itemIterator4 = myLocation.items.listIterator();
		Item i;
		Backpack tempBackPack = new Backpack();
		while (itemIterator4.hasNext()) {
			i = itemIterator4.next();
			tempBackPack.addItemLisa(i);
		}//end while
		System.out.println("What item do you want to drop? ");
		ListIterator <Item> tempBackPackIterator = tempBackPack.backpackLisa.listIterator();
		Item tempI = new Item();
		String temp = "";
		while (tempBackPackIterator.hasNext()) {
			tempI = tempBackPackIterator.next();
			while((!temp.equalsIgnoreCase("yes")) && (!temp.equalsIgnoreCase("no"))) {
				System.out.println("drop this item: " + tempI.getItemName() + " enter yes or no ");
				temp = input.nextLine();
			}//end while
			if (temp.equalsIgnoreCase("yes")) {
				myBackPack.removeItemLisa(tempI);
				myLocation.addItemLisa(tempI);
			}//end if
		}//end while
	}//end drop
	
	/**
	 * inventory prints out the items that are currently in the backpack
	 */
	public void inventory() {
		myBackPack.inventory();
	}//end inventory
	
	/**
	 * use allows the user to use an item
	 */
	public void use() {
		System.out.println("");
		System.out.println("What item do you want to use?");
		ListIterator <Item> myBackPackIterator = myBackPack.backpackLisa.listIterator();
		Item a = new Item();
		Item tempI = new Item();
		String temp = "";
		while (myBackPackIterator.hasNext()) {
			a = myBackPackIterator.next();
			while((!temp.equalsIgnoreCase("yes")) && (!temp.equalsIgnoreCase("no"))) {
				System.out.println("use this item: " + tempI.getItemName() + " enter yes or no ");
				temp = input.nextLine();
			}//end while
			if (temp.equalsIgnoreCase("yes")) {
				System.out.println(a.getItemDescription());
				calculateItemScore(a);
			}//end if
		}//end while
	}//end use
	
	/**
	 * score prints out the user's score (updated)
	 */
	public void score() {
		System.out.println("Your score is " + getScore());
		System.out.println();
	}//end score
	
	/**
	 * calculateScore calculates the points the user earned so far
	 */
	public void calculateScore() {
		int temp = 0;
		temp = getScore() + myLocation.getRoomPoints();
		putScore(temp);
	}//end calculateScore
	
	/**
	 * calculateItemScore calculates the pints earned with the items
	 * @param i
	 */
	public void calculateItemScore(Item i) {
		int temp = 0;
		temp = getScore() + i.getItemPoints();
		putScore(temp);
	}//end calculateItemScore
	
}//end Explorer