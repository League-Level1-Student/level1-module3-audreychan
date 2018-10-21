
public class Athlete {

     static int nextBibNumber = 1;
     static String raceLocation = "New York";
     static String raceStartTime = "9.00am";

     String name;
     int speed;
     int bibNumber;

Athlete (String name, int speed){
     this.name = name;
     this.speed = speed;
     bibNumber = nextBibNumber;
     nextBibNumber += 1;
}


public static void main(String[] args) {
	Athlete james = new Athlete("James", 5);
	
	System.out.println(james.name);
	System.out.println(james.bibNumber);
	System.out.println(raceLocation);
	Athlete terry = new Athlete("Terry", 4);
	System.out.println(terry.name);
	System.out.println(terry.bibNumber);
	System.out.println(raceLocation);
     //create two athletes      //print their names, bibNumbers, and the location of their race. 
	}
}

