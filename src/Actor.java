/**
 * Actor creates actors and every detail important to the adventure game
 * 
 * @author      Lisa Gentil
 * @version     CSC 2232 Spring 2015 April 9th
 */
public class Actor {

	//Creating the instances
	private String actorName;
	private String actorDescription;
	private int actorLocation;
	private int actorNumber;
	/**
	 * getActorName returns the name of the actor
	 * 
	 * @return		actorName
	 */
	public String getActorName(){
		
		return actorName;
	}//end getActorName
	
	/**
	 * getActorDescription returns the description of the actor
	 * 
	 * @return		actorDescription
	 */
	public String getActorDescription(){
		
		return actorDescription;
	}//end getActorDescription
	
	/**
	 * getLocation returns the location of the actor
	 * 
	 * @return		actorLocation
	 */
	public int getActorLocation(){
		
		return actorLocation;
	}//end getActorLocation
	
	/**
	 * getActorNumber returns the number of the actor
	 * 
	 * @return		actorNumber
	 */
	public int getActorNumber(){
		
		return actorNumber;
	}//end getActorNumber
	
	/**
	 * putActorName assesses a name to the actor
	 * 
	 * @param actorName
	 */
	public void putActorName(String actorName){
		
		this.actorName = actorName;
	}//end putActorName
	
	/**
	 * putActorDescription assesses a description to the actor
	 * 
	 * @param actorDescription
	 */
	public void putActorDescription(String actorDescription){
		
		this.actorDescription = actorDescription;
	}//end putActorDes
	
	/**
	 * putLocation assesses a location to the actor
	 * 
	 * @param actorLocation
	 */
	public void putActorLocation(int actorLocation){
		
		this.actorLocation = actorLocation;
	}//end putActorLocation
	
	/**
	 * putActorNumber assesses the number of the actor
	 * 
	 * @param actorNumber
	 */
	public void putActorNumber(int actorNumber){
		
		this.actorNumber = actorNumber;
	}//end putActorNumber
	
	/**
	 * identify prints out the description of the actor
	 * 
	 */
	public void identify(){
		
		System.out.println(actorDescription);
	}//end identify
	
}//end Actor