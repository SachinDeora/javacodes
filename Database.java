package test;
import java.sql.*;
public class Database
{
	public static void main(String args[])
	{
		try
		{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		System.out.println("Driver loaded");
		}
		catch(ClassNotFoundException e)
		{
			System.out.println("Driver not loaded");
		}
	}	
}