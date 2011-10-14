
import kareltherobot.*;
import java.awt.Color;
/**
 * Adventurer navigates sight-unseen to the lost beeper mine and picks up all the beepers.
 * This class codes to complete the Most Excellent Adventure.
 * 
 * @author <your name here>
 *    With assistance from:  <list of people who helped>
 * @version 
 */
public class Adventurer extends Robot
{
    // constructor for Adventurer
    public Adventurer (int street, int avenue, Direction direction, int beepers)
    {
        super(street, avenue, direction, beepers);
    }
    // methods for class Adventurer
    
    /*walkNorth()
     * walkNorth() moves the robot one space to the North, ending facing North
     * preconditions: Robot is not near a wall directly to the North
     * postconditions: Robot is facing north one space north of its original location
     */
    
    public void walkNorth()
    {
        faceNorth();
        move();
    }
    
     /*walkEast()
     * walkEast() moves the robot one space to the East, ending facing East
     * preconditions:  Robot is not near a wall directly to the East
     * postconditions: Robot is facing east one space east of its original location
     */
    
    public void walkEast()
    {
        faceEast();
        move();
    }
    
    /*faceNorth()
     * faceNorth() turns the robot around until it is facing North
     * preconditions: none
     * postconditions: Robot is facing North
     */
    
    public void faceNorth()
    {
        while (!facingNorth())
        {
            turnLeft();
        }
    }
    
    /*faceEast()
     * faceEast() turns the robot around until it is facing East
     * preconditions: none
     * postconditions: Robot is facing East
     */
    
    public void faceEast()
    {
        while (!facingEast())
        {
            turnLeft();
        }
    }
}
