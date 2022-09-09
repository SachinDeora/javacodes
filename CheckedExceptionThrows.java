import java.io.*;
public class CheckedExceptionThrows
{
	public static void main(String args[]) throws IOException
	{
		throw new IOException();
		//System.out.println("Program Continue");
	}
}