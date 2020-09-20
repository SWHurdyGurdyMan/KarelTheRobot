import stanford.karel.*;

public class KarelTheRobot extends SuperKarel {

	//runs karelMove function while no wall in front of Karel
	public void run() 
	{
		while(frontIsClear()) 
		{
			karelMove();
		}
		
		
	}
	//checks for beeper, if present pick it up
	private void beeperPickup() 
	{
		while(beepersPresent()) 
		{
			pickBeeper();
		}
	}
	//moves karel, checks if middle beeper present, cleans up if not
	private void karelMove() 
	{
		move();
			if(beepersPresent()) 
			{
				move();
			}else{
				beeperPickup();
				turnLeft();
				move();
				beeperPickup();
				turnLeft();
				turnLeft();
				move();
				move();
				beeperPickup();
				turnLeft();
				turnLeft();
				move();
				turnRight();
				move();
				}
	}
	
}