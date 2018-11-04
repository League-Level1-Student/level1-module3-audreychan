import java.awt.Color;

import info.gridworld.actor.Bug;
import info.gridworld.actor.Flower;
import info.gridworld.grid.BoundedGrid;
import info.gridworld.grid.Location;
import info.gridworld.world.World;

public class Gridworld {
	
public static void main(String[] args) {
	World<Bug> world = new World<Bug>();
	BoundedGrid<Bug> grid = new BoundedGrid<Bug>(10,10);
	world.setGrid(grid);
	
	Bug bugOne = new Bug();
	Location bugOneLoc = new Location(3, 9);
	Bug bugTwo = new Bug(Color.getHSBColor(173, 87, 91));
	Location bugTwoLoc = new Location(2, 7);
	bugTwo.turn();
	
	Flower flowerOne = new Flower(Color.getHSBColor(245, 47, 100));
	Location flowerOneLoc = new Location(2,6);
	Flower flowerTwo = new Flower(Color.getHSBColor(245, 47, 100));
	Location flowerTwoLoc = new Location(2,8);
	
	world.add(bugOneLoc, bugOne);
	world.add(bugTwoLoc, bugTwo);
	//world.add(flowerOneLoc, flowerOne);
	//world.add(flowerTwoLoc, flowerTwo);
	
	world.show();
}
}
