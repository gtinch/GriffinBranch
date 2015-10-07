//Griffin Changed This!
package org.usfirst.frc.team2083.robot;
import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.Jaguar;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.livewindow.LiveWindow;
//And This!
/**
 * The VM is configured to automatically run this class, and to call the
 * functions corresponding to each mode, as described in the IterativeRobot
 * documentation. If you change the name of this class or the package after
 * creating this project, you must also update the manifest file in the resource
 * directory.
 */
public class Robot extends IterativeRobot {
	RobotDrive myRobot;
	Joystick stick;
	Jaguar myjRobot;
	int autoLoopCounter;
	
    /**
     * This function is run when the robot is first started up and should be
     * used for any initialization code.
     */
    public void robotInit() {
    	myRobot = new RobotDrive(0,1);
    	myjRobot = new Jaguar (0);
    	stick = new Joystick(0);
    }
    
    /**
     * This function is run once each time the robot enters autonomous mode
     */
    public void autonomousInit() {
    	autoLoopCounter = 0;
    	
    }

    /**
     * This function is called periodically during autonomous
     */
    public void autonomousPeriodic() {
    	if(autoLoopCounter < 1000) //Check if we've completed 100 loops (approximately 2 seconds)
		{
			//myRobot.drive(-0.5, 0.0); 	// drive forwards half speed
    		switch (autoLoopCounter)
    		{
    		
    		case 1: myjRobot.set(-.4);
    		break;
    		case 200: myjRobot.set(-.2);
    		break;
    		case 400: myjRobot.set(0);
    		break;
    		case 600: myjRobot.set(.2);
    		break;
    		case 800: myjRobot.set(.4);
    		break;
    		case 900: myjRobot.set(.7);
    		break;
    		case 999: myjRobot.stopMotor();
    		break;
    		
    		default:
    			break;
    		}
		}
    }
    /**
     * This function is called once each time the robot enters tele-operated mode
     */
    public void teleopInit(){
    }

    /**
     * This function is called periodically during operator control
     */
    public void teleopPeriodic() {
        myRobot.arcadeDrive(stick);
    }
    
    /**
     * This function is called periodically during test mode
     */
    public void testPeriodic() {
    	LiveWindow.run();
    }
    
}
