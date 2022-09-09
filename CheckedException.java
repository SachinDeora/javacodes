import java.io.*;
public class CheckedException
{
	public static void main(String args[])
	{
		try
		{
			throw new IOException("This is an Io Exceopion");
		}
		catch(IOException e)
		{
			System.out.println("Message is:-"+e.getMessage());
		}
		System.out.println("Program continue..");
		
	}
}