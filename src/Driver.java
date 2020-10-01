import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Driver
{
	public static void main(String[] args) throws FileNotFoundException
	{
		Scanner input = new Scanner(new File(System.getProperty("user.der") + "/src/info.dat"));
		while(input.hasNext())
		{
			BibleBook a = new BibleBook(input.nextLine());
			a.display();
		}
		input.close();
	}
}