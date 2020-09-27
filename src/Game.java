import java.util.*;
import java.io.*;
/**
 * Game creates all the commands necessary to play FSC Adventure Game
 * 
 * @author      Lisa Gentil
 * @version     CSC 2232 Spring 2015 April 23rd
 */
public class Game {
	
	//Creating instances
	private LinkedList <Room> myRoomsLinkedList = new LinkedList <Room> ();
	private Explorer myExplorer = new Explorer();
	private LinkedList <Actor> myActorsLinkedList = new LinkedList <Actor> ();
	private ArrayList <Item> myItemsArrayList = new ArrayList <Item> ();
	private Room myRoom;
	private LinkedList <Room> myStartRoomsLinkedList = new LinkedList <Room> ();
	public Room startRoom;
	private Item myItem;
	private Actor myActor;
	private String response = "";
	private String temp = "";
	private String helpString = "";
	private Backpack myNewBackPack = new Backpack();
	//Creating the scanner 
	Scanner input = new Scanner(System.in);
	
	/**
	 * Game is the constructor. It creates the rooms, actors and items.
	 */
	public Game () {
		//try catch for Rooms
		try {
			FileReader reader = new FileReader("Rooms.txt");
			Scanner fileIn = new Scanner (reader);
			temp = fileIn.next();
			while (!temp.equals("EOF")) {
				myRoom = new Room();
				myRoom.putRoomNumber(fileIn.nextInt());
				myRoom.putRoomToNorth(fileIn.nextInt());
				myRoom.putRoomToSouth(fileIn.nextInt());
				myRoom.putRoomToEast(fileIn.nextInt());
				myRoom.putRoomToWest(fileIn.nextInt());
				myRoom.putRoomPoints(fileIn.nextInt());
				fileIn.next();
				fileIn.nextLine();
				myRoom.putRoomShortDescription(fileIn.nextLine());
				temp = fileIn.nextLine();
				while (!(temp.equals("END"))) {
					myRoom.putRoomLongDescription(temp);
					temp = fileIn.nextLine();
				}//end while
				myRoomsLinkedList.add(myRoom);
				if (myRoom.getRoomNumber() == 0) {
					myExplorer.putLocation(myRoom);
					startRoom = myRoom;
				}//end if
				temp = fileIn.next();
			}//end while
		}//end try
		catch (IOException e) {
			System.out.println("Error processing Rooms.txt file: " + e);
			System.exit(0);
		}//end catch
		
		//try catch for Items
		/*try {
			FileReader reader2 = new FileReader ("Objects.txt");
			Scanner fileIn = new Scanner(reader2);
			temp = fileIn.next();
			while (!(temp.equalsIgnoreCase("EOF"))) {
				myItem = new Item();
				myItem.putItemNumber(fileIn.nextInt());
				myItem.putItemLocation(fileIn.nextInt());
				myItem.putItemDeposLocation(fileIn.nextInt());
				myItem.putItemPoints(fileIn.nextInt());
				myItem.putItemDescription(fileIn.nextLine());
				myItemsArrayList.add(myItem);
				temp = fileIn.nextLine();
				temp = fileIn.next();
			}//end while
		}//end try
		catch (IOException e){
			System.out.println("Error processing Objects.txt file: " + e);
			System.exit(0);
		}//end catch
		*/
		/*
		//try catch for Actors
		try {
            FileReader reader3 = new FileReader ("Actors.txt");
            Scanner fileIn = new Scanner (reader3);
            temp = fileIn.next();
            while (!(temp.equals("EOF"))) {
                myActor = new Actor();
                myActor.putActorNumber(fileIn.nextInt());
                myActor.putActorLocation(fileIn.nextInt());
                myActor.putActorName(fileIn.nextLine());
                myActorsLinkedList.add(myActor);
                temp = fileIn.next();
                temp = fileIn.next();
            }//end while
        }//end try
        catch(IOException e) {
            System.out.println("Error processing Actors.text file:  " + e);
            System.exit(0);
        }//end catch   
		*/
		startRoom = myRoomsLinkedList.get(0);
		myExplorer.putScore(0);
		fillRoomArrays();
	}//end constructor Game
	
	//Creating methods
	/**
	 * fillRoomArrays fills the room with items
	 */
	public void fillRoomArrays() {
		ListIterator <Item> itemIterator = myItemsArrayList.listIterator();
		Item aItem;
		while (itemIterator.hasNext()) {
			aItem = itemIterator.next();
			ListIterator <Room> roomIterator = myRoomsLinkedList.listIterator();
			Room aRoom;
			while (roomIterator.hasNext()) {
				aRoom = roomIterator.next();
				if (aItem.getItemLocation() == aRoom.getRoomNumber())
					aRoom.items.add(aItem);
			}//end while
		}//end while
	}//end fillRoomArrays
	
	/**
	 * clearRoomArrays takes the items off the room
	 */
	public void clearRoomArrays() {
		ListIterator <Room> roomIterator4 = myRoomsLinkedList.listIterator();
		Room aRoom;
		while (roomIterator4.hasNext()) {
			aRoom = roomIterator4.next();
			aRoom.items.clear();
		}//end while
	}//end clearRoomArrays
	
	/**
	 * userInteraction is a loop that continues the game until the user quits
	 */
	public void userInteraction() {
		System.out.println("Project 10: FSC Adventure Game by Lisa Gentil");
		System.out.println("Welcome to FSC Adventure Game!");
		System.out.println("What do you want to do? You can start, quit, or help.");
		response = input.nextLine();
        while (!response.equals("quit")) {
            if (response.equals("start"))
                start();
            else if (response.equals("wait"))
                System.out.println(" ");
            else if (response.equals("look"))
                myExplorer.look();
            else if (response.equals("shortlook"))
                myExplorer.shortLook();
            else if (response.equals("inventory"))
                myExplorer.inventory();
            else if (response.equals("score"))
                myExplorer.score();
            else if ((response.equals("north")) || (response.equals("go north")) || (response.equals("move north")))
                myExplorer.north(myRoomsLinkedList);
            else if ((response.equals("south")) || (response.equals("go south")) || (response.equals("move south")))
                myExplorer.south(myRoomsLinkedList);
            else if ((response.equals("east")) || (response.equals("go east")) || (response.equals("move east")))
                myExplorer.east(myRoomsLinkedList);
            else if ((response.equals("west")) || (response.equals("go west")) || (response.equals("move west")))
                myExplorer.west(myRoomsLinkedList);
            else if (response.equals("move"))
                myExplorer.move(myRoomsLinkedList);
            else if (response.equals("go"))
                myExplorer.go(myRoomsLinkedList);
            else if (response.equals("take"))
                myExplorer.take(myItem);
            else if (response.equals("drop"))
                myExplorer.drop();
            else if (response.equals("use"))
                myExplorer.use();        
            else if (response.equals("help"))
                help();
            else if (response.equals("help help"))
                help("help help");
            else if (response.equals("help start"))
                help("help start");                
            else if (response.equals("help north"))
                help("help north");
            else if (response.equals("help south"))
                help("help south");
            else if (response.equals("help east"))
                help("help east");
            else if (response.equals("help west"))
                help("help west");
            else if (response.equals("help wait"))
                help("help wait");
            else if (response.equals("help go"))
                help("help go");
            else if (response.equals("help move"))
                help("help move");
            else if (response.equals("help quit"))
                help("help quit");
            else if (response.equals("help start"))
                help("help start");
            else if (response.equals("help take"))
                help("help take");
            else if (response.equals("help drop"))
                help("help drop");
            else if (response.equals("help use"))
                help("help use");
            else if (response.equals("help score"))
                help("help score");
            else if (response.equals("help look"))
                help("help look");
            else if (response.equals("help shortlook"))
                help("help shortlook");
            else
                System.out.println("unknown command");
            System.out.println("");    
            System.out.println("What do you want to do?");
            response = input.nextLine();            
        }//end while
        myExplorer.score();
	}//end userInteraction
	
	/**
	 * help prints out the commands available
	 */
	public void help() {
        System.out.println("look:       detail of room");
        System.out.println("shortLook:  name of room");
        System.out.println("north:      causes move to the north");
        System.out.println("south:      causes move to the south");
        System.out.println("east:       causes move to the east");
        System.out.println("west:       causes move to the west");
        System.out.println("move:       asks for a direction");
        System.out.println("go:         asks for a direction");
        System.out.println("take:       puts as object in your backpack");
        System.out.println("drop:       takes an object out of your backpack");
        System.out.println("use:        makes an object perform");
        System.out.println("score:      displays your score");
        System.out.println("wait:       pauses the game");
        System.out.println("quit:       ends the game");
        System.out.println("start:      re-starts the game");
        System.out.println("help:       lists all the commands");
    }//end help
	
	/**
	 * help prints out the commands available 
	 * @param thisString
	 */
	public void help (String thisString) {
		System.out.println("Which command do you need help with? ");
			if (thisString.equals("help look"))
	            System.out.println("look:       detail of room");
	        else if (thisString.equals("help wait"))
	            System.out.println("wait:       pauses");
	        else if (thisString.equals("help quit"))
	            System.out.println("quit:       ends the game");
	        else if (thisString.equals("help start"))
	            System.out.println("start:    re-starts the game");
	        else if (thisString.equals("help shortlook"))
	            System.out.println("shortlook:  name of room");
	        else if (thisString.equals("help north"))
	            System.out.println("north:      causes move to the north");
	        else if (thisString.equals("help south"))
	            System.out.println("south:      causes move to the south");
	        else if (thisString.equals("help east"))
	            System.out.println("east:       causes move to the east");
	        else if (thisString.equals("help west"))
	            System.out.println("west:       causes move to the west");
	        else if (thisString.equals("help move"))
	            System.out.println("move:       asks for a direction");
	        else if (thisString.equals("help go"))
	            System.out.println("go:         asks for a direction in which to go");
	        else if (thisString.equals("help take"))
	            System.out.println("take:       puts as object in your backpack");
	        else if (thisString.equals("help drop"))
	            System.out.println("drop:       takes an object out of your backpack");
	        else if (thisString.equals("help use"))
	            System.out.println("use:        makes an object perform");
	        else if (thisString.equals("help sc"))
	            System.out.println("score:      displays your score");
	        else if (thisString.equals("help help"))
	            System.out.println("help:       help lists all the commnads");
	        else
	            System.out.println("unknown command");
	        System.out.println(" ");
	}//end help
	
	/**
	 * start asks the user if they want to play
	 */
	public void start() {
		System.out.println("Do you want to start again? yes or no");
		String response = "";
		while (!(response.equalsIgnoreCase("yes")) || response.equalsIgnoreCase("no")) {
			response = input.nextLine();
		}//end while
		if (response.equalsIgnoreCase("yes")) {
			myExplorer.putBackPack(myNewBackPack);
			clearRoomArrays();
			fillRoomArrays();
			myExplorer.putLocation(startRoom);
			System.out.println("Begin new Adventure");
			myExplorer.putScore(0);
		}//end if
	}//end start
}//end Game
