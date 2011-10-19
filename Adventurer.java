//megan is my homeboy. Like, totallyz
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
    
    /*findMine()
     * findMine() is the main class for the Excellent Adventure. It completes the problem.
     * preconditions: robot is in the Lost Beeper Mine universe
     * postconditions: robot has picked up all beepers in the Lost Beeper Mine.
     */
    
    public void findMine()
    {
        walkNorth();
        walkEast();
        followTrail();
        walkToWall();
        walkEastToWall();
        followTreasureMapTrail();
        walkForTen();
        followWallRight();
        leftUntilClear();
        afterMazeDilemma();
        pickAllMineBeepers();
    }
    
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
    
    /*followTrail()
     * follows the first trail in the Excellent Adventure.
     * preconditions: robot is one corner away from beeper trail, facing in the direction of the trail.
     * postconditions: robot is at the end of the beeper trail, having picked up all the beepers within it.
     */
    
    public void followTrail()
    {
        move();
        while (!nextToTwoBeepers())
        {
            pickBeeper();
            move();
            if (!nextToABeeper())
            {
                turnAround();
                move();
                turnRight();
                move();
                if (!nextToABeeper())
                {
                    turnAround();
                    move();
                    move();
                }
            }
                    
        }
        pickBeeper();
        pickBeeper();
    }
    
    /*nextToTwoBeppers()
     * determines whether the robot is standing on top of two beepers.
     * preconditions: robot is next to at least one beeper
     * postconditions: the robot has returned true if there are two or more beepers, false if there is 
     * only one
     */
    
    
    public boolean nextToTwoBeepers()
    {
        pickBeeper();
        if (nextToABeeper())
        {
            putBeeper();
            return true;
        }
        else
        {
            putBeeper();
            return false;
        }
    }
    
    /*walkToWall()
     * walks until the robot is one half square away from a wall.
     * pre: none
     * post: robot is one half square away from the nearest wall in the direction it was originall facing.
     * 
     */
    public void walkToWall()
    {
        while (!frontIsClear())
        {
            move();
        }
    }
    
    /*walkEastToWall()
     * turns the robot East, then executes walkToWall()
     * pre: none
     * post: robot is one half square away from the nearest wall east of its original position,
     * regardless of original direction
     * 
     */
    public void walkEastToWall()
    {
        faceEast();
        walkToWall();
    }
    
    /*followTreasureMapTrail()
     * moves the robot according to the treasure map rules stipulated.
     * pre: robot is standing on a corner with at least one beeper
     * post: robot has navigated treasure map trail
     * 
     */
    
    public void followTreasureMapTrail()
    {
        while (!fiveBeepers())
        {
            if (oneBeeper())
            {
                faceNorth();
                while (!nextToABeeper())
                {
                    move();
                }
            }
            
            if (twoBeepers())
            {
                faceWest();
                while (!nextToABeeper())
                {
                    move();
                }
            }
            
            if (threeBeepers())
            {
                faceSouth();
                while (!nextToABeeper())
                {
                    move();
                }
            }
            
            if (fourBeepers())
            {
                faceEast();
                while (!nextToABeeper())
                {
                    move();
                }
            }
        }
    }
    
    /*oneBeeper()
     * checks if there is exactly one beeper on a corner
     */
    
    public boolean oneBeeper()
    {
        for (int i=0; i<1; i++) {pickBeeper();}
        if (nextToABeeper())
        {
            for (int i=0; i<1; i++) {putBeeper();}
            return false;
        }
        else
        {
            for (int i=0; i<1; i++) {putBeeper();}
            return true;
        }
    }
    
    /*twoBeepers()
     * checks if there are exactly two beepers on a corner
     */
    
    public boolean twoBeepers()
    {
        for (int i=0; i<2; i++) {pickBeeper();}
        if (nextToABeeper())
        {
            for (int i=0; i<2; i++) {putBeeper();}
            return false;
        }
        else
        {
            for (int i=0; i<2; i++) {putBeeper();}
            return true;
        }            
    }
    
    /*threeBeepers()
     * checks if there are exactly three beepers on a corner
     */
    
    public boolean threeBeepers()
    {
        for (int i=0; i<3; i++) {pickBeeper();}
        if (nextToABeeper())
        {
            for (int i=0; i<3; i++) {putBeeper();}
            return false;
        }
        else
        {
            for (int i=0; i<3; i++) {putBeeper();}
            return true;
        }            
    }
    
    /*fourBeepers()
     * checks if there are exactly four beepers on a corner
     */
    
    public boolean fourBeepers()
    {
        for (int i=0; i<4; i++) {pickBeeper();}
        if (nextToABeeper())
        {
            for (int i=0; i<4; i++) {putBeeper();}
            return false;
        }
        else
        {
            for (int i=0; i<4; i++) {putBeeper();}
            return true;
        }            
    }
    
    /*fiveBeepers()
     * checks if there are exactly five beepers on a corner
     */
    
    public boolean fiveBeepers()
    {
        for (int i=0; i<5; i++) {pickBeeper();}
        if (nextToABeeper())
        {
            for (int i=0; i<5; i++) {putBeeper();}
            return false;
        }
        else
        {
            for (int i=0; i<5; i++) {putBeeper();}
            return true;
        }            
    }
