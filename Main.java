import java.io.*;
public class Main {

	public static void main(String[] args) 
	{
		File file = new File("Secret.txt");
		
		if(file.exists()) 
		{
			System.out.println("This File Exits!");
		}
		else
		{
			System.out.println("File Does not Exits!");
		}
	/*try 
	{
		FileWriter writer = new FileWriter("Secret.txt");
		writer.write("Hello World \n Its how the file writer function works and i used 'write' to add text");
		writer.append("\n(File Writer)");
		writer.close();
	}
	catch (IOException e)
	{
		e.printStackTrace();
	}*/
	try {
		FileReader reader = new FileReader("Secret.txt");
		int data = reader.read();
		while(data != -1)
		{
			System.out.print((char)data);
			data = reader.read();
		}
		reader.close();
	}
	catch (IOException e)
	{
		e.printStackTrace();
	}
	
}

}	
