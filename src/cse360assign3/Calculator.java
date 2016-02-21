package cse360assign3;

/** Calculator provides the calculations of 
 *  total as well as add to the history string
 *  
 *  @author[Tyler Wengrzyn]
 *  
 *  @version 2/19/16 
 *  */

public class Calculator {
	
	/** total is the integer being modified 
	 *  through the various commands*/
	private int total;
	
	/** history is the string that keeps 
	 *  track of the commands entered*/
	private String history;
	
	public Calculator() 
	{
		total = 0;
		history = "0";
	}
	
	/** getTotal returns the current value of total*/
	public int getTotal () 
	{
		return total;
	}
	
	/** add increases total by the parameter and adds 
	 *  " + parameter" to the history string*/
	public void add (int value) 
	{
		total = total + value;
		history = history + " + " + value;
	}
	
	/** subtract decreases total by the parameter and adds 
	 *  " - parameter" to the history string*/
	public void subtract (int value) 
	{
		total = total - value;
		history = history + " - " + value;
	}
	
	/** multiply multiplies total by the parameter and adds 
	 *  " * parameter" to the history string*/
	public void multiply (int value) 
	{
		total = total * value;
		history = history + " * " + value;
	}
	
	/** divide divides total by the parameter and adds 
	 *  " / parameter" to the history string*/
	public void divide (int value) 
	{
		total = total / value;
		history = history + " / " + value;
	}
	
	/** getHistory returns the current history string */
	public String getHistory () 
	{
		return history;
	}
}
