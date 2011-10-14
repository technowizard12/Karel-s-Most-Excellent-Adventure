import kareltherobot.*;
import java.awt.Color;

/**
* class Main.
* 
* @author
*
*   With assistance from:  people who helped
*
* @version 
*/

class Main implements Directions
{
    // main program    
    public static void main(String [] args)
    {    

        // create a robot (replace with your robot type)
        Adventurer karel = new Adventurer(1, 1, East, 0);
        // pause the robot
        karel.setUserPause(true);
        karel.userPause("start of program");
        
        karel.findMine();
    

    
    }
    
    // intialization 
    static
    {

        // read the world file - modify to read the correct file in worldFilesDos
        // World.readWorld(<filename>);
        // make the world visible, set the delay and show the speed control
        World.setVisible(true);
        // change the delay - smaller to make the robot go faster
        World.setDelay(20);
        // set the size to 10 streets and 10 avenues
        World.setSize(10,10);
        World.showSpeedControl(true);
        // open the world builder
        WorldBuilder myBuilder = new WorldBuilder(true);
        
    }
}