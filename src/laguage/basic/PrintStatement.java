package laguage.basic;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.logging.Logger;

public class PrintStatement {

	public static void main(String[] args) throws FileNotFoundException {
		
		//Print the information and go to the next line.
		System.out.println("Hello, World!");
		
		//Print the information and stay on the same line.
		System.out.print("Hello ");
		System.out.print("World!");
		System.out.println();
		
		//Print the formatted content and stay on the same line.		
		System.out.println("Anusha is completed B.tech, and employee ID is 1234. Her visa status is True");
		System.out.println("Mayuri is completed B.tech, and employee ID is 1235. Her visa status is False");
		System.out.println("Benoy is completed B.tech, and employee ID is 1236. Her visa status is True");
		
		//%s refers to string or text value.
		//%d refers to digit or number.
		//%f refers to decimal point, number with decimals.
		//%b refers to a Boolean value, true or false.
		System.out.printf("%s is completed B.Tech, and employee ID is %d. Her visa status is %b.","Anusha",1234,true);
		System.out.println();
		System.out.printf("%s is completed B.Tech, and employee ID is %d. Her visa status is %b.","Mayuri",1235,false);
		System.out.println();
		System.out.printf("%s is completed B.Tech, and employee ID is %d. Her visa status is %b.","Benoy",1236,true);
		System.out.println();
		
		
		//Print error messages within the java.
		System.err.println("There is an error in line number 27.");
		System.out.println();
		
		//Print the logs.
		Logger logger = Logger.getLogger("Hello World");
		logger.info("There is an information within line number 35. Program is going well");
		System.out.println();
		logger.warning("Hey Bharath, there is a warning. I think something is going wrong in line number 37.");
				
		//Print and export the logs into a text file.
		PrintWriter logs = new PrintWriter("C:\\AutomationTraining\\JavaTraining\\HelloWorld.txt");
		logs.println("Currently, line number 42 is executed successfully.");
		logs.println("Currently, line number 43 is executed successfully.");
		logs.println("Program is successfully completed without any issues.");
		logs.close();

	}

}
